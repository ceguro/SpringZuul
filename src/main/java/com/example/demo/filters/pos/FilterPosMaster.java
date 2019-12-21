package com.example.demo.filters.pos;

import com.example.demo.FilterType;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;

public class FilterPosMaster extends ZuulFilter {

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
        return false;
    }

    @Override
    public Object run() throws ZuulException {
        return null;
    }
}
