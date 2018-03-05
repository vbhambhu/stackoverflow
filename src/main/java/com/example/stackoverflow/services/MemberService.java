package com.example.stackoverflow.services;

import com.example.stackoverflow.entities.Member;
import com.example.stackoverflow.repositories.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {

    @Autowired
    MemberRepository memberRepository;

    public List<Member> findall(){
        return memberRepository.findAll ();
    }
}
