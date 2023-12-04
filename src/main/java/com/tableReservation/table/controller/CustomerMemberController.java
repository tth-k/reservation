package com.tableReservation.table.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomerMemberController {
    // 일반 고객 회원가입 페이지 출력 요청
    @GetMapping("/member/customerSave")
    public String saveForm() {
        return "customerSave";
    }
}
