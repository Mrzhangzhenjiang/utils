package com.bd.utils;

import org.junit.Test;

public class StringUtilTest {

	@Test
	public void testHasLength() {
		boolean flag = StringUtil.hasLength("");
		System.out.println(flag);
	}

	@Test
	public void testHasText() {
		boolean flag = StringUtil.hasText(" ");
		System.out.println(flag);
	}

	@Test
	public void testIsMobile() {
		boolean flag = StringUtil.isMobile("18738800139");
		System.out.println(flag);
	}

	@Test
	public void testIsEmail() {
		boolean flag = StringUtil.isEmail("23951328063@qq.com");
		System.out.println(flag);
	}

	@Test
	public void testReverse() {
		String result = StringUtil.reverse("abc");
		System.out.println(result);
	}

	@Test
	public void testReverse1() {
		String result = StringUtil.reverse1("123");
		System.out.println(result);
	}

}
