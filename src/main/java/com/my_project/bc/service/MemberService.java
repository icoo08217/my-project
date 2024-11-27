package com.my_project.bc.service;

import com.my_project.bc.entity.Member;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface MemberService {

    void saveMember(Member member);

    List<Member> findAll();
}
