package com.example.model;

import java.util.ArrayList;
import java.util.List;

/**
 * project_name:java_demo
 * package_name:com.example.model
 * user: Administrator
 * date: 2014/8/26
 */
public class BeerExpert {
    public List getBrands(String color){
        List brands = new ArrayList();
        if (color.equals("amber")){
            brands.add("Jack Amber");
            brands.add("Red Mouse");
        }
        else {
            brands.add("Jail Pale Ale");
            brands.add("Gout Stout");
        }
        return brands;
    }
}
