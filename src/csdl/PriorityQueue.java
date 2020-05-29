/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csdl;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class PriorityQueue {

    

//    private SingLyLikedList<Entry> list = new SingLyLikedList<Entry>();
    
    private ArrayList<Entry> list = new ArrayList<Entry>();
    
    public void enqueue(Entry entry) {
        list.add(list.size(), entry);
        //list.addLast(entry);
    }

    public Entry denqueue(Entry entry) {
        return list.remove(0);

    }

    public Entry first() {
        return list.get(0);

    }

    public boolean isEmty() {
        return list.isEmpty();
    }
    
    public int size(){
        return list.size();
    }
    
    public String toString(){
        return list.toString();
    }

}
