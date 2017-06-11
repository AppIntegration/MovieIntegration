package com.appintegration.util;

import com.appintegration.po.MovieXMLCache;
import org.junit.Test;

/**
 * Created by JiachenWang on 2017/6/11.
 */
public class MovieDigesterTest {
    @Test
    public void getMovieCache() throws Exception {
        MovieDigester movieDigester = new MovieDigester();
        MovieXMLCache movieXMLCache = movieDigester.getMovieCache();
        System.out.println(movieXMLCache.toString());
    }

}