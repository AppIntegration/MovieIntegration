package com.appintegration.dataservice;

import com.appintegration.data.DbStore;

import java.util.Map;

/**
 * Created by SK on 2017/7/10.
 */
public class FilmSearchImpl implements FilmSearch {
    @Override
    public String getCname(String id) {
        DbStore db = new DbStore();
        return db.getFilmCName(id);
    }

    @Override
    public Map<String, Map<String, Double>> getMaps() {
        DbStore db = new DbStore();
        return db.getMaps();
    }


}
