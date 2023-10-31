package lab6;

import java.util.ArrayList;
import lab6.Inputter;
import lab6.Student;

public class StudentList {
    private ArrayList<Student> listStudents;

    public StudentList() {
        listStudents = new ArrayList<>();
    }

    public Student search(String code) {
        code = code.trim().toUpperCase();
        for (int i = 0; i < listStudents.size(); i++) {
            if (listStudents.get(i).getCode().equals(code)) {
                return listStudents.get(i);
            }
        }
        return null;
    }

    private boolean isCodeDuplicated(String code) {
        code = code.trim().toUpperCase();
        return search(code) != null;
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

        listStudents.add(newStudent);

        System.out.println("Student " + newCode + " has been added.");
    }

    public void searchStudent() {
        if (listStudents.isEmpty()) {
            System.out.println("Empty list. No search can be performed!");
        } else {
            String searchCode = Inputter.inputStr("Input student code for search: ");
            Student student = search(searchCode);

            if (student == null) {
                System.out.println("Student " + searchCode + " doesn't exist!");
            } else {
                System.out.println("Found: " + student);
            }
        }
    }

    public void updateStudent() {
        if (listStudents.isEmpty()) {
            System.out.println("Empty list. No update can be performed!");
        } else {
            String updateCode = Inputter.inputStr("Input code of the student to update: ");
            Student student = search(updateCode);

            if (student == null) {
                System.out.println("Student " + updateCode + " doesn't exist!");
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
        if (listStudents.isEmpty()) {
            System.out.println("Empty list.");
        } else {
            String removeCode = Inputter.inputStr("Input code of the student to remove: ");
            Student student = search(removeCode);

            if (student == null) {
                System.out.println("Student " + removeCode + " doesn't exist!");
            } else {
                listStudents.remove(student);
                System.out.println("Student " + removeCode + " has been removed.");
            }
        }
    }

    public void printAll() {
        if (listStudents.isEmpty()) {
            System.out.println("Empty list.");
        } else {
            System.out.println("Student list: ");
            for (Student student : listStudents) {
                System.out.println(student);
            }

            System.out.println("Total: " + listStudents.size() + " student(s).");
        }
    }
}