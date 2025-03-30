package com.poc.system;

import java.io.IOException;

public class OpenNotepad {
    public static void main(String[] args) throws IOException {

        //String vlcPath = "C:\\Program Files\\VideoLAN\\VLC\\vlc.exe";

        // Launch VLC
        //Process process = Runtime.getRuntime().exec(vlcPath);
        //Process process = Runtime.getRuntime().exec("mspaint");
        //String filePath = "C:\\Users\\angad\\Downloads\\test.txt";
        //Process process = Runtime.getRuntime().exec("notepad.exe " + filePath);

        /*List<Integer> list=new ArrayList();
        list.add(1);
        list.add(4);
        list.add(3);
        list.add(7);
        //System.out.println(list);
        //list.stream().forEach(System.out::println);
        *//*for (Integer i: list){
            System.out.println(i);
        }*//*

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            Integer value = iterator.next();
            System.out.println(value);
            if (value==3){
                list.add(10);
            }
        }*/

        /*Set<Integer> set=new HashSet<>();
        set.add(12);
        set.add(13);
        set.add(44);
        set.add(55);
        set.add(77);
*/
        //set.stream().forEach(System.out::println);
        /*for (Integer i:set){
            System.out.println(i);
        }*/

        /*Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()){
            Integer value = iterator.next();
            System.out.println(value);
            if (value==13){
                set.remove(77);
            }
        }*/
        // Print each element
        // Keep elements other than 13
        // Ensure no structural modification in the stream
        /*set.stream()
                .peek(System.out::println) // Print each element
                .filter(value -> value != 13).filter(value -> value == 13).map(value -> 77).forEach(set::add);*/

       /* Map<String, Integer> map=new ConcurrentHashMap<>();
        map.put("A",1);
        map.put("BB",3);
        map.put("AB",12);
        map.put("NN",16);

        //System.out.println(map);
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String ,Integer> entry:entries){
            System.out.println(entry.getKey()+ "-"+entry.getValue());
            map.put("SB",100);
        }*/
        /*Thread thread=new Thread(()-> System.out.println("create new thread"));
        thread.start();*/
        /*Runnable ru=new Runnable() {
            @Override
            public void run() {
                System.out.println("start the thread");
            }
        }*/

        /*Runnable run=()->{
            System.out.println("Create new thread");
        };
        Thread thread=new Thread(run);
        thread.start();*/

    }
}
