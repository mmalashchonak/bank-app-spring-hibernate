package com.company.banklist.controllers;

import com.company.banklist.entity.User;
import com.company.banklist.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class MyController {

    private Service service;

    @Autowired
    public void setFilmService(Service service) {
        this.service = service;
    }

    @GetMapping("/")
    public ModelAndView home(){
        ModelAndView modelAndView = new ModelAndView("home");
        return modelAndView;
    }
    
    @PostMapping("sum")
    public ModelAndView sumPost(){
        ModelAndView modelAndView = new ModelAndView("home");
        Long sum = service.sum();
        modelAndView.addObject("sum",sum);
        return modelAndView;
    }

    @PostMapping("richest")
    public ModelAndView richestPost(){
        ModelAndView modelAndView = new ModelAndView("home");
        List<User> max = service.findRichestUser();
        modelAndView.addObject("max",max.get(0).getName() + " " + max.get(0).getSureName());
        return modelAndView;
    }
}
