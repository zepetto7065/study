package me.zepetto.demowebmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController {

    @GetMapping(value="/hello")
    @ResponseBody
    public String hello(){
        return "hello";
    }

    @PostMapping("/hello")
    @ResponseBody
    public String helloPost(){
        return "hello";
    }

}
