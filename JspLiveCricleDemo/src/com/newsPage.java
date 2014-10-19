package com;

import com.bean.News;
import com.dao.newsDAO;
import net.sf.json.JSONArray;

import java.util.ArrayList;

/**
 * project_name:java_demo
 * package_name:com
 * user: youzipi
 * date: 2014/10/13
 */
public class newsPage {
    public static JSONArray load(){
        JSONArray jsArr = new JSONArray();
        try{
            newsDAO newslist = new newsDAO();
            ArrayList<News> list = newslist.getAll();
            System.out.println("list:"+list);
            //(JSONArray) JSONSerializer.toJSON(list)
            jsArr = JSONArray.fromObject(list);
            System.out.println("jsArr:"+jsArr);
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        return jsArr;
    }
}
