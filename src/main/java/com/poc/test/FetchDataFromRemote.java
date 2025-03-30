package com.poc.test;

import java.io.FileWriter;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class FetchDataFromRemote {

    public static void main(String[] args) {
        // Replace these with your actual API endpoint and authentication details
        String apiUrl = "https://dummy.restapiexample.com/api/v1/employees";
        String apiKey = "YOUR_API_KEY";

        try {
            // Make a GET request to the API
            String responseData = makeGetRequest(apiUrl, apiKey);

            // Write the data to a file
            writeToFile("company_data.json", responseData);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String makeGetRequest(String apiUrl, String apiKey) throws IOException {
        URL url = new URL(apiUrl);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        // Set request headers, e.g., for authentication
        connection.setRequestProperty("Authorization", "Bearer " + apiKey);

        // Check if the request was successful (status code 200)
        if (connection.getResponseCode() == 200) {
            // Read response data
            try (Scanner scanner = new Scanner(connection.getInputStream(), StandardCharsets.UTF_8.name())) {
                scanner.useDelimiter("\\A");
                return scanner.hasNext() ? scanner.next() : "";
            }
        } else {
            // Handle error response
            System.out.println("Error: " + connection.getResponseCode() + " - " + connection.getResponseMessage());
            return null;
        }
    }

    private static void writeToFile(String fileName, String data) throws IOException {
        try (FileWriter fileWriter = new FileWriter(fileName)) {
            fileWriter.write(data);
        }
    }
}
