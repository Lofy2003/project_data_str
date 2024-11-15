/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_data_str;

/**
 *
 * @author hp
 */
public class Student {
    String id;
    String first_name;
    String last_name;
    double mid_exam;
    double final_exam;
    String total;
    String estimation;

    public Student(String id, String first_name, String last_name, double mid_exam, double final_exam, String total, String estimation) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.mid_exam = mid_exam;
        this.final_exam = final_exam;
        this.total = total;
        this.estimation = estimation;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public double getMid_exam() {
        return mid_exam;
    }

    public void setMid_exam(double mid_exam) {
        this.mid_exam = mid_exam;
    }

    public double getFinal_exam() {
        return final_exam;
    }

    public void setFinal_exam(double final_exam) {
        this.final_exam = final_exam;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getEstimation() {
        return estimation;
    }
    public void setEstimation(String estimation) {
        this.estimation = estimation;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", mid_exam=" + mid_exam + ", final_exam=" + final_exam + ", total=" + total + ", estimation=" + estimation + '}';
    }   
}
