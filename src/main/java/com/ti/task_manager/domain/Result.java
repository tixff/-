package com.ti.task_manager.domain;

import java.util.HashMap;
import java.util.Map;

public class Result {
    private Integer status = 200;
    private Map<String,Object> data = new HashMap<>();

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }
}
