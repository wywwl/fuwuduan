package com.jk.model;

public class Keyword_intermediate_table {

     private    Integer keyword_id;
     private    String  keyword_name;
     private    Integer dome_id;

    public Integer getKeyword_id() {
        return keyword_id;
    }

    public void setKeyword_id(Integer keyword_id) {
        this.keyword_id = keyword_id;
    }

    public String getKeyword_name() {
        return keyword_name;
    }

    public void setKeyword_name(String keyword_name) {
        this.keyword_name = keyword_name;
    }

    public Integer getDome_id() {
        return dome_id;
    }

    public void setDome_id(Integer dome_id) {
        this.dome_id = dome_id;
    }

    @Override
    public String toString() {
        return "Keyword_intermediate_table{" +
                "keyword_id=" + keyword_id +
                ", keyword_name='" + keyword_name + '\'' +
                ", dome_id=" + dome_id +
                '}';
    }
}
