package com.xinfa.baidunlp;

public class TextFragment {
    private String ori_frag;
    private Integer begin_pos;

    public String getCorrect_frag() {
        return correct_frag;
    }

    private  String correct_frag;

    public void setCorrect_frag(String correct_frag) {
        this.correct_frag = correct_frag;
    }

    private Integer end_pos;

    public String getOri_frag() {
        return ori_frag;
    }

    public void setOri_frag(String ori_frag) {
        this.ori_frag = ori_frag;
    }
    public Integer getBegin_pos() {
        return begin_pos;
    }

    public void setBegin_pos(Integer begin_pos) {
        this.begin_pos = begin_pos;
    }

    public Integer getEnd_pos() {
        return end_pos;
    }

    public void setEnd_pos(Integer end_pos) {
        this.end_pos = end_pos;
    }

    @Override
    public String toString() {
        return "TextFragment{" +
                "ori_frag='" + ori_frag + '\'' +
                ", correct_frag=" + correct_frag +
                ", begin_pos=" + begin_pos +
                ", end_pos=" + end_pos +
                '}';
    }
}
