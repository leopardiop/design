package com.java.servlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

/**
 * Created by peng.luwei on 2014/11/16.
 */
public class MyRequestWrapper extends HttpServletRequestWrapper {
    /**
     * Constructs a request object wrapping the given request.
     *
     * @param request
     * @throws IllegalArgumentException if the request is null
     */
    public MyRequestWrapper(HttpServletRequest request) {
        super(request);
    }

    public String[] getParameterValues(String parameter) {
        String[] results = super.getParameterValues(parameter);

        if (results == null)
            return null;
        int count = results.length;
        String[] trimResults = new String[count];
        for (int i = 0; i < count; i++) {
            trimResults[i] = results[i].trim();
            System.out.println("trimResults = " + trimResults[i]);
        }
        return trimResults;
    }
}
