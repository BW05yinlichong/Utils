package com.yinlichong.test;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.junit.Test;

import com.yinlichong.utils.FileUtil;
import com.yinlichong.utils.StringUtils;


/** 
 * @author ����:YinLiChong
 * @version ����ʱ�䣺2019��9��14������8:42:42
 * �๦��˵�� 
 */
public class TestFileUtil {
	/*
	 * String str="asd���ϵ���ȥ\\\r����\n�������Ϊver������\n"; String html =
	 * StringUtils.toHtml(str); System.out.println(html);
	 */
	@Test
	public void tohtml() {
		String str = "�Եȹ�\r\n�ͽ���\n��ҹ�\r�Ͷ԰���\n";
		String html = StringUtils.toHtml(str);
		System.out.println();
		System.out.println(html);
	}

	@Test
	public void testFileToBean() throws NoSuchMethodException,
			SecurityException, InstantiationException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException, IOException {
		String fileNameString = "D:\\JAVA\\javaToStudent\\�½��ļ���\\Utils\\src\\main\\resources\\reginfo";
		List list = FileUtil.fileToBean(fileNameString, RegisterInfo.class
				.getConstructor(String.class, String.class, String.class,
						String.class, String.class, String.class, String.class,
						String.class, String.class, String.class

				));

		System.out.println("list is " + list);
		for (int i = 0; i < list.size(); i++) {
			System.out.println("list is " + list.get(i));
			//rgServie.add((RegisterInfo)list.get(i));
		}

	}
}
