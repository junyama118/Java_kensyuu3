package com.example.demo.domain;

import java.sql.Timestamp;

public class Student {
    private String name;
    private char sex;
    private int japanese_score;
    private int math_score;
    private int science_score;
    private int society_score;
    private int english_score;
    private Timestamp created_at;
    private Timestamp updated_at;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getJapanese_score() {
        return japanese_score;
    }

    public void setJapanese_score(int japanese_score) {
        this.japanese_score = japanese_score;
    }

    public int getMath_score() {
        return math_score;
    }

    public void setMath_score(int math_score) {
        this.math_score = math_score;
    }

    public int getScience_score() {
        return science_score;
    }

    public void setScience_score(int science_score) {
        this.science_score = science_score;
    }

    public int getSociety_score() {
        return society_score;
    }

    public void setSociety_score(int society_score) {
        this.society_score = society_score;
    }

    public int getEnglish_score() {
        return english_score;
    }

    public void setEnglish_score(int english_score) {
        this.english_score = english_score;
    }

    public Timestamp getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
    }

    public Timestamp getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Timestamp updated_at) {
        this.updated_at = updated_at;
    }
}
