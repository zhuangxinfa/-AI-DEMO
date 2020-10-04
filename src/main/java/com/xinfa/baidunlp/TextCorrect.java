package com.xinfa.baidunlp;

public class TextCorrect {
    private String log_id;
    private TextItem item;
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getLog_id() {
        return log_id;
    }

    public void setLog_id(String log_id) {
        this.log_id = log_id;
    }

    public TextItem getItem() {
        return item;
    }

    public void setItem(TextItem item) {
        this.item = item;
    }

    @Override
    public String toString() {
        String res = "原始文本:"+text+"\n";
        res = res+"结果文本:"+this.item.getCorrect_query()+"\n";
        for (TextFragment f:this.item.getVec_fragment()
             ) {
            res+=f.getBegin_pos()+"-"+f.getEnd_pos()+" "+f.getOri_frag()+"--->"+f.getCorrect_frag()+"\n";
        }
        return res;
    }
}
