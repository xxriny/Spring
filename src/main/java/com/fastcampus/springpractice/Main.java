package com.fastcampus.springpractice;

import com.fastcampus.springpractice.config.Config;

import com.fastcampus.springpractice.service.SortService;

import org.springframework.context.ApplicationContext;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
        SortService service = applicationContext.getBean(SortService.class);

        System.out.println("[result] " + service.doSort(Arrays.asList(args)));
    }
}
