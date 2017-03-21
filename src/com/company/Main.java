package com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner s = new Scanner(new File("class.txt"));
        ArrayList<String> fileList = new ArrayList<String>();
        while(s.hasNext())
        {
            fileList.add(s.next());
        }
        s.close();
        Collections.shuffle(fileList);
        System.out.println("Results after shuffle: ");
        for(String str: fileList)
        {
            System.out.println(str);
        }

    }
}
