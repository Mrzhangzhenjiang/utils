package com.bd.utils;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Set;

import org.junit.Test;

public class RandomNumberUtilTest {

	@Test
	public void testGetOneNumber() {
		for(int i=0;i<=10;i++) {
			int number = RandomNumberUtil.getOneNumber(0, 10);
			System.out.println(number);
		}
	}
	@Test
	public void testgetNoRepeatNumbers() {
		for(int k=0;k<=10;k++) {
			Set set = RandomNumberUtil.getNoRepeatNumbers(1, 10, 3);
			System.out.println(set);
		}
	}
	@Test
	public void testgetOneRandomString() {
		for(int i=0;i<10;i++) {
			String string = RandomNumberUtil.getOneRandomString();
			System.out.println(string);
		}
	}
	@Test
	public void testgetOneRandomString2() {
		for(int i=0;i<10;i++) {
			String string = RandomNumberUtil.getOneRandomString(4);
			System.out.println(string);
		}
	}
}
