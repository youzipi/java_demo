package com.dao;

import com.bean.News;
import com.jdbc.GetConn;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * project_name:java_demo
 * package_name:com.jdbc
 * user: youzipi
 * date: 2014/9/29
 */
public class newsDAO {


    public ArrayList<News> getImg(){

        Statement stmt = null;
        ResultSet rs = null;
        String sql = "select id,imageAddress from db_imagenews";

        GetConn GetConn = new GetConn();
        Connection conn = GetConn.getConnection();
        ArrayList<News> list = new ArrayList<News>();
        try{
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            while(rs.next()){
                News news = new News();
                news.setId(rs.getInt("id"));
                news.setImageAddress(rs.getString("imageAddress"));
                list.add(news);
                System.out.println();
            }
            conn.close();
        }
        catch (SQLException ex){
            ex.printStackTrace();
        }
        return list;

    }

    public ArrayList<News> getNews(int key){
        String sql="select newsTitle,newsContent from db_imagenews where id ="+key;

        Statement stmt = null;
        ResultSet rs = null;
        ArrayList<News> list = new ArrayList<News>();

        GetConn getConn = new GetConn();
        Connection conn = getConn.getConnection();

        try{
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            while(rs.next()){
                News news = new News();
                news.setNewsTitle(rs.getString("newsTitle"));
                news.setNewsContent(rs.getString("newsContent"));
                list.add(news);
            }

            conn.close();
        }
        catch (SQLException ex){
            ex.printStackTrace();
        }
        return list;

    }

}
