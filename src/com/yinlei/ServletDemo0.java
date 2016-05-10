package com.yinlei;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
//@WebServlet("/ServletDemo0") 

/**
| ������     | ����       | ������
| ------- | ------- |-------
| name	| String	| ָ�� Servlet �� name ���ԣ��ȼ��� <servlet-name>�����û����ʽָ������� Servlet ��ȡֵ��Ϊ���ȫ�޶�����
| value	| String[]	|�����Եȼ��� urlPatterns ���ԡ��������Բ���ͬʱʹ�á�
| urlPatterns��| String[]	| ָ��һ�� Servlet �� URL ƥ��ģʽ���ȼ��� <url-pattern> ��ǩ��
| loadOnStartup	| int	| ָ�� Servlet �ļ���˳�򣬵ȼ��� <load-on-startup> ��ǩ��
| initParams	| WebInitParam[]	| ָ��һ�� Servlet ��ʼ���������ȼ��� <init-param> ��ǩ��
| asyncSupported	| boolean	| ���� Servlet �Ƿ�֧���첽����ģʽ���ȼ��� <async-supported> ��ǩ��
| description	| String	| �� Servlet ��������Ϣ���ȼ��� <description> ��ǩ��
| displayName	| String	| �� Servlet ����ʾ����ͨ����Ϲ���ʹ�ã��ȼ��� <display-name> ��ǩ��
 *
 */
/*@WebServlet(urlPatterns = {"/simple"}, asyncSupported = true, 
loadOnStartup = -1, name = "SimpleServlet", displayName = "ss", 
initParams = {@WebInitParam(name = "username", value = "tom")} 
)*/ 
@WebServlet(urlPatterns={"/ServletDemo0"},loadOnStartup=-1)
//loadOnStartup   �涨����ʲôʱ������
public class ServletDemo0 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * http://www.ibm.com/developerworks/cn/java/j-lo-servlet30/#major3
	 * Servlet3.0������
	 */
    public ServletDemo0() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("������");
		//�����ض���
		response.setStatus(302);
		//ת�õ�������url
		response.setHeader("Location", "/Test01/ServletDemo1");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
