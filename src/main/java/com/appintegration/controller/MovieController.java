package com.appintegration.controller;

import com.appintegration.entity.Movie;
import com.appintegration.service.MovieSearch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
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

    private final MovieSearch movieSearch;

    @Autowired
    public MovieController(MovieSearch movieSearch) {
        this.movieSearch = movieSearch;
    }

    @RequestMapping("/index")
    public String login(){
        return "index";
    }


    @RequestMapping("/search")
    @ResponseBody
    public List<Movie> searchMovies(String name){
        return movieSearch.searchByCname(name);
    }
}
