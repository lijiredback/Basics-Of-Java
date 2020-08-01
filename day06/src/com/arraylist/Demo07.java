package com.arraylist;

import com.domain.Student;

import java.util.ArrayList;

/*
    案例：集合元素筛选

    需求：定义一个方法，方法接收一个集合对象（泛型为 Student），
         方法内部将年龄低于18的学生对象找出并存入新集合对象，方法返回新集合
 */
public class Demo07 {
    public static void main(String[] args) {
        ArrayList<Student> arrayList = new ArrayList<>();

        Student stu1 = new Student("张三", 19);
        Student stu2 = new Student("李四", 17);
        Student stu3 = new Student("王五", 17);

        arrayList.add(stu1);
        arrayList.add(stu2);
        arrayList.add(stu3);

        ArrayList<Student> newArrayList =  getList(arrayList);
        for (int i = 0; i < newArrayList.size(); i++) {
            System.out.println(newArrayList.get(i).getName() + "..." + newArrayList.get(i).getAge());
        }
    }

    public static ArrayList<Student> getList(ArrayList<Student> list) {
        ArrayList<Student> newList = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            int age = list.get(i).getAge();
            if (age < 18) {
                newList.add(list.get(i));
            }
        }

        return newList;
    }
}
