package DTO;

import java.util.Scanner;

/**
 *
 * @author TungDuy
 */
public class Statue extends Item{
    private int weight;
    private String colour;

    public Statue() {
    }

    public Statue(int value, String creator,int weight, String colour) {
        super(value, creator);
        this.weight = weight;
        this.colour = colour;
    }

    public int getWeight() {
        return weight;
    }

    public String getColour() {
        return colour;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
    
    public void output(){
        System.out.println("Weight: " + this.weight);
        System.out.println("Colour: " + this.colour);
    }
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter weight: ");
        this.weight = sc.nextInt();
        
        System.out.println("Enter colour: ");
        this.colour = sc.nextLine();
    }
}