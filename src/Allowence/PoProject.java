package Allowence;

import java.time.LocalDate;

public class PoProject extends Salary {
    private double PoProject;

    public PoProject(LocalDate payDay, double poProject) {
        super(payDay);
        PoProject = poProject;
    }


    public double getPoProject() {
        return PoProject;
    }

    public void setPoProject(double poProject) {
        PoProject = poProject;
    }

}
