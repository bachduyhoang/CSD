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
public class Link implements Stack{
    private LinkList list = new LinkList();
    
    @Override
    public void push(int info) {
        list.addFirst(info);
    }

    @Override
    public int pop() {
        return list.removeFirst();
    }

    @Override
    public int size() {
        return list.getSize();
    }

    @Override
    public int top() {
        return list.getHead();
    }

    @Override
    public boolean isEmty(){ 
            return list.isEmpty();
    }

    @Override
    public void print() {
        list.print();
    }

    
    
}
