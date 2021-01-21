package com.xishan.store.base.page;

import java.io.Serializable;

public  abstract class PageCommon implements Serializable {
    protected Integer pageNo;

    protected Integer pageSize;

    protected Integer total;

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        if(pageNo<0){
            pageNo = 0;
        }
        this.pageNo = pageNo;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        if(pageSize > 1000){
            pageSize = 1000;
        }
        this.pageSize = pageSize;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }
}
