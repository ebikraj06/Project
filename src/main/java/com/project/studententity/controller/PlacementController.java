package com.project.studententity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.project.studententity.entity.Placement;
import com.project.studententity.service.PlacementService;
 

 
@Controller
public class PlacementController {
	
	 @Autowired
	    private PlacementService service;
 
	    @GetMapping("/")
	    public String viewHomePage(Model model) {
	        List<Placement> listplacement = service.listAll();
	        model.addAttribute("listplacement", listplacement);
	        System.out.print("Get / ");	
	        return "index";
	    }
 
	    @GetMapping("/new")
	    public String add(Model model) {
	        model.addAttribute("placement", new Placement());
	        return "new";
	    }
 
	    @RequestMapping(value = "/save", method = RequestMethod.POST)
	    public String savePlacement(@ModelAttribute("placement") Placement std) {
	        service.save(std);
	        return "redirect:/";
	    }
 
	    @RequestMapping("/edit/{id}")
	    public ModelAndView showEditPlacementPage(@PathVariable(name = "id") int id) {
	        ModelAndView mav = new ModelAndView("new");
	        Placement plc = service.get(id);
	        mav.addObject("placement", plc);
	        return mav;
	        
	    }
	    @RequestMapping("/delete/{id}")
	    public String deleteplacement(@PathVariable(name = "id") int id) {
	        service.delete(id);
	        return "redirect:/";
	    }
}
