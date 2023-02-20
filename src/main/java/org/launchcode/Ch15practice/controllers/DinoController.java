package org.launchcode.Ch15practice.controllers;

import org.launchcode.Ch15practice.data.DinoData;
import org.launchcode.Ch15practice.data.DinosaurRepository;
import org.launchcode.Ch15practice.models.Dinosaur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("dino")
public class DinoController {

    @Autowired
    private DinosaurRepository dinoRepository;

    @GetMapping
    public String dino(Model model){
        model.addAttribute("allDinos", dinoRepository.findAll());
        return "dino/index";
    }

    @GetMapping("add")
    public String addDinos(Model model){

        model.addAttribute("dinosaur", new Dinosaur());
        return "dino/add";
    }

    @PostMapping("add")
    public String submittedDinoForm(Model model, @ModelAttribute @Valid Dinosaur dinosaur,
                                    Errors errors){

        if(errors.hasErrors()){
            model.addAttribute("errorMsg", "Error 'Species' did not meet needed requirements");
            return "add";
        }
//        Dinosaur dinosaur = new Dinosaur(species, diet, aquatic);
//        DinoData.addDino(dinosaur);
        dinoRepository.save(dinosaur);
//        model.addAttribute("allDinos", DinoData.getAllDinos());

        return "redirect:";
    }
}
