package Nesque.Kauan.ttwo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @GetMapping("/")
    public String wellcome(){
        return "wellcome to site";
    }
}
