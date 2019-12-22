package com.example.demo.filters.pos;

import com.example.demo.filters.pre.FilterOne;
import com.example.demo.util.FilterType;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;

import javax.servlet.http.HttpServletResponse;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

public class FilterPosMaster extends ZuulFilter {

    Logger log = LoggerFactory.getLogger(FilterPosMaster.class);

    @Override
    public String filterType() {
        return FilterType.POST_TYPE;
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        RequestContext ctx = RequestContext.getCurrentContext();
        return ctx.getResponseStatusCode() != HttpServletResponse.SC_OK;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext ctx = RequestContext.getCurrentContext();
        ctx.setSendZuulResponse(false);
        ctx.setResponseStatusCode(HttpServletResponse.SC_OK);
        ctx.getResponse().setHeader(HttpHeaders.CONTENT_TYPE, "application/json");
        ctx.getResponse().setCharacterEncoding("UTF-8");

        log.info(String.valueOf(ctx.getResponse().getStatus()));

        return ctx;
    }
}
