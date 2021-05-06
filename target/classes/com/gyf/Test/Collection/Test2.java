package com.gyf.Test.Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author xiaoyu
 * @date 2021/04/29 17:05:59
 */
public class Test2 {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("1001","1");
        map.put("1002","2");
        map.put("1003","3");
        map.put("1004","4");
        map.put("1005","5");
        map.put("1006","6");

        Set set = map.keySet();
        Iterator it = set.iterator();
        while (it.hasNext()){
            String v = (String)it.next();
            System.out.println(v+"-----"+map.get(v));
        }
    }
}
