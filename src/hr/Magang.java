package hr;

import Allowence.ISalary;
import Allowence.Operational;

import java.time.LocalDate;

public class Magang extends Employee implements ISalary {
    private  Operational operational;

    public Magang(double empNo, String fullName, LocalDate hireDate, Status status, double salary, Operational operational) {
        super(empNo, fullName, hireDate, status, salary);
        this.operational = operational;
    }

    @Override
    public void calculteTotalInsurance() {

    }

    @Override
    public void calculateOvetime() {

    }

    @Override
    public void calculateTax() {

    }

    @Override
    public void CalculateAllowence() {
        setTotalAlawance((int) (operational.getDays()*(operational.getLunch()+operational.getTransport())));
    }

    @Override
    public void CalculateTotalsalary() {
        setTotalSalary((int) (operational.getDays()*(operational.getLunch()+operational.getTransport())));
    }


}
