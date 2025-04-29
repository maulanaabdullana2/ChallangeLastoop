package hr;

import Allowence.ISalary;
import Allowence.Insurence;
import Allowence.Overtime;
import Allowence.Tax;

import java.time.LocalDate;

public class Contract extends Employee implements ISalary {

    private Insurence insurence;
    private Overtime overtime;
    private Tax tax;


    public Contract(double empNo, String fullName, LocalDate hireDate, Status status, double salary, Insurence insurence, Overtime overtime, Tax tax) {
        super(empNo, fullName, hireDate, status, salary);
        this.insurence = insurence;
        this.overtime = overtime;
        this.tax = tax;
    }

    public Insurence getInsurenceb() {
        return insurence;
    }

    public void setInsurenceb(Insurence insurenceb) {
        this.insurence = insurence;
    }

    public Overtime getOvertime() {
        return overtime;
    }

    public void setOvertime(Overtime overtime) {
        this.overtime = overtime;
    }

    @Override
    public void calculteTotalSalry() {
        setTotalInsurance((getSalary() * insurence.getMedical() / 100) * insurence.getSelf());
    }

    @Override
    public void calculateOvetime() {
        setTotalOvertime(overtime.getHours()*overtime.getOvertime());
    }

    @Override
    public void CalculateTotalsalary() {

        setTotalSalary((int) (getSalary() - (getTotalInsurance()+getTotalOvertime()+ getTotalTax())));
    }

    @Override
    public void calculateTax() {
        setTotalTax(getSalary() * (tax.getPPH() + tax.getTapera()) / 100);
    }

    @Override
    public void CalculateAllowence() {

    }
}
