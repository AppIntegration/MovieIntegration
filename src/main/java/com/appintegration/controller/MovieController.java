package com.appintegration.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author yuminchen
 * @version V1.0
 * @date 2017/6/11
 */

@Controller
@RequestMapping("/movie")
public class MovieController {

    @RequestMapping("/index")
    public String login(){
        return "index";
    }

}
