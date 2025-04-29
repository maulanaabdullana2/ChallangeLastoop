package Allowence;

import java.time.LocalDate;

public class Insurence extends Salary {
    private double Self;
    private  double Dependent;
    private  double  Medical;

    public Insurence(LocalDate payDay, double self, double dependent, double medical) {
        super(payDay);
        Self = self;
        Dependent = dependent;
        Medical = medical;
    }


    public double getSelf() {
        return Self;
    }

    public void setSelf(double self) {
        Self = self;
    }

    public double getDependent() {
        return Dependent;
    }

    public void setDependent(double dependent) {
        Dependent = dependent;
    }

    public double getMedical() {
        return Medical;
    }

    public void setMedical(double medical) {
        Medical = medical;
    }


}
