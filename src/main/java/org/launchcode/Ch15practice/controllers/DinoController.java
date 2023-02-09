package org.launchcode.Ch15practice.controllers;

import org.launchcode.Ch15practice.data.DinoData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("dino")
public class DinoController {

    @GetMapping
    public String dino(Model model){
        model.addAttribute("allDinos", DinoData.getAllDinos());
        return "dino/index";
    }

    @GetMapping("add")
    public String addDinos(){
        return "dino/add";
    }

}
