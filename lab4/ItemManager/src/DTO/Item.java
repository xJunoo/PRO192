/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.util.Scanner;

/**
 *
 * @author TungDuy
 */
public class Item {
    protected int value;
    protected String creator;

    public Item() {
    }

    public Item(int value, String creator) {
        this.value = value;
        this.creator = creator;
    }

    public int getValue() {
        return value;
    }

    public String getCreator() {
        return creator;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    @Override
    public String toString() {
        return "Item{" + "value=" + value + ", creator=" + creator + '}';
    }
    
    public void output(){
        System.out.println("Value: " + this.value);
        System.out.println("Creator: " + this.creator);
    }
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Value: ");
        this.value = sc.nextInt();
        
        System.out.println("Enter creator: ");
        this.creator = sc.nextLine();
    }
    
}