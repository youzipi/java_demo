package com.servlet;


import com.bean.News;
import com.dao.newsDAO;
import net.sf.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * project_name:java_demo
 * package_name:com.servlet
 * user: youzipi
 * date: 2014/9/29
 */
public class Load {

    public JSONObject loadImg(){

        JSONObject jObject = new JSONObject();
        System.out.println("Load()>>>>>>>>>>");

        try{
            newsDAO newsDAO = new newsDAO();
            ArrayList<HashMap<String, Object>> list = new ArrayList<HashMap<String, Object>>();
            ArrayList<News> imglist = new ArrayList<News>();

            imglist = newsDAO.getImg();

            for (News img : imglist){
                HashMap<String, Object> map = new HashMap<String, Object>();

                map.put("id",img.getId());
                map.put("imageAddress",img.getImageAddress());

                list.add(map);
            }
            jObject.put("imglist", list);

        }
        catch (Exception ex){
            ex.printStackTrace();
        }


        return jObject;

    }



    public JSONObject loadNews(int key){

        JSONObject jObject = new JSONObject();

        try{
            newsDAO newsDAO = new newsDAO();
            ArrayList<HashMap<String, Object>> list = new ArrayList<HashMap<String, Object>>();
            ArrayList<News> newslist = new ArrayList<News>();

            newslist = newsDAO.getNews(key);

            for (News news : newslist){
                HashMap<String, Object> map = new HashMap<String, Object>();

                map.put("id",news.getId());
                map.put("imageAddress",news.getImageAddress());

                list.add(map);
            }
            jObject.put("newslist", list);

        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        return jObject;
    }
}
