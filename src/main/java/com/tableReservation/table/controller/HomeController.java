package com.tableReservation.table.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    // 기본 페이지 요청 메소드
    @GetMapping("/")
    public String home(){
        return "home"; // => templates 폴더의 home.html을 찾아감
    }
}
