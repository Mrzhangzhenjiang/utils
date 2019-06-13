package com.bd.utils;

import java.io.File;

public class FileUtil {
	public static File getTempDirectory() {
		String file = System.getProperty("java.io.tmpdir");
		return new File(file);
	}
	public static File getUserDirectory() {
		String file = System.getProperty("user.home");
		return new File(file);
	}
}
