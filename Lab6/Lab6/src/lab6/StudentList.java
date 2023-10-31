package lab6;

import java.util.ArrayList;

/**
 *
 * @author TungDuy
 */
public class StudentList extends ArrayList<Student>{
    public StudentList(){
        super();
    }
    
    public Student search(String code) {
        code = code.trim().toUpperCase();
        for (int i =0; i<this.size(); i++) {
            if (this.get(i).getCode().equals(code)) {
                return this.get(i);
            }
        }
        return null;
    }
    
    private boolean isCodeDuplicated(String code) {
        code = code.trim().toUpperCase();
        return this.search(code) !=null;
    }
    
    public void addStudent() {
    String newCode = null;
    String newName = null;
    int newMark = 0;
        
    boolean codeDuplicated = true;
        
    while (codeDuplicated) {
        newCode = Inputter.inputPattern("St. code S000: ", "[sS][\\d]{3}");
        newCode = newCode.trim().toUpperCase();
        codeDuplicated = isCodeDuplicated(newCode);

        if (codeDuplicated) {
            System.out.println("Code is duplicated!");
        } 
    }

    newName = Inputter.inputNonBlankStr("Name of new student: ");
    newName = newName.toUpperCase();
    newMark = Inputter.InputInt("Mark: ", 0, 10);

    Student newStudent = new Student(newCode, newName, newMark);

    this.add(newStudent);

    System.out.println("Student " + newCode + " has been added.");
}
    
    
    public void searchStudent() {
        if (this.isEmpty()) {
            System.out.println("Empty list. No search can be performed!");
        } else {
            String searchCode = Inputter.inputStr("Input student code for search: ");
            Student student = this.search(searchCode);

            if (student != null) {
                System.out.println("Student " + searchCode + " doesn't existed!");
            } else {
                System.out.println("Found: " + student);
            }
        }
    }

    public void updateStudent() {
        if (this.isEmpty()) {
            System.out.println("Empty list. No update can be performed!");
        } else {
            String updateCode = Inputter.inputStr("Input code of updated student: ");
            Student student = this.search(updateCode);

            if (student == null) {
                System.out.println("Student " + updateCode + " doesn't existed!");
            } else {
                String msg = "Old name: " + student.getName() + ", new name: ";

                String newName = Inputter.inputNonBlankStr(msg);
                student.setName(newName);

                msg = "Old mark: " + student.getMark() + ", new mark 0..10: ";

                int newMark = Inputter.InputInt(msg, 0, 10);
                student.setMark(newMark);

                System.out.println("Student " + updateCode + " has been updated.");
            }
        }
    }

    public void removeStudent() {
        if (this.isEmpty()) {
            System.out.println("Empty list");
        } else {
            String removeCode = Inputter.inputStr("Input code of removed student: ");
            Student student = this.search(removeCode);

            if (student == null) {
                System.out.println("Student " + removeCode + " doesn't existed!");
            } else {
                this.remove(student);

                System.out.println("Student " + removeCode + " has been removed.");
            }
        }
    }

    public void printAll() {
        if (this.isEmpty()) {
            System.out.println("Empty list.");
        } else {
            System.out.println("Student list: ");

            for (Student student : this) {
                System.out.println(student);
            }

            System.out.println("Total: " + this.size() + " student(s).");
        }
    }
}
