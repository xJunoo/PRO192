package DTO;

import java.util.Scanner;

/**
 *
 * @author TungDuy
 */
public class Vase extends Item {
    private int height;
    private String material;

    public Vase() {
    }

    public Vase(int value, String creator,int height, String material) {
        super(value, creator);
        this.height = height;
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public int getHeight() {
        return height;
    }

     public void setHeight(int height) {
        this.height = height;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void output(){
        System.out.println("Height: " + this.height);
        System.out.println("Material: " + this.material);
    }
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter height: ");
        this.height = sc.nextInt();
        
        System.out.println("Enter material: ");
        this.material = sc.nextLine();
    }
}