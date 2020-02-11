package com.wjpspace.droolstemplete.controller;

import com.wjpspace.droolstemplete.service.CustomerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author wjp
 * @date 2020/1/21 18:06
 */
@RestController
public class CustomerController {
    @Resource
    private CustomerService customerService;


    @GetMapping("/go")
    public void go() {
        customerService.go();
    }
    @GetMapping("/go2")
    public void go2() {
        customerService.go2();
    }
}