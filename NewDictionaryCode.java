package com.company;

import java.io.*;
import java.util.*;

public class NewDictionaryCode {



    public static void sorting(List<String> array) throws IOException {
        FileWriter writer=new FileWriter("DTest.txt");

        long t1 =System.currentTimeMillis();
        int k;
        for (int j = 0; j < array.size(); j++) {
            for (int i = 0; i<array.size()-1; i++) {
                k = i + 1;
                if (array.get(i).compareToIgnoreCase(array.get(k)) > 0) {
                    swapWords(k, i, array);

                }
            }
        }

        for(int i=0; i<array.size(); i++) {
            System.out.println(array.get(i));

            writer.write(array.get(i) + "\n");

        }

        long t2 =System.currentTimeMillis();
        System.out.println("The time to run the code was: "+ (t2-t1));

        writer.close();
    }

    private static void swapWords(int i, int j, List<String> array) {

        String temp = array.get(i);
        array.set(i, array.get(j));
        array.set(j, temp);
    }


    public static void main(String[] args) throws IOException {
        LinkedList<String> dictionary = new LinkedList<String>();

        //Create access to the unsorted dictionary file
        File f = new File("/Users/carlos/IdeaProjects/pair-programming/src/com/company/test.txt");

        //Scanner to scan the file
        Scanner scan = new Scanner(f);

        FileWriter writer = new FileWriter("dictTest.txt");

        String string = "";
        List<String> words = new ArrayList<String>();

        long t3 =System.currentTimeMillis();

        while (scan.hasNext()) {
            string = scan.nextLine();
            words.add(string);
        }
        long t4 =System.currentTimeMillis();
        System.out.println("The time it took to scan the file was: " + (t4-t3));


        scan.close();

        sorting(words);


    }
}
