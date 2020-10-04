package com.xinfa.baidunlp;

import java.util.ArrayList;

public class TextItem {

    private ArrayList<TextFragment> vec_fragment;
    private Double score;
    private String correct_query;
    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getCorrect_query() {
        return correct_query;
    }

    public void setCorrect_query(String correct_query) {
        this.correct_query = correct_query;
    }

    public ArrayList<TextFragment> getVec_fragment() {
        return vec_fragment;
    }

    public void setVec_fragment(ArrayList<TextFragment> vec_fragment) {
        this.vec_fragment = vec_fragment;
    }

    @Override
    public String toString() {
        return "TextItem{" +
                "score=" + score +
                ", correct_query='" + correct_query + '\'' +
                ", vec_fragment=" + vec_fragment +
                '}';
    }
}
