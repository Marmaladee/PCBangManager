package com.pcroom.manager.controller;

import com.pcroom.manager.dto.MemberDto;
import com.pcroom.manager.service.MemberService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor
public class MemberController {
    private MemberService memberService;

    @GetMapping("/")
    public String index() {
        return "/index";
    }

    @GetMapping("/user/signup")
    public String displaySignUp() {
        return "/signup";
    }

    @PostMapping("/user/signup")
    public String executeSignUp(MemberDto memberDto) {
        if (memberDto.getUserId().equals(memberService.joinUser(memberDto)))
            return "redirect:/user/login";
        else
            return "/signup";
    }

    @GetMapping("/user/login")
    public String displayLogin(MemberDto memberDto) {
        return "/login";
    }

    // 로그인 결과 페이지
    @GetMapping("/user/login/result")
    public String displayLoginResult() {
        return "/loginSuccess";
    }

    // 로그아웃 결과 페이지
    @GetMapping("/user/logout/result")
    public String displayLogout() {
        return "/logout";
    }

    // 접근 거부 페이지
    @GetMapping("/user/denied")
    public String displayDenied() {
        return "/denied";
    }

    // 내 정보 페이지
    @GetMapping("/user/info")
    public String displayMyInfo() {
        return "/myinfo";
    }

    // 어드민 페이지
    @GetMapping("/admin")
    public String displayAdmin() {
        return "/admin";
    }
}

