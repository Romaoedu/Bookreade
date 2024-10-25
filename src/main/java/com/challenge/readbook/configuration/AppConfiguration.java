package com.challenge.readbook.configuration;

import com.challenge.readbook.mapper.BookMapperDecorator;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
    @Bean
    public BookMapperDecorator bookMapperDecorator() {
        return new BookMapperDecorator();
    }
}