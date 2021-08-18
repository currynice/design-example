package org.cxy.demo.question;

/**
 * Description: 问答题  </br>
 * Date: 2021/8/18 10:47
 *
 * @author :cxy </br>
 * @version : 1.0 </br>
 */
public class AnswerQuestion {

    private String desc;  // 问题描述
    private String key;   // 答案

    public AnswerQuestion() {
    }

    public AnswerQuestion(String desc, String key) {
        this.desc = desc;
        this.key = key;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
