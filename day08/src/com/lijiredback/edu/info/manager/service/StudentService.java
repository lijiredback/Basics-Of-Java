package com.lijiredback.edu.info.manager.service;

import com.lijiredback.edu.info.manager.dao.StudentDao;
import com.lijiredback.edu.info.manager.domain.Student;

// Service：业务逻辑
public class StudentService {
    // 添加学生
    // 1. 创建 StudentDao
    private StudentDao studentDao = new StudentDao();

    public boolean addStudent(Student stu) {

        // 2. 将学生对象，传递给 StudentDao 中的 addStudent 方法
        boolean result = studentDao.addStudent(stu);
        // 3. 将返回的 boolean 类型结果, 返还给 StudentController
        return result;
    }

    // 判断学号是否存在
    public boolean isExists(String id) {
        // 拜托 StudentDao 查看数组
        Student[] stus = studentDao.findAllStudent();

        boolean exists = false; // 默认 id 不存在
        // 遍历数组，获取每一个学生对象，进行判断
        for (int i = 0; i < stus.length; i++) {
            Student student = stus[i];
            // 注意 null
            if (student != null && student.getId().equals(id)) {
                // 接收的 id 在数组中存在
                exists = true;
                break;
            }
        }

        return exists;
    }

    public Student[] findAllStudents() {
        Student[] allStudent = studentDao.findAllStudent();

        boolean flag = false;
        for (int i = 0; i < allStudent.length; i++) {
            Student stu = allStudent[i];
            if (stu != null) {
                flag = true;
                break;
            }
        }
        if (flag) {
            return allStudent;
        } else {
            return null;
        }
    }

    public void deleteStudentById(String delId) {
        studentDao.deleteStudentById(delId);
    }

    public void updateStudent(String updateId, Student newStu) {
        studentDao.updateStudent(updateId, newStu);
    }
}
