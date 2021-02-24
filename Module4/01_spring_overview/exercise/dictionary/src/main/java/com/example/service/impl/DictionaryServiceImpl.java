package com.example.service.impl;

import com.example.service.DictionaryService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
@Service
public class DictionaryServiceImpl implements DictionaryService {
    @Override
    public Map<String, String> dictionary() {
        Map<String,String> dic = new HashMap<>();
        dic.put("hello","xin chao");
        dic.put("human","nguoi");
        dic.put("computer","may tinh");
        dic.put("notebook","quyen vo");
        return dic;
    }

    @Override
    public String search(String a) {
        if (dictionary().containsKey(a)) {
            return dictionary().get(a);
        }
        return "Not Found";
    }
}
