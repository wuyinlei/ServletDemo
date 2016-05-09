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
		System.out.println("压缩前的长度："+bs.length);
		//创建一个字节数组输出流
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		//希望用gzip压缩一下发送
		//创建一个压缩流，包装了输出流
		GZIPOutputStream gzip = new GZIPOutputStream(baos);
		//将数据进行压缩
		gzip.write(bs);
		gzip.close();
		bs = baos.toByteArray();  //压缩后的数据
		System.out.println("压缩后的长度：" + bs.length);
		
		//通知游览器发送的数据格式是gzip
		response.setHeader("Content-Encoding", "gzip");
		response.getOutputStream().write(bs);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
