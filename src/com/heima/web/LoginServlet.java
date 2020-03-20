package com.heima.web;

import com.heima.service.LoginService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author buguniao
 * @version v1.0
 * @date 2020/3/15 21:01
 * @description TODO
 **/
@WebServlet(urlPatterns = "/loginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.接受请求
        response.setHeader("refresh","3;http://www.baidu.com");
        String userName = request.getParameter("username");
        String passWord = request.getParameter("password");
        System.out.println(userName);
        System.out.println(passWord);
        //2.处理业务
        LoginService Service = new LoginService();
      Boolean result=Service.login(userName, passWord);
        //3.进行响应
        System.out.println(result);
            if(result){


           // request.getRequestDispatcher("/success.html").forward(request,response);
                response.sendRedirect("/success.html");

        }else {
           // request.getRequestDispatcher("/error.html").forward(request,response);
                response.sendRedirect("/error.html");
        }
    }
}
