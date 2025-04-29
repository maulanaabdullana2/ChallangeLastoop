package hr;

import Allowence.ISalary;
import Allowence.Insurence;
import Allowence.Overtime;
import Allowence.Tax;

import java.time.LocalDate;

public class Permanent extends Employee implements ISalary {
    private Insurence insurence;
    private Overtime overtime;
    private Tax tax;

    public Permanent(double empNo, String fullName, LocalDate hireDate, Status status, double salary, Insurence insurence, Overtime overtime, Tax tax) {
        super(empNo, fullName, hireDate, status, salary);
        this.insurence = insurence;
        this.overtime = overtime;
        this.tax = tax;
    }

    public Insurence getInsurence() {
        return insurence;
    }

    public void setInsurence(Insurence insurence) {
        this.insurence = insurence;
    }

    public Overtime getOvertime() {
        return overtime;
    }

    public void setOvertime(Overtime overtime) {
        this.overtime = overtime;
    }

    public Tax getTax() {
        return tax;
    }

    public void setTax(Tax tax) {
        this.tax = tax;
    }

    @Override
    public void calculteTotalInsurance() {
        setTotalInsurance((getSalary() * insurence.getMedical() / 100) * (insurence.getSelf() + insurence.getDependent()));
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
