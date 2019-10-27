package com.company;

import java.util.LinkedList;

public class LinkedList_class<String> {

    LinkedList <String> linkedlist = new LinkedList<String>();

    public LinkedList<String> getLinkedlist() {
        return linkedlist;
    }

    public void setLinkedlist(LinkedList<String> linkedlist) {
        this.linkedlist = linkedlist;
    }

    public void addWord (String s){
        linkedlist.add(s);
    }
    public void removeWord(String s){
        linkedlist.remove();
    }
}
