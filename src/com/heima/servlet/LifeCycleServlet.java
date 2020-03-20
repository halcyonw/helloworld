package com.heima.servlet;

import javax.servlet.*;
import java.io.IOException;

public class LifeCycleServlet implements Servlet {
    public LifeCycleServlet(){
        System.out.println("Servlet类的对象被创建了");
    }
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("servlet类正在初始化");
    }

    @Override
    public ServletConfig getServletConfig() {
       return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("servlet类接受请求");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("serlvet类对象的destroy");
    }
}
