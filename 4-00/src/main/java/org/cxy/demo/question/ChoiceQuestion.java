package org.cxy.demo.question;

import java.util.Map;

/**
 * Description: 选择题  </br>
 * Date: 2021/8/18 11:10
 *
 * @author :cxy </br>
 * @version : 1.0 </br>
 */
public class ChoiceQuestion {
    private String desc;                 // 题目
    private Map<String, String> option;  // 选项；A、B、C、D
    private String key;                  // 答案；B

    public ChoiceQuestion() {
    }

    public ChoiceQuestion(String desc, Map<String, String> option, String key) {
        this.desc = desc;
        this.option = option;
        this.key = key;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Map<String, String> getOption() {
        return option;
    }

    public void setOption(Map<String, String> option) {
        this.option = option;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
