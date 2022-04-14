package com.year3.sed.lecture9.binary_tree;

public class BinaryTree {
    Node root;

    private Node addRecursive(Node current, String value) {
        if (current == null) {
            return new Node(value);
        }

        if (value.compareToIgnoreCase(current.value) < 0) {
            current.left = addRecursive(current.left, value);
        } else if (value.compareToIgnoreCase(current.value) > 0) {
            current.right = addRecursive(current.right, value);
        } else {
            // value already exists
            return current;
        }

        return current;
    }

    public void add(String value) {
        root = addRecursive(root, value);
    }

    public void add(String[] valueList) {
        for (String s : valueList) {
            add(s);
            System.out.println("BT: Added value: " + s);
        }
    }

}
