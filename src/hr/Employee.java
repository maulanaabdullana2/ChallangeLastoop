package hr;

import java.time.LocalDate;
import java.util.Date;

public class Employee {
    private double empNo;
    private String fullName;
    private LocalDate hireDate;
    private Status Status;
    private  double Salary;
    private double totalInsurance;
    private double totalOvertime;
    private double totalTax;
    private int totalSalary;
    private double poProject;
    private double totalAlawance;


    public Employee(double empNo, String fullName, LocalDate hireDate, Status status, double salary) {
        this.empNo = empNo;
        this.fullName = fullName;
        this.hireDate = hireDate;
        Status = status;
        Salary = salary;
    }

    public double getEmpNo() {
        return empNo;
    }

    public void setEmpNo(double empNo) {
        this.empNo = empNo;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public Status getStatus() {
        return Status;
    }

    public void setStatus(Status status) {
        Status = status;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    public double getTotalInsurance() {
        return totalInsurance;
    }

    public void setTotalInsurance(double totalInsurance) {
        this.totalInsurance = totalInsurance;
    }

    public double getTotalOvertime() {
        return totalOvertime;
    }

    public void setTotalOvertime(double totalOvertime) {
        this.totalOvertime = totalOvertime;
    }

    public double getTotalTax() {
        return totalTax;
    }

    public void setTotalTax(double totalTax) {
        this.totalTax = totalTax;
    }

    public int getTotalSalary() {
        return totalSalary;
    }

    public void setTotalSalary(int totalSalary) {
        this.totalSalary = totalSalary;
    }

    public double getPoProject() {
        return poProject;
    }

    public void setPoProject(double poProject) {
        this.poProject = poProject;
    }

    public double getTotalAlawance() {
        return totalAlawance;
    }

    public void setTotalAlawance(double totalAlawance) {
        this.totalAlawance = totalAlawance;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empNo=" + empNo +
                ", fullName='" + fullName + '\'' +
                ", hireDate=" + hireDate +
                ", Status=" + Status +
                ", Salary=" + Salary +
                ", totalInsurance=" + totalInsurance +
                ", totalOvertime=" + totalOvertime +
                ", totalTax=" + totalTax +
                ", totalSalary=" + totalSalary +
                ", totalAlawance=" + totalAlawance +
                '}';
    }
}
