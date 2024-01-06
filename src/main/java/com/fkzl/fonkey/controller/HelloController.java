package com.fkzl.fonkey.controller;


import com.fkzl.fonkey.dto.MemberDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/test")
public class HelloController {
    @GetMapping(value = "/hello")
    public String getHello(){
        return "hello";
    }

    @GetMapping("/request1")
    public String getRequestParam1(
            @RequestParam String email,
            @RequestParam String name
    ){
        return "email : "
                +email
                +"\nname : "
                +name;
    }


    @GetMapping(value="/request2")
    public String getRequestParam2(MemberDto memberDto){
        return memberDto.toString();
    }

}
