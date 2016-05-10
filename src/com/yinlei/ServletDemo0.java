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
| 属性名     | 类型       | 　描述
| ------- | ------- |-------
| name	| String	| 指定 Servlet 的 name 属性，等价于 <servlet-name>。如果没有显式指定，则该 Servlet 的取值即为类的全限定名。
| value	| String[]	|该属性等价于 urlPatterns 属性。两个属性不能同时使用。
| urlPatterns　| String[]	| 指定一组 Servlet 的 URL 匹配模式。等价于 <url-pattern> 标签。
| loadOnStartup	| int	| 指定 Servlet 的加载顺序，等价于 <load-on-startup> 标签。
| initParams	| WebInitParam[]	| 指定一组 Servlet 初始化参数，等价于 <init-param> 标签。
| asyncSupported	| boolean	| 声明 Servlet 是否支持异步操作模式，等价于 <async-supported> 标签。
| description	| String	| 该 Servlet 的描述信息，等价于 <description> 标签。
| displayName	| String	| 该 Servlet 的显示名，通常配合工具使用，等价于 <display-name> 标签。
 *
 */
/*@WebServlet(urlPatterns = {"/simple"}, asyncSupported = true, 
loadOnStartup = -1, name = "SimpleServlet", displayName = "ss", 
initParams = {@WebInitParam(name = "username", value = "tom")} 
)*/ 
@WebServlet(urlPatterns={"/ServletDemo0"},loadOnStartup=-1)
//loadOnStartup   规定服务什么时候启动
public class ServletDemo0 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * http://www.ibm.com/developerworks/cn/java/j-lo-servlet30/#major3
	 * Servlet3.0新特性
	 */
    public ServletDemo0() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("我来了");
		//进行重定向
		response.setStatus(302);
		//转置到其他的url
		response.setHeader("Location", "/Test01/ServletDemo1");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
