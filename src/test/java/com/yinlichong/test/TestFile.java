package com.yinlichong.test;

import java.util.Properties;

import org.junit.Test;

import com.yinlichong.utils.FileUtil;

/** 
 * @author ����:Yinlichong
 * @version ����ʱ�䣺2019��9��6�� ����8:24:02
 * �๦��˵�� 
 */
public class TestFile {


	@Test
	public void testDel() {
		FileUtil.delFilePath("D:\\ec4 - ����");
	}
	
	
	@Test
	public void TestPro() {
		
		Properties properties = System.getProperties();
		
		properties.forEach((key,value)->{
			System.out.println("key is : " + key);
			System.out.println("value is : " + value);
		});
	}
}
