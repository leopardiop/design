package com.java.servlet.filter;

import com.java.servlet.GetHttpServletRequestWrapper;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class MyFilter2 implements Filter {
    private FilterConfig filterConfig;

    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("Filter initialized2");
        this.filterConfig = filterConfig;
    }

    public void destroy() {
        System.out.println("Filter destroyed2");
        this.filterConfig = null;
    }

    public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain chain) throws IOException, ServletException {

        System.out.println("--------------doFilter2-------------------------");

        HttpServletRequest req = new GetHttpServletRequestWrapper((HttpServletRequest) request);

        req.setAttribute("a","a");

        chain.doFilter(req,response);
    }
}