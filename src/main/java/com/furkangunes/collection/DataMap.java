package com.furkangunes.collection;

import java.util.HashMap;
import java.util.Map;

public class DataMap {
    public static void main(String[] args) {
        Map<String,String> mapList = new HashMap<>();
        mapList.put("1","Apple");
        mapList.put("2","Banana");
        mapList.put("3","Cherry");
        mapList.put("4","Apple");
        System.out.println(mapList);
    }
}
