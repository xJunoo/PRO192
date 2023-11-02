/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tung Duy
 */
public class Robot {
    public int type;
    public String label;
    public Robot(){
        
    }
    public Robot(String label,int type){
        this.label = label;
        this.type = type;
    }
    public String getLabel(){
        return this.label;      
    }
    public void setLabel(String label){
        this.label = label;      
    }
    public int getType(){
        return this.type;      
    }
    public void setType(int type){
        this.type = type;      
    }
    @Override
    public String toString(){
        return this.label + "," + this.type;
    }
}
