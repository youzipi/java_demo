package com.dao;

import com.bean.News;
import com.jdbc.DB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;

/**
 * project_name:java_demo
 * package_name:com.dao
 * user: youzipi
 * date: 2014/10/19
 */
public class NewsUtil implements SplitPage {

    private Connection conn;
    private DB db = new DB();

/*    static {
        //DB db = new DB();
    }*/
    public NewsUtil() {
        this.conn = new DB().getConnection();
    }

    @Override
    public Collection getPageData(PageBean pagebean) throws Exception {
        if (conn.isClosed())
            conn=db.getConnection();
        String sql="select * from db_imagenews order by id limit "+(pagebean.getCurrentPage()-1)*pagebean.getPageSize()+","+pagebean.getPageSize();
        ArrayList<News> list = new ArrayList<News>();
        try{
            ResultSet rs = db.getrs(sql);
            while (rs.next()){
                News news = new News();
                news.setId(rs.getInt("id"));
                news.setImageAddress(rs.getString("imageAddress"));
                news.setNewsTitle(rs.getString("newsTitle"));
                news.setNewsContent(rs.getString("newsContent"));
                list.add(news);
            }
            //db.closed();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }


    @Override
    public int getAvailableCount()throws Exception{

        int counter=0;
        try{
            if (conn.isClosed())
                conn=db.getConnection();
            String sql = "select count(*) from db_imagenews";
            ResultSet rs = db.getrs(sql);
            while (rs.next()){
                counter=rs.getInt(1);
            }
            //db.closed();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return counter;
    }

}
