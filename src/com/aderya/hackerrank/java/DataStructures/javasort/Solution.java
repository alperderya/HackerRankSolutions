package com.aderya.hackerrank.java.DataStructures.javasort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Student implements Comparable<Student>{
    private int id;
    private String fname;
    private double cgpa;
    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }

    public int compareTo(Student o) {
        if(this.cgpa>o.cgpa) return -1;
        if(this.cgpa<o.cgpa) return 1;
        if(this.cgpa==o.cgpa){
            int nameComparison = this.fname.compareTo(o.fname);
            if(nameComparison==0){
                if(this.id<o.id) return -1;
                if(this.id>o.id) return 1;
            }else{
                return nameComparison;
            }
        }
        return -1;
    }

}

//Complete the code
public class Solution
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        while(testCases>0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }

        Collections.sort(studentList);

        for(Student st: studentList){
            System.out.println(st.getFname());
        }
    }
}