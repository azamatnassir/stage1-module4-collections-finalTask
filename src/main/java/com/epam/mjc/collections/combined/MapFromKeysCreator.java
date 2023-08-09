package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Set<String> words;
        Map<Integer, Set<String>> result = new HashMap<>();
        for (Map.Entry<String, Integer> entry : sourceMap.entrySet()) {
            if (result.containsKey(entry.getKey().length())) {
                words = result.get(entry.getKey().length());
                words.add(entry.getKey());
                result.replace(entry.getKey().length(), words);
            } else {
                words = new HashSet<>();
                words.add(entry.getKey());
                result.put(entry.getKey().length(), words);
            }
        }
        return result;
    }
}
