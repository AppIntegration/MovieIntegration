package com.appintegration.service.impl;

import com.appintegration.entity.Movie;
import com.appintegration.service.MovieSearch;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yuminchen
 * @version V1.0
 * @date 2017/6/11
 */
@Service
public class MovieSearchImpl implements MovieSearch{
    @Override
    public List<Movie> searchByCname(String name) {
        List<Movie> list = new ArrayList<>();
        Movie movie = new Movie();
        movie.setImdbId("sac");
        list.add(movie);
        list.add(new Movie());
        return list;
    }
}
