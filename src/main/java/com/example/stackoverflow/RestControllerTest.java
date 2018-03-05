package com.example.stackoverflow;

import com.example.stackoverflow.entities.Member;
import com.example.stackoverflow.repositories.MemberRepository;
import com.example.stackoverflow.services.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RestControllerTest {


    @Autowired
    MemberRepository memberRepository;

    @RequestMapping(method= RequestMethod.POST, path="/member")
    public ResponseEntity<Member> createMember(@RequestBody Member member) {
        memberRepository.save (member);
        return null;
        //return new ResponseEntity<Member>(member, HttpStatus.OK);
    }

    @RequestMapping(method= RequestMethod.GET, path="/member/list")
    public List<Member> getMember() {
        return memberRepository.findAll ();
    }
}
