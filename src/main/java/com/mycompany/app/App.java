package com.mycompany.app;

import java.io.File;
import java.io.IOException;
/**
 * Hello world!
 */
public class App {

    private static final String MESSAGE = "Hello World!";
    private static final String feature1 = "This is branch feature-1";
    private static final String feature2 = "This is branch feature-2";

    public App() {}

    public static void main(String[] args) {
        System.out.println(MESSAGE);

        try {

            File file = new File(".env");
            if (file.createNewFile()) {
                System.out.println("File is created!");
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getMessage() {
        return MESSAGE;
    }

    public String getMessageTwo(){
        return MESSAGE;
    }
}
