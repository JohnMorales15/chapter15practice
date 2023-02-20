package org.launchcode.Ch15practice.controllers;


import org.launchcode.Ch15practice.data.DinoEggRepository;
import org.launchcode.Ch15practice.data.DinosaurRepository;
import org.launchcode.Ch15practice.models.DinoEgg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("egg")
public class EggController {
    @Autowired
    private DinosaurRepository dinoRepository;
    @Autowired
    private DinoEggRepository dinoEggRepository;

    @GetMapping
    public String egg(){
        return "egg/index";
    }

    @GetMapping("add")
    public String displayAddEggForm(Model model){
        model.addAttribute("dinoEgg", new DinoEgg());
        model.addAttribute("allDinos", dinoRepository.findAll());

        return "egg/add";
    }

    @PostMapping("add")
    public String processAddEggForm(Model model, @ModelAttribute @Valid DinoEgg newdinoEgg,
                                    Errors errors){

        if(errors.hasErrors()){
            model.addAttribute("allDinos", dinoRepository.findAll());
            return "egg/add";
        }

        dinoEggRepository.save(newdinoEgg);

        return "redirect: ";
    }
}
