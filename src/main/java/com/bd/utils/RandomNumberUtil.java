package com.bd.utils;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomNumberUtil {
	//输入一个区间取出一个随机数
	public static int getOneNumber(int min,int max) {
		Random random=new Random();
		int i = random.nextInt(max-min+1);
		return i+min;
	}
	//输入一个区间以及想要的随机数个数  生成指定个数的随机数（不重复）
	public static Set<Integer> getNoRepeatNumbers(int min,int max,int number) {
		Set<Integer> set=new HashSet<Integer>();
		while(set.size()!=number) {
			Random random=new Random();
			set.add(random.nextInt(max-min+1)+min);
		}
		return set;
	}
	//获取 1个 1-9,a-Z之间的随机字符
	public static String getOneRandomString() {
		String src="123456789zxcvbnmasdfghjklqwertyuiopZXCVBNMASDFGHJKLQWERTYUIOP";
		char result = src.charAt(getOneNumber(0, src.length()-1));
		return result+"";
	}
	//返回参数指定个数的随机字符串(应用场景如：验证码)
	public static String getOneRandomString(int number) {
		String src="123456789zxcvbnmasdfghjklqwertyuiopZXCVBNMASDFGHJKLQWERTYUIOP";
		String midstring="";
		for(int i=0;i<number;i++) {
			String string = getOneRandomString();
			midstring+=string;
		}
		return midstring;
	}
}
