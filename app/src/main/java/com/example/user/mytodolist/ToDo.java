package com.example.user.mytodolist;

import java.io.Serializable;

/**
 * Created by user on 19/12/2017.
 */

public class ToDo implements Serializable{

    private Integer number;
    private String title;


    public ToDo(Integer number, String title) {
        this.number = number;
        this.title = title;

    }

    public Integer getNumber() {
        return number;
    }

    public String getTitle() {
        return title;
    }



}
