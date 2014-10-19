package com.dao;

import com.bean.News;
import com.jdbc.DB;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * project_name:java_demo
 * package_name:com.jdbc
 * user: youzipi
 * date: 2014/9/29
 */
public class newsDAO {
    public ArrayList<News> getImg(){

        String sql = "select id,imageAddress from db_imagenews";
        ArrayList<News> list = new ArrayList<News>();

        try{
            DB db = new DB();
            ResultSet rs=db.getRs(sql);
            while(rs.next()){
                News news = new News();
                news.setId(rs.getInt("id"));
                news.setImageAddress(rs.getString("imageAddress"));
                list.add(news);
                System.out.println();
            }
            db.closed();
        }
        catch (SQLException ex){
            ex.printStackTrace();
        }
        return list;
    }

    public ArrayList<News> getAll(){

        String sql = "select * from db_imagenews";
        ArrayList<News> list = new ArrayList<News>();

        try{
            DB db = new DB();
            ResultSet rs=db.getRs(sql);
            while(rs.next()){
                News news = new News();
                news.setId(rs.getInt("id"));
                news.setImageAddress(rs.getString("imageAddress"));
                news.setNewsTitle(rs.getString("newsTitle"));
                news.setNewsContent(rs.getString("newsContent"));
                list.add(news);
                System.out.println();
            }
            db.closed();
        }
        catch (SQLException ex){
            ex.printStackTrace();
        }
        return list;

    }

    public ArrayList<News> getNews(int key){

        String sql="select newsTitle,newsContent from db_imagenews where id ="+key;
        ArrayList<News> list = new ArrayList<News>();

        try{
            DB db = new DB();
            ResultSet rs=db.getRs(sql);
            while(rs.next()){
                News news = new News();
                news.setNewsTitle(rs.getString("newsTitle"));
                news.setNewsContent(rs.getString("newsContent"));
                list.add(news);
            }
            db.closed();
        }
        catch (SQLException ex){
            ex.printStackTrace();
        }
        return list;
    }
}
