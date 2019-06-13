package com.bd.utils;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class DateUtilTest {

	@Test
	public void testGetDateByInitMonth() {
		Date dateByInitMonth = DateUtil.getDateByInitMonth(new Date());
		SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String result = df.format(dateByInitMonth);
		System.out.println(result);
	}
	@Test
	public void testgetDateByFullMonth() {
		Date dateByInitMonth = DateUtil.getDateByFullMonth(new Date());
		SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String result = df.format(dateByInitMonth);
		System.out.println(result);
	}
	@Test
	public void testgetDateByMonthDiff() {
		Date dateByMonthDiff = DateUtil.getDateByMonthDiff(4);
		SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String result = df.format(dateByMonthDiff);
		System.out.println(result);
	}
	@Test
	public void testDate() {
		Date dateByInitMonth = DateUtil.getDateByInitMonth(new Date());
		Date dateByFullMonth = DateUtil.getDateByFullMonth(new Date());
		SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String sql = "select * from t_order where create_time>='{1}' and create_time<='{2}' ";
		String result = sql.replace("{1}", df.format(dateByInitMonth)).replace("{2}", df.format(dateByFullMonth));
		System.out.println(result);
	}
}
