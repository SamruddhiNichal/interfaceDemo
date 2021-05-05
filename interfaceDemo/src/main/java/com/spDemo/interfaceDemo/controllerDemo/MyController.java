package com.spDemo.interfaceDemo.controllerDemo;

import com.spDemo.interfaceDemo.implementation.MyImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    private MyImpl myImpl;

    @GetMapping("/checkingg")
    public String check(){
        return myImpl.getData();
    }
}
