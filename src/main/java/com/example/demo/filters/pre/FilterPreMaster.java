package com.example.demo.filters.pre;

import com.example.demo.util.FilterType;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

import javax.servlet.http.HttpServletRequest;

public class FilterPreMaster extends ZuulFilter {

    @Override
    public String filterType() {
        return FilterType.PRE_TYPE;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();

        String requestURI = request.getRequestURI();
        var makeAuthenticate = requestURI.contains("oauth");

        if (makeAuthenticate) {
            //metodoautenticar
        }

        if (shouldExecuteFilter1(request)) {
            request.setAttribute("executeFilter1", true);
        }

        if (shouldExecuteFilter2(request)) {
            request.setAttribute("executeFilter2", true);
        }

        return ctx;
    }

    private boolean shouldExecuteFilter1(HttpServletRequest request) {
        String requestURI = request.getRequestURI();
        return requestURI.contains("fourth");

    }

    private boolean shouldExecuteFilter2(HttpServletRequest request) {
        String requestURI = request.getRequestURI();
        return requestURI.contains("fifth");
    }


}
