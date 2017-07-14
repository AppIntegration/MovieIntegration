//package com.appintegration.Data;
//
//import com.mongodb.MongoClient;
//import com.mongodb.client.MongoDatabase;
//import org.bson.Document;
//
//import java.util.List;
//
///**
// * Created by kylin on 08/06/2017.
// * All rights reserved.
// */
//public class DBUtil {
//
//    private MongoClient mongoClient;
//
//    private MongoDatabase db;
//
//    private String dbName = "test";
//
//    private String collectionName = "douban";
//
//    public DBUtil() {
//
//        mongoClient = new MongoClient();
//
//
//        db = mongoClient.getDatabase(dbName);
//    }
//
//    public boolean saveListOfMovie(String json) {
//        Document document = Document.parse(json);
//        List<Document> movieList = (List<Document>) document.get("subjects");
//        db.getCollection(collectionName).insertMany(movieList);
//        return true;
//    }
//
//    public MongoDatabase getDb(){
////        return db;
//        return null;
//    }
//}
