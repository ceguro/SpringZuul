package com.example.demo.configuration;


import com.example.demo.filters.pos.FilterPosMaster;
import com.example.demo.filters.pos.FilterPosOne;
import com.example.demo.filters.pos.FilterPosTwo;
import com.example.demo.filters.pre.FilterPreMaster;
import com.example.demo.filters.pre.FilterPreOne;
import com.example.demo.filters.pre.FilterPreTwo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FiltersConfig {

    @Bean
    public FilterPreMaster filterPreMaster() {
        return new FilterPreMaster();
    }

    @Bean
    public FilterPosMaster filterPosMaster() {
        return new FilterPosMaster();
    }

    @Bean
    public FilterPreOne filterOnePre() {
        return new FilterPreOne();
    }

    @Bean
    public FilterPreTwo filterTwoPre() {
        return new FilterPreTwo();
    }


    @Bean
    public FilterPosOne filterOnePos() {
        return new FilterPosOne();
    }

    @Bean
    public FilterPosTwo filterTwoPos() {
        return new FilterPosTwo();
    }
}
