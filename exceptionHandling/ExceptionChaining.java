package exceptionHandling;

import java.io.IOException;

public class ExceptionChaining {

    public static void readFile() throws Exception {
        try {
            throw new IOException("Error occurred while reading the file.");
        } catch (IOException e) {
            throw new Exception("Failed to complete file read operation.", e);
        }
    }

    public static void main(String[] args) {
        try {
            readFile();
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
            System.out.println("Cause: " + e.getCause());
        }
    }
}

