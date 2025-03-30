package com.poc.stack;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindMostRepeatedWordFromFile {
    public static void main(String[] args) {
        Map<String, Integer> wordCountMap = new HashMap<>();
        BufferedReader reader;

        try {
            //creating buffered Reader
            reader = new BufferedReader(new FileReader("sample.txt"));
            //Reading the first line into currentLine
            String currentLine = reader.readLine();

            while (currentLine != null) {
                String[] words = currentLine.toLowerCase().split(" ");
                for (String word : words) {
                    if (wordCountMap.containsKey(word)){
                        wordCountMap.put(word,wordCountMap.get(word)+1);
                    }else {
                        wordCountMap.put(word,1);
                    }
                }
                //Reading next line into currentLine
                currentLine = reader.readLine();
            }
            String mostRepeatedWord = null;
            int count = 0;
            Set<Map.Entry<String, Integer>> entries = wordCountMap.entrySet();
            for (Map.Entry<String,Integer> entry:entries){
               if (entry.getValue()>count){
                   mostRepeatedWord=entry.getKey();
                   count=entry.getValue();
               }
            }
            System.out.println("Most Repeated word :"+mostRepeatedWord);
            System.out.println("No of occurrence "+count);
        } catch (Exception ex) {
            ex.getMessage();
        }

    }
}
