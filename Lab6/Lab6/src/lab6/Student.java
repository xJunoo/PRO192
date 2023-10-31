package lab6;

/**
 *
 * @author TungDuy
 */
public class Student {
    private String code;
    private String name;
    private int mark;

    public Student() {
    }

    public Student(String code, String name, int mark) {
        this.code = code;
        this.name = name;
        this.mark = (mark >= 0 && mark <= 10) ? mark : 0;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public int getMark() {
        return mark;
    }
    
    public void setName(String name) {
        name = name.trim().toUpperCase();

        if (!name.isEmpty()) {
            this.name = name;
        }
    }
    
    public void setMark(int mark) {
        this.mark = (mark >= 0 && mark <= 10) ? mark : this.mark;
    }

    @Override
    public String toString() {
        return this.code + ", " + this.name + ", " + this.mark;
    }
}
