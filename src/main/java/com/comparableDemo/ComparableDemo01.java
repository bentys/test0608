package com.comparableDemo;

public class ComparableDemo01 {

    public static void main(String args[]){
        Student stu[]={
                new Student("zhangsan1",203,199.0f),
                new Student("zhangsan42",202,399.0f),

                new Student("zhangsan3",204,299.0f),
        };
        java.util.Arrays.sort(stu);

        for(int i=0;i<stu.length;i++){

            System.out.println(stu[i]);
        }
    }
}

class  Student implements Comparable<Student> {
    private String name;
    private int age;
    private float score;

    public Student(String name, int age, float acore) {
        this.name = name;
        this.age = age;
        this.score = score;

    }


    public String toString() {


        return name + "\t\t" + age + "\t\t" + score;
    }


    public int compareTo(Student stu) {
        if (this.score > stu.score){

            return -1;

    }else if(this.score<stu.score){

        return 1;
    }else
    {


        if (this.age > stu.age) {

            return 1;
        } else if (this.age < stu.age) {
            return 1;
        } else {

            return 0;
        }
    }
}

}