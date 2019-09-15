package com.yinlichong.test;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.junit.Test;

import com.yinlichong.utils.FileUtil;
import com.yinlichong.utils.StringUtils;


/** 
 * @author 作者:YinLiChong
 * @version 创建时间：2019年9月14日下午8:42:42
 * 类功能说明 
 */
public class TestFileUtil {
	/*
	 * String str="asd爱上的我去\\\r大神发\n大神夫人为ver饿的我\n"; String html =
	 * StringUtils.toHtml(str); System.out.println(html);
	 */
	@Test
	public void tohtml() {
		String str = "稍等哈\r\n和健康\n大家哈\r和对啊撒\n";
		String html = StringUtils.toHtml(str);
		System.out.println();
		System.out.println(html);
	}

	@Test
	public void testFileToBean() throws NoSuchMethodException,
			SecurityException, InstantiationException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException, IOException {
		String fileNameString = "D:\\JAVA\\javaToStudent\\新建文件夹\\Utils\\src\\main\\resources\\reginfo";
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
