package com.witt.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author witt
 * @fileName GlobalFilter
 * @date 2018/6/4 01:06
 * <p>
 * @description </p>
 * @history <author>    <time>    <version>    <desc>
 */

public class GlobalFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("GlobalFilter:" + request.getServletContext().getContextPath());
        chain.doFilter(request,response);
    }

    @Override
    public void destroy() {

    }
}
