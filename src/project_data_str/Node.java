/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_data_str;

/**
 *
 * @author hp
 */
public class Node {

    Student s = null;
    Node next = null;
    Node prev = null;

    public Node(Student s, Node next, Node prev) {
        this.s = s;
        this.next = next;
        this.prev = prev;
    }




}
