package com.tableReservation.table.controller;

import com.tableReservation.table.dto.ShopMemberDTO;
import com.tableReservation.table.service.ReservationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class ShopMemberController {
    // 생성자 주입
    private final ReservationService reservationService;

    // 상점 파트너 회원가입 페이지 출력 요청
    @GetMapping("/member/shopSave")
    public String saveForm() {
        return "shopSave";
    }
    @PostMapping("/member/shopSave")
    public String saveShop(@ModelAttribute ShopMemberDTO shopMemberDTO){
        System.out.println("MemberController.save");
        System.out.println("shopMemberDTO = " + shopMemberDTO);
        reservationService.save(shopMemberDTO);
        return "home"; // 로그인 페이지로 바꿔주어야함..
    }

}
