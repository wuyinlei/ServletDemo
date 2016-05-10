package com.yinlei;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletDemo6
 * 演示响应头Expires(告诉服务器不要缓存)
 */
@WebServlet("/ServletDemo6")
public class ServletDemo6 extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//通知游览器不要缓存
		response.setHeader("Expires", "-1");
		//有了以下的两句，在次的请求的时候，去服务器来看，一般用于验证码
		//版本1.1
		response.setHeader("Cache-Control","no-cache");
		//版本1.0
		response.setHeader("Pragma","no-cache");
		response.getWriter().write("hello world!");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
