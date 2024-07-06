package com.example.testProj.proj.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class MainPageController {

    @GetMapping("/main")
    public ModelAndView IndexDo(ModelAndView mav) {

        mav.setViewName("index.html");

        return mav;
    }

}
