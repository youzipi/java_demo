package com.dao;

import java.util.Collection;

/**
 * project_name:java_demo
 * package_name:com.dao
 * user: youzipi
 * date: 2014/10/19
 */
public interface SplitPage {
    public Collection getPageData(PageBean pagebean) throws Exception;
    public int getAvailableCount() throws Exception;


}
