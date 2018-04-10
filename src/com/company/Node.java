package com.company;

import java.util.ArrayList;

public class Node {
    private String[] dataItems;
    private Node[] children;

    public Node() {
        initialiseArrays();        ;
    }

    public void initialiseArrays(){
        dataItems = new String [Main.nodeSize];
        children = new Node[Main.nodeSize];
        for (int counter =0; counter <dataItems.length;counter++){

            dataItems[counter] = null;
            children[counter] = null;
        }
    }

    public Node[] getChildren() {
        return children;
    }

    public boolean contains(String query) {
        boolean b = false;

        if (isInDataItem(query)) {
            b = true;

        } else {
            for (Node n : this.getChildren()) {
                b = true || n.contains(query);
            }
        }
        return b;

    }

    public boolean isInDataItem(String data){
        boolean temp = false;
        for (String s: dataItems){
            if (s.equals(data)) {
                temp = true;
                break;
            }
        }
        return temp;
    }

    public boolean isDataItemEmpty() {
        boolean temp = true;
        for (String s : dataItems) {
            if (!(s == null)) {
                temp = false;
                break;
            }

        }
        return temp;
    }

    public void insert(String data) {
        if(isDataItemEmpty()){
            dataItems[0] = data;
        }
        else {
            for(int c = 0; c <= dataItems.length; c++){
                if(dataItems[c]==null){
                    dataItems[c] = data;
                }
                //if the node is full then we send it to another node.
            }
        }
    }
}

