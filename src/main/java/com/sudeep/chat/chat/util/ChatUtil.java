package com.sudeep.chat.chat.util;

import java.util.Calendar;
import java.util.Date;

public class ChatUtil {

	private ChatUtil() {

	}

	public static Date getTime(int timeout) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		calendar.add(Calendar.SECOND, timeout);

		Date d = calendar.getTime();
		return d;
	}

}
