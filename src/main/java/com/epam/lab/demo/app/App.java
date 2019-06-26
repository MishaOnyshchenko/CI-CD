package com.epam.lab.demo.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App
{
    public static void main(String[] args) throws IOException, InterruptedException
    {
        App app = new App();
        app.readFile();
    }

    public void readFile() throws IOException, InterruptedException {
        try (BufferedReader reader = new BufferedReader(new FileReader("file.txt"))) {
            String s;
            while ((s = reader.readLine()) != null) {
                printTheStringAndSleepForSecond(s);
            }
        }
    }

    public void printTheStringAndSleepForSecond(String s) throws InterruptedException {
        System.out.println(s);
        Thread.sleep(1000);
    }
}