package com.yinlichong.utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;

/** 
 * @author ����:Yinlichong
 * @version ����ʱ�䣺2019��9��6�� ����8:11:12
 * �๦��˵�� 
 */
public class StreamUtils {

	/**
	 * �ر���
	 * @param closeables
	 * @throws IOException 
	 */
	public static void closeStream(Closeable ...closeables) throws IOException {
		for (Closeable closeable : closeables) {
			closeable.close();
		}
		
	}
	
	/**
	 * ������
	 * @param is
	 * @param os
	 * @throws IOException 
	 */
	public static void copyStream(InputStream is,OutputStream os) throws IOException {
		
		byte b[] = new byte[1024];
		while(is.read(b)>0) {
			os.write(b);
		}
		//ˢ��
		os.flush();
		
	}
	
	/**
	 * ���ж�ȡ�ı��ļ�
	 * @param filename
	 */
    public static void ReadFileByLine(String filename) {
        File file = new File(filename);
        InputStream is = null;
        Reader reader = null;
        BufferedReader bufferedReader = null;
        try {
            is = new FileInputStream(file);
            reader = new InputStreamReader(is);
            bufferedReader = new BufferedReader(reader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != bufferedReader)
                    bufferedReader.close();
                if (null != reader)
                    reader.close();
                if (null != is)
                    is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
	 * ���ֽڶ�ȡ�ļ�
	 * 
	 * @param filename
	 */
	public static void ReadFileByBytes(String filename) {
		File file = new File(filename);
		InputStream is = null;
		try {
			is = new FileInputStream(file);
			int index = 0;
			while (-1 != (index = is.read())) {
				System.out.write(index);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (null != is)
					is.close();

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("-----------------------------------");
		try {
			is = new FileInputStream(file);
			byte[] tempbyte = new byte[1000];
			int index = 0;
			while (-1 != (index = is.read(tempbyte))) {
				System.out.write(tempbyte, 0, index);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (null != is)
					is.close();

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * ���ַ���ȡ�ļ�
	 * 
	 * @param filename
	 */
	public static void ReadFileByChar(String filename) {
		File file = new File(filename);
		InputStream is = null;
		Reader isr = null;
		try {
			is = new FileInputStream(file);
			isr = new InputStreamReader(is);
			int index = 0;
			while (-1 != (index = isr.read())) {
				System.out.print((char) index);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (null != is)
					is.close();
				if (null != isr)
					isr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * ͨ��BufferedWriterд�ļ�
	 * 
	 * @param filename
	 */
	public static void Write2FileByBuffered(String filename) {
		File file = new File(filename);
		FileOutputStream fos = null;
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;
		try {
			if (!file.exists()) {
				file.createNewFile();
			}
			fos = new FileOutputStream(file);
			osw = new OutputStreamWriter(fos);
			bw = new BufferedWriter(osw);
			bw.write("Write2FileByBuffered");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (null != bw) {
				try {
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (null != osw) {
				try {
					osw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (null != fos) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	/**
	 * ͨ��FileWriterд�ļ�
	 * 
	 * @param filename
	 */
	public static void Write2FileByFileWriter(String filename) {
		File file = new File(filename);
		FileWriter fw = null;
		try {
			if (!file.exists()) {
				file.createNewFile();
			}
			fw = new FileWriter(file);
			fw.write("Write2FileByFileWriter");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (null != fw) {
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}


}
