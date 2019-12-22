package com.example.demo.configuration;


import com.example.demo.filters.pre.FilterPreMaster;
import com.example.demo.filters.pre.FilterOne;
import com.example.demo.filters.pre.FilterTwo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FiltersConfig {

    @Bean
    public FilterPreMaster filterPreMaster() {
        return new FilterPreMaster();
    }

    @Bean
    public FilterOne filterOnePre() {
        return new FilterOne();
    }

    @Bean
    public FilterTwo filterTwoPre() {
        return new FilterTwo();
    }
}
