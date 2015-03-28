package com.dao;

/**
 * project_name:java_demo
 * package_name:com.dao
 * user: youzipi
 * date: 2014/10/19
 */
public class PageBean {
    private int pageSize = 10;
    private int currentPage = 1;
    private int pageCount =1;
    private int totalCount =0;

    public int getPageSize() {
        return pageSize;
    }



    public int getTotalCount() {
        return totalCount;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(){
        this.pageCount=(this.getTotalCount()-1)/this.getPageSize()+1;
    }

    public void setCurrentPage(int currentpage){
        if (currentPage>this.pageCount)
            this.currentPage=this.pageCount;
        else if (currentPage<1)
            this.currentPage=1;
        else
            this.currentPage=currentpage;
    }
    public void setTotalCount(int totalcount)
    {
        this.totalCount =totalcount;
        //设置总共记录数后，同时需要校正计算总页数
        this.setPageCount();
    }

}
