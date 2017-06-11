package com.appintegration.controller;

import com.appintegration.entity.Movie;
import com.appintegration.bl.MovieSearch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author yuminchen
 * @version V1.0
 * @date 2017/6/11
 */

@Controller
@RequestMapping("/movie")
public class MovieController {

    @Autowired
    private MovieSearch movieSearch;

    @RequestMapping("/index")
    public String login() {
        return "index";
    }


    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @ResponseBody
    public List<Movie> searchMovies(String key) {
        return movieSearch.search(key);
    }
}
