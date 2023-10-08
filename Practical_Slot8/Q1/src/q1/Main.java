/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1;

import java.util.Scanner;

/**
 *
 * @author Tung Duy
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("Enter designer");
            String designer = scan.nextLine();
            if(designer.length() < 3){
                System.out.println("designer length >= 3");
                continue;
            }
            System.out.println("Enter power");
            int power = scan.nextInt();
            printChoice();
            int userChoice = scan.nextInt();
            if(userChoice > 2){
                System.out.println("Error choice input");
                printChoice();
                continue;
            }
            Engine engine = new Engine(designer,power);
            switch(userChoice){
                case 1:
                    System.out.println(engine.getDesigner());
                    break;
                case 2:
                    System.out.println("Enter new power");
                    engine.power = scan.nextInt();
                    System.out.println(engine.power);
                    break;
            }
            break;
        }
    }
    
    
    
    public static void printChoice(){
        System.out.println("1. Test getDesigner()");
        System.out.println("2. Test setPower()");
        System.out.println("Enter TC(1 or 2)");
    }
}
