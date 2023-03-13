package com.wildcodeschool.ProjectDoctor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DoctorController {
    

@GetMapping("/doctor/1")
@ResponseBody
public String doctor1(){
    return  "William Hartnell";
}
@GetMapping("/doctor/10")
@ResponseBody
public String doctor10(){
    return  "David Tennant";
}
@GetMapping("/doctor/113")
@ResponseBody
public String doctor113(){
    return  "Jodie Whittaker";
}

}