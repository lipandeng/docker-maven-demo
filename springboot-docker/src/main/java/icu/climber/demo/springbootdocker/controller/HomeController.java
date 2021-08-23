package icu.climber.demo.springbootdocker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Created by lipandeng on 2021/8/23
 */
@RestController
@RequestMapping("/home")
public class HomeController {
    @GetMapping("/index")
    public String index() {
        return "org.springframework.boot.spring-boot-maven-plugin,java version:"+System.getProperty("java.version");
    }
}
