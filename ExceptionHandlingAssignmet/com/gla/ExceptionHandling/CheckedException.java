package com.gla.ExceptionHandling;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class CheckedException {
    public static void main(String[] args) {
            try {
                // Attempt to open the file
                FileReader file = new FileReader("data.txt");
                BufferedReader reader = new BufferedReader(file);

                String line;

                // Read and print file contents
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }

                reader.close();
            }
            catch (IOException e) {
                // Handle exception if file not found or error occurs
                System.out.println("File not found");
            }
        }
    }

