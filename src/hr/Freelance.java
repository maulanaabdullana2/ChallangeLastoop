package hr;

import Allowence.ISalary;
import Allowence.PoProject;
import Allowence.Tax;

import java.time.LocalDate;

public class Freelance extends Employee implements ISalary {
    private PoProject poproject;
    private  Tax tax;

    public Freelance(double empNo, String fullName, LocalDate hireDate, Status status, double salary, PoProject poproject, Tax tax) {
        super(empNo, fullName, hireDate, status, salary);
        this.poproject = poproject;
        this.tax = tax;
    }

    public PoProject getPoproject() {
        return poproject;
    }

    public void setPoproject(PoProject poproject) {
        this.poproject = poproject;
    }

    public Tax getTax() {
        return tax;
    }

    public void setTax(Tax tax) {
        this.tax = tax;
    }



    @Override
    public void calculteTotalSalry() {

    }

    @Override
    public void calculateOvetime() {

    }

    @Override
    public void calculateTax() {
        setTotalTax((int) (poproject.getPoProject() * (tax.getPPN() / 100)));
    }

    @Override
    public void CalculateTotalsalary() {
            setTotalSalary((int) (poproject.getPoProject()-getTotalTax()));
    }

    @Override
    public void CalculateAllowence() {

    }
}
