package com.lijiredback.edu.info.manager.dao;

import com.lijiredback.edu.info.manager.domain.Student;

// 数据的增删改查
public class StudentDao {
    // 1. 创建学生对象数组
    private static Student[] stus = new Student[5];

    public boolean addStudent(Student stu) {
        // 2. 添加学生到数组

        // 2.1 定义变量 index 为 -1，假设数组已经全部存满，没有 null 的元素
        int index = -1;
        // 2.2 遍历数组，取出每一个元素，判断是否为 null
        for (int i = 0; i < stus.length; i++) {
            Student student = stus[i];
            if (student == null) {
                // 2.3 如果为 null，让 index 变量记录当前的索引位置，并使用 break 结束循环
                index = i;
                break;
            }
        }
        // 返回是否添加成功的 boolean 类型状态
        if (index == -1) {
            // 装满了
            return false;
        } else {
            // 正常添加
            stus[index] = stu;
            return true;
        }

    }

    // 查看
    public Student[] findAllStudent() {
        return stus;
    }

    // 删除学生
    public void deleteStudentById(String delId) {
    }
}
