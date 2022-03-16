package com.okdevtv.tdd.hello2;

import java.text.NumberFormat;
import java.util.Locale;

public class StringUtils {
	public static String comma(int num) {
		String string = NumberFormat.getNumberInstance(Locale.US).format(num);
		return string;
	}
}
