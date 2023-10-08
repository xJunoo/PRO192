/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
            System.out.println("Enter label");
            String label = scan.nextLine();
            System.out.println("Enter type");
            int type = scan.nextInt();
            System.out.println("Enter step");
            int step = scan.nextInt();
            System.out.println("1. Test toString()");
            System.out.println("2. Test setData()");
            System.out.println("3. Test getValue()");
            System.out.println("Enter TC(1,2,3)");
            int userChoice = scan.nextInt();
            Robot robot = new Robot(label,type);
            SpecRobot specRobot = new SpecRobot(label,type,step);
            switch(userChoice){
                case 1:
                    System.out.println(robot);
                    System.out.println(specRobot);
                    break;
                case 2:
                    specRobot.setData();
                    break;
                case 3:
                    System.out.println(specRobot.getValue());
                    break;
            }
        
        
    }
}
