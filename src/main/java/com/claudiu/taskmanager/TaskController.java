package com.claudiu.taskmanager;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {
    @GetMapping("/hello")
    public String hello() {
        return "Active backend";
    }


}
