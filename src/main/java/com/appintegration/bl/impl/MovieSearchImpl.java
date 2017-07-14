package com.appintegration.bl.impl;

import com.appintegration.Recommend.Recommender;
import com.appintegration.dataservice.MovieDataService;
import com.appintegration.entity.Movie;
import com.appintegration.bl.MovieSearch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yuminchen
 * @version V1.0
 * @date 2017/6/11
 */
@Service
public class MovieSearchImpl implements MovieSearch{

    @Autowired
    private MovieDataService movieDataService;

    @Override
    public List<Movie> getAllMovieOf2016() {
        return movieDataService.getAllMovieOf2016();
    }

    @Override
    public List<Movie> getMovieOf2016(int start, int count) {
        return movieDataService.getMovieOf2016(start, count);
    }

    @Override
    public List<Movie> search(String keyword) {
        return movieDataService.search(keyword);
    }

    @Override
    public List<Movie> getRecommend(String username, int num) {
        Recommender rec=new Recommender();
        List<String> ids=rec.getRecommendFilms("user1",6);
        List<Movie> list=movieDataService.getByIds(ids);
        return list;
    }
}
