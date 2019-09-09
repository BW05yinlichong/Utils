package com.yinlichong.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import com.yinlichong.utils.DateUtils;

/** 
 * @author ����:yinlichong
 * @version ����ʱ�䣺2019��9��6�� ����8:22:33
 * �๦��˵�� 
 */
public class TestDateUtil {

	@Test
	public void testLastDate() throws ParseException {
		
		Date end = DateUtils.getMonthEnd(new Date());
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(" end is " + end );
		System.out.println(" end is " + format.format(end) );
		
	}
}
