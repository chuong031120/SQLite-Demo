package com.example.sqlitedemoapplicationactivity;

public class Student {
    private int studentid;
    private String studentname;
    public Student(){

    }

    public Student(int id, String name){
        this.studentid = id;
        this.studentname = name;
    }



    public int getStudentID(){
        return this.studentid;
    }
    public void setStudentID(int id){
        this.studentid = id;
    }

    public String getStudentName(){
        return this.studentname;
    }
    public void setStudentName(String name){
        this.studentname = name;
    }
}
