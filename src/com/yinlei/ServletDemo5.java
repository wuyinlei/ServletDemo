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
 * ��ʾ��ӦͷContent-Disposition ��ʾ�����صķ�ʽ��
 */
@WebServlet("/ServletDemo5")
public class ServletDemo5 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// �õ�ͼƬ��·��
		String path = this.getServletContext().getRealPath("/WEB-INF/classes/bg2.jpg");
		System.out.println(path);

		// ����һ������������
		FileInputStream is = new FileInputStream(path);

		byte[] bs = new byte[1024];
		int b = 0;

		// ����һ�����������
		ServletOutputStream os = response.getOutputStream();
		
		//֪ͨ��������Ҫֱ����ʾ������Ҫ������������ʾ
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
