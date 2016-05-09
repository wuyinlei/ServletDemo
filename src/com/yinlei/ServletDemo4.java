package com.yinlei;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletDemo5
 * ��ʾRefresh��Ӧͷ
 */
@WebServlet("/ServletDemo5")
public class ServletDemo4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//��һ��ʱ��ˢ���Լ�
		//response.setHeader("Refresh", "2");
		//response.getWriter().write("aa"+new Random().nextInt());
		
		//��һ��ʱ��ˢ��������Դ
		response.setHeader("Refresh", "2;url=/Test01/ServletDemo");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
