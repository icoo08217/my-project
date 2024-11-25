package com.my_project.bc.service.impl;

import com.my_project.bc.entity.Member;
import com.my_project.bc.repository.MemberRepository;
import com.my_project.bc.service.MemberService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Transactional
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberRepository repository;


    @Override
    public void saveMember(Member member) {
        repository.save(member);
    }
}
