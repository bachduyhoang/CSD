/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csdl;

/**
 *
 * @author Admin
 */
public class LinkList {

    private class Node {

        public int info;
        public Node next;

        public Node(int info, Node n) {
            this.info = info;
            this.next = n;
        }                
        
    }
    
    private Node head;
    private Node tail;

    private Node getTailNode() {
        for (Node n = head; n.next != null; n = n.next) {
            return n;
        }
        return null;
    }
    
    public int getTail(){
        Node tail = getTailNode();
        return tail.info;
    }
    
    public int getSize(){
        int result = 0;
        for (Node n = head; n.next != null; n = n.next) {
            result++;
        }
        return result;
    }
    
    public int getHead(){
        return head.info;
    }
    
    public boolean isEmpty(){
        return head == null;
    }
    

    public LinkList() {
        head = null;
        tail = null;
    }

    public void addLast(int info) {
        Node new_node = new Node(info, null);
        tail.next = new_node;
        tail = new_node;
    }

    public void addFirst(int info) {
        Node new_node = new Node(info, head);
        head = new_node;
        tail = head.next != null ? tail : head;
    }
    
    public int removeFirst(){
        if(head != null){
            int value = head.info;
            head = head.next;
            tail = head != null ? tail : null;
            return value;                    
        }
        return Integer.MIN_VALUE;
    }

    public void print() {
        for (Node n = head; n != null; n = n.next) {
            System.out.println(n.info);
        }
    }
}
