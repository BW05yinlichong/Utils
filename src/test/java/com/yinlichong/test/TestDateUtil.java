package com.yinlichong.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import com.yinlichong.utils.DateUtils;

/** 
 * @author 作者:yinlichong
 * @version 创建时间：2019年9月6日 下午8:22:33
 * 类功能说明 
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
