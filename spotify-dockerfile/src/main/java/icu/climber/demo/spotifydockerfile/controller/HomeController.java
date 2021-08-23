package icu.climber.demo.spotifydockerfile.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description home controller \
 * @Created by lipandeng on 2021/8/21
 */
@RestController
@RequestMapping("/home")
public class HomeController {

    @GetMapping("/hello")
    public String hello() {
        return "com.spotify.dockerfile-maven-plugin";
    }
}
