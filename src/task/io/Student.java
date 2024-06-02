package task.io;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private List<String> students;

    public Student() {
        this.students = new ArrayList<>();
    }

    public void addStudent(String studentName) {
        students.add(studentName);
    }

    public void removeStudent(String studentName) {
        students.remove(studentName);
    }

    public void printStudentList() {
        System.out.println("Student List:");
        for (String student : students) {
            System.out.println(student);
        }
    }

    public static void main(String[] args) {
        Student studentList = new Student();
        studentList.addStudent("Иванов");
        studentList.addStudent("Петров");
        studentList.addStudent("Сидоров");

        studentList.printStudentList();

        studentList.removeStudent("Петров");

        studentList.printStudentList();
    }
}



