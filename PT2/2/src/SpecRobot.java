/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Tung Duy
 */
public class SpecRobot extends Robot{
    public int step;
    public SpecRobot(){
    }
    
    public SpecRobot(String label,int type,int step){
        this.label = label;
        this.type = type;
        this.step = step;
    }
    
    public void setData(){
        String newString = this.label.substring(0, 1) + this.step + this.label.substring(1);
        System.out.println(newString + "," + this.type);
    }
    
    public int getValue(){
        return (this.type < 3 && this.label.contains("A")) ? this.step : this.step + 2;
    }
    @Override
    public String toString(){
        return this.label + "," + this.type + "," + this.step;
    }
}
