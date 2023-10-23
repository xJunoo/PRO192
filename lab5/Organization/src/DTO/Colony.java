package DTO;

/**
 *
 * @author TungDuy
 */
public class Colony extends Organization {
    
    protected String place;

    public Colony() {
    }

    public Colony(int size, String place) {
        super(size);
        this.place = place;
    }
    
    public void grow() {
        System.out.println("An annual cycle of growth that begins in spring");
    }
    
    public void reproduce() {
        System.out.println("Colony can reproduce itself through a process");
    }

    @Override
    public String toString() {
        return "The colony size is: " + size + "The colony's place is: " + place;
    }   

    @Override
    public void communucateByTool() {
        System.out.println("The colony communicate by sound");
    }
}