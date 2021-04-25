package Oleg;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReader {

    public BufferedReader(FileReader file) {
    }

    public static void main(String[] args) throws IOException {

       FileReader file = new FileReader("Text.txt");
        java.io.BufferedReader reader = new java.io.BufferedReader(file);

        System.out.println(reader.readLine());

    }

}
