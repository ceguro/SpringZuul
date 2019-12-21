package com.example.demo.configuration;


import com.example.demo.filters.FilterMaster;
import com.example.demo.filters.pre.FilterOne;
import com.example.demo.filters.pre.FilterTwo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FiltersConfig {

    @Bean
    public FilterMaster simpleFilter() {
        return new FilterMaster();
    }

    @Bean
    public FilterOne simpleFilter1() {
        return new FilterOne();
    }

    @Bean
    public FilterTwo simpleFilter2() {
        return new FilterTwo();
    }
}
