package com.appintegration.service.impl;

import com.appintegration.entity.Movie;
import com.appintegration.service.MovieSearch;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yuminchen
 * @version V1.0
 * @date 2017/6/11
 */
public class MovieSearchImpl implements MovieSearch{
    @Override
    public List<Movie> searchByCname(String name) {
        return new ArrayList<>();
    }
}
