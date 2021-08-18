package org.cxy.demo.util;

import java.util.*;



public class TopicRandomUtil {

    /**
     * 乱序Map元素
     * @param option 题目
     * @param key    原答案
     * @return Topic 乱序后 [option={A=c., B=d., C=a., D=b.},key=xxx]
     */
     public static Topic random(Map<String, String> option, String key) {
        Set<String> keySet = option.keySet();
        ArrayList<String> keyList = new ArrayList<>(keySet);
        Collections.shuffle(keyList);
        HashMap<String, String> optionNew = new HashMap<>();
        int idx = 0;
        String keyNew = "";
        for (String next : keySet) {
            String randomKey = keyList.get(idx++);
            if (key.equals(next)) {
                keyNew = randomKey;
            }
            optionNew.put(randomKey, option.get(next));
        }
        return new Topic(optionNew, keyNew);
    }

}
