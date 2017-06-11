package com.appintegration.bl;

import com.appintegration.entity.Movie;

import java.util.List;

/**
 * @author yuminchen
 * @version V1.0
 * @date 2017/6/11
 */
public interface MovieSearch {
    /**
     * 得到2016年所有的电影
     *
     * @return
     */
    List<Movie> getAllMovieOf2016();

    /**
     * 从start开始获取指定数目的电影
     *
     * @param start
     * @param count
     * @return
     */
    List<Movie> getMovieOf2016(int start, int count);

    /**
     * search movie by keyword
     *
     * @param keyword
     * @return
     */
    List<Movie> search(String keyword);
}
