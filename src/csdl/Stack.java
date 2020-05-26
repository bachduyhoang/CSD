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
public interface Stack {

    public void push(int info);

    public int pop();

    public int size();

    public int top();

    public boolean isEmty();

    public void print();

}
