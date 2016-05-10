package com.yinlei;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletDemo6
 * ��ʾ��ӦͷExpires(���߷�������Ҫ����)
 */
@WebServlet("/ServletDemo6")
public class ServletDemo6 extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//֪ͨ��������Ҫ����
		response.setHeader("Expires", "-1");
		//�������µ����䣬�ڴε������ʱ��ȥ������������һ��������֤��
		//�汾1.1
		response.setHeader("Cache-Control","no-cache");
		//�汾1.0
		response.setHeader("Pragma","no-cache");
		response.getWriter().write("hello world!");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
