package com.example.demo.filters.pre;

import com.example.demo.util.FilterType;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;

public class FilterPreOne extends ZuulFilter {

    Logger log = LoggerFactory.getLogger(FilterPreOne.class);

    @Override
    public boolean shouldFilter() {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        return (request.getAttribute("executeFilter1") != null && ((Boolean) request.getAttribute("executeFilter1")));
    }

    @Override
    public String filterType() {
        return FilterType.PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        log.info("------ New Request type 1 ------");
        log.info("Server: {} Metodo: {} Path: {}", ctx.getRequest().getServerName(), ctx.getRequest().getMethod(),
                ctx.getRequest().getRequestURI());
        Enumeration<String> enume = ctx.getRequest().getHeaderNames();
        String header;
        while (enume.hasMoreElements()) {
            header = enume.nextElement();
            log.info("Headers:{} = {}", header, ctx.getRequest().getHeader(header));
        }
        log.info("------------------------------");
        return ctx;
    }

}