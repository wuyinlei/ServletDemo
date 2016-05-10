package com.yinlei;

import java.io.FileInputStream;
import java.io.IOException;

import javax.jws.WebService;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletDemo5 
 * 演示响应头Content-Disposition 表示以下载的方式打开
 */
@WebServlet("/ServletDemo5")
public class ServletDemo5 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 拿到图片的路径
		String path = this.getServletContext().getRealPath("/WEB-INF/classes/bg2.jpg");
		System.out.println(path);

		// 创建一个输入流对象
		FileInputStream is = new FileInputStream(path);

		byte[] bs = new byte[1024];
		int b = 0;

		// 创建一个输出流对象
		ServletOutputStream os = response.getOutputStream();
		
		//通知游览器不要直接显示，而是要下载下来在显示
		response.setHeader("Content-Disposition", "attachment;filename=bg2.jpg");

		while ((b = is.read(bs)) != -1) {
			os.write(bs, 0, b);
		}

		is.close();
		os.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
