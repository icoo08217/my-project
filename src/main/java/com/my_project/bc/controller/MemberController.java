package com.my_project.bc.controller;

import com.my_project.bc.entity.Member;
import com.my_project.bc.service.MemberService;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
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

    @GetMapping("/list")
    public ResponseEntity<?> memberList() {
        List<Member> members = memberService.findAll();

        return ResponseEntity.ok().body(Map.of("success", true , "message" , "멤버 리스트 조회에 성공했습니다." , "members" , members));
    }
}
