package com.java.servlet.filter;

import com.java.servlet.GetHttpServletRequestWrapper;
import com.java.servlet.MyRequestWrapper;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class MyFilter implements Filter {
    private FilterConfig filterConfig;

    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("Filter initialized");
        this.filterConfig = filterConfig;
    }

    public void destroy() {
        System.out.println("Filter destroyed");
        this.filterConfig = null;
    }

    public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain chain) throws IOException, ServletException {

        System.out.println("--------------doFilter-------------------------");

        HttpServletRequest req = new GetHttpServletRequestWrapper((HttpServletRequest) request);

        req.setAttribute("a","a");

        chain.doFilter(req,response);
    }
}