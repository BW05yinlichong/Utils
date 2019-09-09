package com.yinlichong.test;



import org.junit.Test;

import com.yinlichong.utils.StringUtils;

/**
 * @author ����:Yinlichong
 * @version ����ʱ�䣺2019��9��6�� ����9:21:09 �๦��˵��
 */
public class TestStringUtils {

	@Test
	public void testTel() {
		String tel = "18724192985";
		String te2 = "15751704806";
		boolean a = StringUtils.isTelephone(tel);
		boolean b = StringUtils.isTelephone(te2);
		System.out.println("a=" + a);
		System.out.println("b=" + b);
	}

	@Test
	public void testEmail() {
		String tel = "1363307209@163.com";
		String te2 = "1894564565@com.conmnii";
		boolean a = StringUtils.isEmail(tel);
		boolean b = StringUtils.isEmail(te2);
		System.out.println("a=" + a);
		System.out.println("b=" + b);
	}

	@Test
	public void testLetter() {
		String tel = "dsaih";
		String te2 = "dshuifisdf";
		boolean a = StringUtils.isLetter(tel);
		boolean b = StringUtils.isLetter(te2);
		System.out.println("a=" + a);
		System.out.println("b=" + b);
	}
//�Ƿ�Ϊ��
	@Test
	public void testEmpty() {
		String tel = "";
		String te2 = "dshuifisdf";
		String te3 = null;
		String te4 = "   ";
		boolean a = StringUtils.isEmpty(tel);
		boolean b = StringUtils.isEmpty(te2);
		boolean c = StringUtils.isEmpty(te3);
		boolean d = StringUtils.isEmpty(te4);
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		System.out.println("c=" + c);
		System.out.println("d=" + d);
	}
//�Ƿ���ֵ
	@Test
	public void testIsHasValue() {
		String tel = "";
		String te2 = "dshuifisdf";
		String te3 = null;
		String te4 = "   ";
		boolean a = StringUtils.isHasValue(tel);
		boolean b = StringUtils.isHasValue(te2);
		boolean c = StringUtils.isHasValue(te3);
		boolean d = StringUtils.isHasValue(te4);
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		System.out.println("c=" + c);
		System.out.println("d=" + d);
	}
	 //�����ȡӢ����ĸ������
	@Test
	public void testRan() {
		int n = 10;
		String str = StringUtils.randomStr(n);
		System.out.println(str);

	}
     //�����ȡӢ����ĸ
	@Test
	public void testRanzm() {
		int n = 10;
		String str = StringUtils.randomLetterStr(n);
		System.out.println(str);
	}
    //�����ȡ������ĸ
	@Test
	public void testzwzm() {
		int n = 10;
		String str = StringUtils.getRandonCnStr(n);
		System.out.println(str);

	}
	
	@Test
	public void testHtml() {
		String str = "kthsdfkjfs \\n  ��Ƭ���۽��߶����� \\n A��Ƭ���� \\n ���߶����� A��Ƭ��\\n�۽��߶����� A��Ƭ���۽��߶����� A��Ƭ���۽��߶����� A";
		String html = StringUtils.toHtml(str);
		System.out.println("html is " + html);
		
	}
	@Test
	public void testisNumber() {
		System.out.println(" 234 :" + StringUtils.isNumber("234"));
		System.out.println(" 2.34 :" + StringUtils.isNumber("2.34"));
		System.out.println(" . :" + StringUtils.isNumber("."));
		System.out.println(" avc :" + StringUtils.isNumber("abc"));
		
		
	}
	
	@Test
	public void testHastext() {
		
		System.out.println(" 1:" + StringUtils.hasText("   "));
		System.out.println(" 2:" + StringUtils.hasText("  f  f "));
		System.out.println(" 3:" + StringUtils.hasText("  			 "));
		
	}

}
