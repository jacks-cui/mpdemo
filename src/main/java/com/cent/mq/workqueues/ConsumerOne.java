package com.cent.mq.workqueues;

import java.util.HashMap;
import java.util.Map;

// 工作模式下 的mq 一个queue下有两个消费
public class ConsumerOne {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap();
        map.put("1","1111111111111");
        map.put("2","2222222222222");
        map.put("3","3333333333333");

        for (String key: map.keySet()){
            System.out.println(map.get(key));
        }

    }
}

