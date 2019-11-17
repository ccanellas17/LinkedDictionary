package com.company;

import com.sun.xml.internal.ws.util.StringUtils;

import java.io.*;
import java.util.*;

public class NewDictionaryCode {


    public static void sortListandFileWriter(List<String> list) throws IOException {
        FileWriter fileWriter = new FileWriter("dTest.txt");
        int k;
        for (int j = 0; j < list.size(); j++) {
            for (int i = 0; i < list.size() - 1; i++) {
                k = i + 1;
                if (list.get(i).compareToIgnoreCase(list.get(k)) > 0) {
                    swapWords(k, i, list);

                }
            }
        }

        for (int i = 0; i < list.size(); i++) {

            fileWriter.write(list.get(i) + "\n");

        }

        fileWriter.close();
    }

    private static void swapWords(int i, int j, List<String> list) { //When the sorting method finds the right position of the word, swaps its position with the previous word.

        String wordToSwap = list.get(i);
        list.set(i, list.get(j));
        list.set(j, wordToSwap);
    }

    public static void scanForWordAndFindPosition(LinkedList<String> list, String wordToLookFor) {

        if(list.contains(StringUtils.decapitalize(wordToLookFor))){

            wordToLookFor = StringUtils.decapitalize(wordToLookFor);
            System.out.println("The word " + wordToLookFor + " is in the position " + list.indexOf(wordToLookFor) + " of the list." + "\n");

        }

        else if(list.contains(StringUtils.capitalize(wordToLookFor))){

            wordToLookFor = StringUtils.capitalize(wordToLookFor);
            System.out.println("The word " + wordToLookFor + " is in the position " + list.indexOf(wordToLookFor) + " of the list." + "\n");

        }

        else{
            System.out.println("This word is not inside this list." + "\n");
        }
    }



    public static void main(String[] args) throws IOException {

        File f = new File("/Users/carlos/IdeaProjects/pair-programming/src/com/company/test.txt");

        Scanner fileScanner = new Scanner(f);
        Scanner userInputScanner = new Scanner(System.in);

        LinkedList<String> listOfWords = new LinkedList<String>();

        String string = "";
        while (fileScanner.hasNext()) {
            string = fileScanner.nextLine();
            listOfWords.add(string);
        }

        //First we sort the list to then give the user some actions with the sorted list
        sortListandFileWriter(listOfWords);

        boolean flag = true;
        while (flag) {
            System.out.println("=======MAIN MENU=======");
            System.out.println("* If you want to print the list sorted, type 'print'." + "\n" +
                    "* If you want to know if a word is already in the list and its position, type 'word'."+ "\n" +
                    "* If you want to exit, type 'exit'.");

            String userInput = userInputScanner.nextLine();

            if (userInput.equalsIgnoreCase("print")) {
                System.out.println("This is the list sorted: ");

                for(int i=0; i<listOfWords.size();i++) {
                    System.out.println(listOfWords.get(i));

                }
                System.out.println(" ");
            }


            else if(userInput.equalsIgnoreCase("word")){

                System.out.println("Input the word you want to look for: ");
                String wordTolookFor = userInputScanner.nextLine();

                scanForWordAndFindPosition(listOfWords, wordTolookFor);

            }

            else if(userInput.equalsIgnoreCase("exit")){
                System.out.println("Goodbye.");
                flag=false;
            }

            else{
                System.out.println("This argument doesn't exist. Try: 'Print', 'Word', or 'Exit'. ");
            }
        }
    }
}
