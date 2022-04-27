package com.hubin.chats.utils;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("ResultMap")
@Scope("request")
public class ResultMap<T> {
    private int status;
    private String message;
    private Object object;
    private List<T> list = new ArrayList<T>();
    private long total;//条数


    public void setMessage(String message) {
        this.message = message;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public Object getObject() {
        return object;
    }

    public List<T> getList() {
        return list;
    }

    public long getTotal() {
        return total;
    }
}
