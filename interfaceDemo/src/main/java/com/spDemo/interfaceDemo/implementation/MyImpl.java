package com.spDemo.interfaceDemo.implementation;

import com.spDemo.interfaceDemo.repositoryDemo.MyInterface;
import org.springframework.stereotype.Component;

@Component
public class MyImpl implements MyInterface{

    @Override
    public String getData() {
        return "Hello Sambhav";
    }
}

