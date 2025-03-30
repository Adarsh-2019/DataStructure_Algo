package com.poc.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EnterElementsPrintAndReverse {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> list=new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            System.out.print(i + "st element: ");
            int element = scanner.nextInt();
            list.add(element);
        }
        List<Integer> sorted = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("List is :"+list);
        System.out.println("List is sorted :"+sorted);
    }
}
