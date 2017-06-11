package com.appintegration.dataservice;

import com.appintegration.dataimpl.MovieDataXmlImpl;
import com.appintegration.entity.Movie;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by JiachenWang on 2017/6/11.
 */
public class MovieDataServiceTest {
    @Test
    public void test(){
        MovieDataService service = new MovieDataXmlImpl();
        List<Movie> result = service.getAllMovieOf2016();
        System.out.println(result.size());
        for(Movie movie:result){
            System.out.println(movie);
        }
    }

    @Test
    public void test1(){
        MovieDataService service = new MovieDataXmlImpl();
        List<Movie> result = service.getMovieOf2016(1000,10);
        System.out.println(result.size());
        for(Movie movie:result){
            System.out.println(movie);
        }
    }

    @Test
    public void test2(){
        MovieDataService service = new MovieDataXmlImpl();
        List<Movie> result = service.search("汤姆·克鲁斯");
        System.out.println(result.size());
        for(Movie movie:result){
            System.out.println(movie);
        }
    }
}