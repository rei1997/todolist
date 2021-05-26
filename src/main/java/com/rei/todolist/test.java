package com.rei.todolist;

import org.springframework.web.bind.annotation.*;

@RestController
public class test {
    @RequestMapping("/")
    public String test(){
        return "test123";
    }
}