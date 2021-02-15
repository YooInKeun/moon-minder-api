package com.moonminder.api.base.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MoonMinderApiController {

    @GetMapping("/")
    public String hello() {
        return "success!";
    }
}
