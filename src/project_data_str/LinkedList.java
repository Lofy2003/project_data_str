/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_data_str;

import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class LinkedList {

    int length = 0;
    Node firstNode;
    Node lastNode;

    public Node first() {
        return firstNode;
    }

    public Node last() {
        return lastNode;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public void insertFirst(Node node) {
        if (firstNode == null) {
            firstNode = node;
            lastNode = node;
            node.prev = null;
        } else {
            node.next = firstNode;
            firstNode.prev = node;
            firstNode = node;
        }
        length++;
    }

    public void insertLast(Node node) {
        if (firstNode == null) {
            firstNode = node;
            lastNode = node;
            node.prev = null;
        } else {
            node.prev = lastNode;
            lastNode.next = node;
            lastNode = node;

        }
        length++;
    }

    public void insertSecond(Node newNode) {
        if (firstNode == null) {
            System.out.println("wrong");

        } else if (firstNode == lastNode) {
            lastNode.next = newNode;
            lastNode = newNode;
            newNode.prev = firstNode;

        } else {
            newNode.next = firstNode.next;
            firstNode.next.prev = newNode;
            firstNode.next = newNode;
            newNode.prev = firstNode;
        }
        length++;

    }

    public void removeFirst() {
        if (firstNode == null) {
            System.out.println("there is no element");
        } else if (firstNode.next == null) {
            firstNode = null;
            lastNode = null;
        } else {
            firstNode = firstNode.next;
        }
        length--;
    }

    public void removeSecond() {
        if (firstNode == lastNode) {
            System.out.println("there is no element in the Second");
        } else if(firstNode.next.next == null){
            firstNode.next.prev = null;
            firstNode.next = null;
            lastNode = firstNode;
        }else {
            firstNode.next.next.prev = firstNode;
            firstNode = firstNode.next.next;
        }
        length--;
    }

    public void removeLast() {
        if (firstNode == null) {
// empty list
            System.out.println("there is no element");
        } else if (firstNode.next == null) {
            firstNode = null;
            lastNode = null;
        } else {
            Node curr = lastNode;
            lastNode = lastNode.prev;
            lastNode.next = null;
            curr.prev = null;
        }
        length--;
    }

    public void printList() {
        String msg = "";
        for (Node n = firstNode; n != null; n = n.next) {
            msg += n.s.toString() + "\n";
        }
        JOptionPane.showMessageDialog(null, msg, " ", JOptionPane.INFORMATION_MESSAGE);
    }

}
