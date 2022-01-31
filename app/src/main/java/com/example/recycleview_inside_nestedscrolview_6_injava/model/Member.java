package com.example.recycleview_inside_nestedscrolview_6_injava.model;

public class Member {
    String first_name;
    String last_name;

    public Member(){
    }
    public Member(String first_name,String last_name){
        this.first_name = first_name;
        this.last_name = last_name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
}
