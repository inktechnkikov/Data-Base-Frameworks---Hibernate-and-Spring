package com.springbootlectures.controler;

import com.springbootlectures.interfaces.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DogController {

    @Autowired
    private Animal dog;

    @GetMapping("/dog")
    @ResponseBody
    public String getDogPage(){
        dog.setName("Sharo");
        return this.dog.getName();
      //  return "Dog.html";
    }
}
