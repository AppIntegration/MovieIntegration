package com.appintegration.bl;

import java.util.List;
import java.util.Map;

/**
 * Created by SK on 2017/7/10.
 */
public interface RecommendService {

    //传入一个用户名，这个用户在数据库中有相应的观影评分记录,返回的是豆瓣ID的一个list
    /**
     *
     * @param username
     * @param num
     * @return
     */
    List<String> getRecommendFilm(String username, int num);

    /**
     *
     * @param username
     * @param rates
     */
    void saveFilmInfo(String username, Map<String, Double> rates);
}
