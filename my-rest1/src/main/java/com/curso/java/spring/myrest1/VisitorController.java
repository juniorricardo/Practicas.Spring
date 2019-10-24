package com.curso.java.spring.myrest1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.ArrayList;
import java.util.List;

@Controller
public class VisitorController {
	
    private List<String> visitors = new ArrayList<>();


    @GetMapping("/visitor-view")
    public String handleGetRequest(Model model) {
        model.addAttribute("visitors", visitors);
        return "visitor-view";
    }
    
    @PostMapping("/visitor-view")
    public String handlePostRequest(String visitorName) {
        visitors.add(visitorName);
        return "redirect:/visitor-view";
    }

}