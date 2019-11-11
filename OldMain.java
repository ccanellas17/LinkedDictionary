package com.company;

import java.io.*;
import java.util.LinkedList;
import java.util.Scanner;

class Main {


    public static void main(String[] args) throws IOException {

        //Create access to the unsorted dictionary file
        File f = new File("/Users/CharlyLaba/LinkedDictionary/src/com/company/unsorteddict.txt");
        Scanner scan = new Scanner(f);

        String word ="";
        LinkedList<String> ll = new LinkedList<>();

        //Create a FileWriter for the sorted dictionary
        FileWriter writer = new FileWriter("testTest.txt");

        //Algorithm created with help
        while(scan.hasNextLine()){
            word = scan.nextLine();
            int x = 0;
            if (ll.size() == 0) {
                ll.add(0, word);
            } else
                for (x = 0; x < ll.size(); x++) {
                    if (ll.get(x).compareToIgnoreCase(word) > 0) {
                        ll.add(x, word);
                        break;
                    }
                }
            if (x == ll.size()) {
                ll.add(word);
            }

        }
        for (int i = 0; i < ll.size(); i++) {
            System.out.println(ll.get(i));
            writer.write(ll.get(i) + "\n");
        }

        //Close Writer
        writer.close();
    }
}





