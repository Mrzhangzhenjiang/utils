package com.bd.utils;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;

public class FileUtilTest {

	@Test
	public void testGetTempDirectory() {
		File file = FileUtil.getTempDirectory();
		System.out.println(file);
	}
	@Test
	public void testgetUserDirectory() {
		File file = FileUtil.getUserDirectory();
		System.out.println(file);
	}

}
