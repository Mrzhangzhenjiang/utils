package com.bd.utils;

import java.util.regex.Pattern;

public class StringUtil {
	public static boolean hasLength(String teststring){
		if(teststring.length()==0){
			return false;
		}else{
			return true;
		}
	}
	public static boolean hasText(String teststring){
		String reg_teststring="\\s*";
		if(teststring.length()==0){
			return false;
		}else{
			boolean matches = Pattern.matches(reg_teststring, teststring);
			if(matches==true){
				return false;
			}else{
				return true;
			}
		}
	}
	public static boolean isMobile(String teststring){
		String reg_teststring="^1[3|4|5|8]\\d{9}$";
		boolean matches = Pattern.matches(reg_teststring, teststring);
		if(matches==true){
			return true;
		}else{
			return false;
		}
	}
	public static boolean isEmail(String teststring){
		String reg_teststring="^[0-9a-zA-Z]+@(\\w)+(\\.)(com|cn|net|edu|com(\\.)cn)$";
		boolean matches = Pattern.matches(reg_teststring, teststring);
		if(matches==true){
			return true;
		}else{
			return false;
		}
	}
	public static String reverse(String teststring){
		StringBuilder build=new StringBuilder(teststring);
		return build.reverse().toString();
	}
	public static String reverse1(String teststring){
		String midstring="";
		for(int i=teststring.length()-1;i>=0;i--){
			midstring+=String.valueOf(teststring.charAt(i));
		}
		return midstring;
	}
}
