package org.example;

public class Main {
    public static void main(String[] args) {
        studentdb s=new studentdb();
        s.createTable();
        s.createStud(new Student(1,"sammy",80));
        s.createStud(new Student(2,"jimmy",60));
        s.createStud(new Student(3,"rammy",40));
        s.readStud();
        s.updateGrade(3,70);
        s.readStud();
    }
}