package com.yinlei;

import java.io.IOException;
import java.util.zip.GZIPOutputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.fileupload.ByteArrayOutputStream;

/**
 * Servlet implementation class ServletDemo2
 */
public class ServletDemo2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ServletDemo2() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String s = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
				+ "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
				+ "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
				+ "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
		
		byte[] bs = s.getBytes();
		System.out.println("ѹ��ǰ�ĳ��ȣ�"+bs.length);
		//����һ���ֽ����������
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		//ϣ����gzipѹ��һ�·���
		//����һ��ѹ��������װ�������
		GZIPOutputStream gzip = new GZIPOutputStream(baos);
		//�����ݽ���ѹ��
		gzip.write(bs);
		gzip.close();
		bs = baos.toByteArray();  //ѹ���������
		System.out.println("ѹ����ĳ��ȣ�" + bs.length);
		
		//֪ͨ���������͵����ݸ�ʽ��gzip
		response.setHeader("Content-Encoding", "gzip");
		response.getOutputStream().write(bs);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
