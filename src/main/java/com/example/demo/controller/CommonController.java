package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.View;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class CommonController {

    @GetMapping("/hello")
    public String hello(HttpServletRequest req, @RequestParam("userName") String userName) {

        log.info(">> " + userName + " << 요청이 들어왔습니다.");

        // return "hello";
    }
}

// 로컬에서 수정중
로컬에서 수정중이나
원격에서도 수정중
co

dkjefi

conflict