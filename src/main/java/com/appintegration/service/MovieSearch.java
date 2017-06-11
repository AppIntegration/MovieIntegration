package com.appintegration.service;

import com.appintegration.entity.Movie;

import java.util.List;

/**
 * @author yuminchen
 * @version V1.0
 * @date 2017/6/11
 */
public interface MovieSearch {
    List<Movie> searchByCname(String name);
}
