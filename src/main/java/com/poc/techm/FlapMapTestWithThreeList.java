package com.poc.techm;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlapMapTestWithThreeList {
    public static void main(String[] args) {
        List<EmployeeDetails> employees = Arrays.asList(
                new EmployeeDetails(1,"John"),
                new EmployeeDetails(2,"Alice"),
                new EmployeeDetails(3,"Bob")
        );

        List<Address> addresses = Arrays.asList(
                new Address("123 Main St", "New York"),
                new Address("456 Elm St", "Los Angeles"),
                new Address("789 Oak St", "Chicago")
        );

        List<List<String>> mobileNumbers = Arrays.asList(
                Arrays.asList("1234567890", "9876543210"),
                Arrays.asList("4567890123", "8765432109"),
                Arrays.asList("7890123456", "6543210987")
        );

        List<String> flattenedDetails = employees.stream()
                .flatMap(employee ->
                        addresses.stream()
                                //.filter(address -> address.getCity().equals("New York")) // Filter addresses based on some condition
                                .flatMap(address ->
                                        mobileNumbers.get(employee.getId() - 1).stream() // Assuming employee ids are 1-based
                                                .map(mobileNumber -> employee.getName() + " " + address.getStreet() + " " + mobileNumber)
                                )
                ).collect(Collectors.toList());

        flattenedDetails.forEach(System.out::println);
    }
}