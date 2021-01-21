package com.xishan.store.base.page;

import java.util.Date;
import java.util.List;

/**
 * 通用分页实体
 */
public class Paging<T> extends PageCommon{

    private List<T> data;

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
