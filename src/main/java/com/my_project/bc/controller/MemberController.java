package com.my_project.bc.controller;

import com.my_project.bc.entity.Member;
import com.my_project.bc.service.MemberService;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/member")
public class MemberController {

    @Autowired
    private MemberService memberService;

    @PostMapping("/signup")
    public ResponseEntity<?> signup(@RequestBody Member member) {
        memberService.saveMember(member);

        return ResponseEntity.ok().body(Map.of("success", true , "message" , "회원가입에 성공했습니다."));
    }
}
