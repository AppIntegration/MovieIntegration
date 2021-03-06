package com.appintegration.util;

import com.appintegration.po.MovieXMLCache;
import org.apache.commons.digester.Digester;
import org.springframework.util.ResourceUtils;
import org.xml.sax.SAXException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by kylin on 11/06/2017.
 * All rights reserved.
 */
public class MovieDigester {

//    private String xmlPath = "/Users/kylin/Desktop/Study/homework/Teamwork/第二次作业/MovieData/src/main/java/util/allfilms.xml";

    public MovieXMLCache getMovieCache() {
        // 定义要解析的 XML 的路径，并初始化工具类
        File input = null;
        try {
            input = ResourceUtils.getFile("classpath:data/allfilms.xml");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Digester digester = new Digester();
        digester.setValidating(false);

        // 如果碰到了 <books> 这个标签，应该初始化 test.myBean.Books 这个 JavaBean 并填装相关内容
        digester.addObjectCreate("RECORDS", "com.appintegration.po.MovieXMLCache");

        // 如果碰到了 <books/book> 这个标签，同上初始化 test.myBean.Book 这个 JavaBean
        digester.addObjectCreate("RECORDS/RECORD", "com.appintegration.po.MovieXML");

        // 设置对象属性,与xml文件对应,不设置则是默认
        digester.addBeanPropertySetter("RECORDS/RECORD/imdbId", "imdbId");
        digester.addBeanPropertySetter("RECORDS/RECORD/doubanId", "doubanId");
        digester.addBeanPropertySetter("RECORDS/RECORD/ename", "ename");
        digester.addBeanPropertySetter("RECORDS/RECORD/cname", "cname");
        digester.addBeanPropertySetter("RECORDS/RECORD/year", "year");
        digester.addBeanPropertySetter("RECORDS/RECORD/doubanScore", "doubanScore");
        digester.addBeanPropertySetter("RECORDS/RECORD/doubanVote", "doubanVote");
        digester.addBeanPropertySetter("RECORDS/RECORD/imdbScore", "imdbScore");
        digester.addBeanPropertySetter("RECORDS/RECORD/imdbVote", "imdbVote");
        digester.addBeanPropertySetter("RECORDS/RECORD/timeScore", "timeScore");
        digester.addBeanPropertySetter("RECORDS/RECORD/timeVote", "timeVote");
        digester.addBeanPropertySetter("RECORDS/RECORD/genre", "genres");
        digester.addBeanPropertySetter("RECORDS/RECORD/cast", "casts");
        digester.addBeanPropertySetter("RECORDS/RECORD/directors", "directors");
        digester.addBeanPropertySetter("RECORDS/RECORD/writers", "writers");
        digester.addBeanPropertySetter("RECORDS/RECORD/etagline", "etagline");
        digester.addBeanPropertySetter("RECORDS/RECORD/ctagline", "ctagline");
        digester.addBeanPropertySetter("RECORDS/RECORD/smallImage", "smallImage");
        digester.addBeanPropertySetter("RECORDS/RECORD/mediumImage", "mediumImage");
        digester.addBeanPropertySetter("RECORDS/RECORD/bigImage", "bigImage");

        // 通过调用上面已经初始化过的 JavaBean 的 addBook() 方法来把多个 <books/book> 加到一个集合中
        digester.addSetNext("RECORDS/RECORD", "addMovieXML");

        MovieXMLCache vc = null;
        try {
            vc = (MovieXMLCache) digester.parse(input);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        }
        return vc;
    }
}
