package DTO;

import java.util.Scanner;

/**
 *
 * @author TungDuy
 */
public class Painting extends Item{
    private int height;
    private int width;
    boolean isWatercolour;
    boolean isFramed;

    public Painting() {
    }

    public Painting(int value, String creator,int height, int width, boolean isWatercolour, boolean isFramed) {
        super(value, creator);
        this.height = height;
        this.width = width;
        this.isWatercolour = isWatercolour;
        this.isFramed = isFramed;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public boolean isIsWatercolour() {
        return isWatercolour;
    }

    public boolean isIsFramed() {
        return isFramed;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setIsWatercolour(boolean isWatercolour) {
        this.isWatercolour = isWatercolour;
    }

    public void setIsFramed(boolean isFramed) {
        this.isFramed = isFramed;
    }
    
    public void outputPainting(){
        System.out.println("Height: " + this.height);
        System.out.println("width: " + this.width);
        System.out.println("isWatercolour: " + this.isWatercolour);
        System.out.println("isFramed: " + this.isFramed);
    }
    
    public void inputPainting(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Height: ");
        this.height = sc.nextInt();
        
        System.out.println("Enter Width: ");
        this.width = sc.nextInt();
        
        System.out.println("Enter isWatercolour: ");
        this.isWatercolour = sc.nextBoolean();
        
        System.out.println("Enter isFramed: ");
        this.isFramed = sc.nextBoolean();
    }
}