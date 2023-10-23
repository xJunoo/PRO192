package DTO;

/**
 *
 * @author TungDuy
 */

abstract public class Organization {
    protected int size;

    public Organization() {
    }

    public Organization(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    public abstract void communucateByTool();

    @Override
    public String toString() {
        return "The Organization's size is: " + size;  
    }
}
