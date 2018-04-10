package com.company;

import java.util.Scanner;

public class Main {

    public static int nodeSize;
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter the order of the b tree");
        nodeSize = myScanner.nextInt();

        BTree b = new BTree("20");
        b.insert("30");
        b.search("30");


    }
}

class BTree{
    private Node root;
    public BTree(String initialValue){
        this.root = new Node();
        root.insert(initialValue);
    }

    public void search(String query){
        boolean b= root.contains(query);
        if(b) {
            System.out.println(query+" found!");
        }
        else{
            System.out.println(query+" not found!");
        }
    }


    public void insert(String data){
        root.insert(data);

    }

    public void delete(Node n){

    }

}
