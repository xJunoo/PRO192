/**
 *
 * @author Tung Duy
 */
public class Engine {
    public int power;
    public String designer;
    public Engine(){
        
    }
    public Engine(String designer,int power){
        this.designer = designer;
        this.power = power;
    }
    public String getDesigner(){
        char firstChar = Character.toLowerCase(this.designer.substring(0, 3).charAt(0));
        return firstChar + this.designer.substring(0, 3).substring(1);
    }
    public void setDesigner(String designer){
        this.designer = designer;
    }
    public int getPower(){
        return this.power;
    }
    public void setPower(int power){
        this.power = power;
    }
}
