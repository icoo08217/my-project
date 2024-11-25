package com.my_project.bc.service;

import com.my_project.bc.entity.Member;
import org.springframework.stereotype.Service;

@Service
public interface MemberService {

    void saveMember(Member member);
}
