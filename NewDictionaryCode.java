package com.company;

import com.sun.xml.internal.ws.util.StringUtils;

import java.io.*;
import java.util.*;

public class NewDictionaryCode {


    public static void sorting(List<String> array) throws IOException {
        FileWriter writer = new FileWriter("dTest.txt");

        int k;
        for (int j = 0; j < array.size(); j++) {
            for (int i = 0; i < array.size() - 1; i++) {
                k = i + 1;
                if (array.get(i).compareToIgnoreCase(array.get(k)) > 0) {
                    swapWords(k, i, array);

                }
            }
        }

        for (int i = 0; i < array.size(); i++) {

            writer.write(array.get(i) + "\n");

        }

        writer.close();
    }

    private static void swapWords(int i, int j, List<String> array) { //When the sorting method finds the right position of the word, swaps its position with the previous word.

        String temp = array.get(i);
        array.set(i, array.get(j));
        array.set(j, temp);
    }

    public static void scanForWord(LinkedList<String> array, String s) { //Scan if a word is already in the list or not

        if(array.contains(StringUtils.decapitalize(s))){
            s = StringUtils.decapitalize(s);
            System.out.println("The word " + s + " is in the position " + array.indexOf(s) + " of the list." + "\n");

        }else if(array.contains(StringUtils.capitalize(s))){
            s = StringUtils.capitalize(s);
            System.out.println("The word " + s + " is in the position " + array.indexOf(s) + " of the list." + "\n");

        }else{
            System.out.println("This word is not inside this list." + "\n");
        }


    }



    public static void main(String[] args) throws IOException {

        //Create access to the unsorted dictionary file
        File f = new File("/Users/carlos/IdeaProjects/pair-programming/src/com/company/unsorteddict.txt");

        //Scanner to scan the file
        Scanner scan = new Scanner(f);

        //Scanner for the user inputs
        Scanner scanner = new Scanner(System.in);

        LinkedList<String> words = new LinkedList<String>();

        String string = "";
        while (scan.hasNext()) {
            string = scan.nextLine();
            words.add(string);
        }

        //First we sort the list to then give the user some actions with the sorted list
        sorting(words);

        //Here will be the user inputs available
        boolean flag = true;
        while (flag) {
            System.out.println("=======MAIN MENU=======");
            System.out.println("* If you want to print the list sorted, type a." + "\n" +
                    "* If you want to know if a word is already in the list and its position, type b"+ "\n" +
                    "* If you want to exit, type e.");

            String response = scanner.nextLine();

            if (response.equalsIgnoreCase("a")) {
                System.out.println("This is the list sorted: ");

                for(int i=0; i<words.size();i++) {
                    System.out.println(words.get(i));

                }
                System.out.println(" ");
            }


            else if(response.equalsIgnoreCase("b")){

                System.out.println("Input the word you want to look for: ");
                String s = scanner.nextLine();

                scanForWord(words, s);

            }

            else if(response.equalsIgnoreCase("e")){
                System.out.println("Goodbye.");
                flag=false;
            }

            else{
                System.out.println("This argument doesn't exist, try 'a, b, or e'" + "\n");
            }
        }
    }
}

