package com.zym.principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhouyumeng
 * @date 2021/11/29
 **/
public class Demeter {

    public static void main(String[] args) {
        SchoolManager schoolManager = new SchoolManager();
        schoolManager.printEmployee(new CollegeManager());
    }

    static class SchoolEmployee{
        int id;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }
    }

    static class CollegeEmployee{
        int id;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }
    }

    static class SchoolManager{

        List<SchoolEmployee> getAllSchoolEmployee() {
            List<SchoolEmployee> schoolEmployeeList = new ArrayList<>(10);
            for (int i = 0; i < 10; i++) {
                SchoolEmployee schoolEmployee = new SchoolEmployee();
                schoolEmployee.setId(i);
                schoolEmployeeList.add(schoolEmployee);
            }
            return schoolEmployeeList;
        }

        void printEmployee(CollegeManager collegeManager) {
            collegeManager.printEmployee();
            System.out.println("-------开始打印总部员工-------");
            for (SchoolEmployee schoolEmployee : getAllSchoolEmployee()) {
                System.out.println(schoolEmployee.getId());
            }
        }
    }

    static class CollegeManager{

        List<CollegeEmployee> getAllCollegeEmployee() {
            List<CollegeEmployee> collegeEmployeeList = new ArrayList<>(5);
            for (int i = 0; i < 5; i++) {
                CollegeEmployee collegeEmployee = new CollegeEmployee();
                collegeEmployee.setId(i);
                collegeEmployeeList.add(collegeEmployee);
            }
            return collegeEmployeeList;
        }

        void printEmployee() {
            System.out.println("-------开始打印学院员工-------");
            for (CollegeEmployee collegeEmployee : getAllCollegeEmployee()) {
                System.out.println(collegeEmployee.getId());
            }
        }
    }

}
