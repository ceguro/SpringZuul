package com.example.demo.filters.pos;

import com.example.demo.util.FilterType;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StreamUtils;

import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import static org.springframework.util.ReflectionUtils.rethrowRuntimeException;

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
        return ctx.getResponseStatusCode() == HttpServletResponse.SC_OK;
    }

    @Override
    public Object run() throws ZuulException {

        RequestContext ctx = RequestContext.getCurrentContext();
        try {
            InputStream stream = ctx.getResponseDataStream();
            String body = StreamUtils.copyToString(stream, StandardCharsets.UTF_8);
            body = "Modified via setResponseDataStream(): " + body;
            ctx.setResponseDataStream(new ByteArrayInputStream(body.getBytes("UTF-8")));
        }
        catch (Exception e) {
            rethrowRuntimeException(e);
        }

        return ctx;
    }
}
