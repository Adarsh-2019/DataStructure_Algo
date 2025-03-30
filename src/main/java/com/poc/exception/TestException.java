package com.poc.exception;

public class TestException {
    public static void main(String[] args) {
        try {
            // Throw custom checked exception
            throw new ResourceNotFoundException("Resource is not found on server side");
        } catch (ResourceNotFoundException e) {
            System.out.println("Caught CustomCheckedException: " + e.getMessage());
        }
    }
}
