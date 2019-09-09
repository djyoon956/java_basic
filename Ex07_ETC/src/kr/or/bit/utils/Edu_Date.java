package kr.or.bit.utils;

import java.util.Calendar;

public class Edu_Date {
	public static String DateString(Calendar calendar) {
		return calendar.get(Calendar.YEAR) + "년" + (calendar.get(Calendar.MONTH) + 1) + "월"
				+ calendar.get(Calendar.DATE) + "일";
	}

	public static String DateString(Calendar calendar, String opr) {
		return calendar.get(Calendar.YEAR) + opr + (calendar.get(Calendar.MONTH) + 1) + opr
				+ calendar.get(Calendar.DATE) + opr;
	}

	// 2019-1-12
	public static String MonthFormat_DateString(Calendar calendar) {
		String result = String.format("%d-%02d-%d", calendar.get(Calendar.YEAR), (calendar.get(Calendar.MONTH) + 1),
				calendar.get(Calendar.DATE));
		return result;
	}

}
