package Allowence;

import java.time.LocalDate;

public class Overtime extends Salary {
    private double hours;
    private double overtime;

    public Overtime(LocalDate payDay, double hours, double overtime) {
        super(payDay);
        this.hours = hours;
        this.overtime = overtime;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public double getOvertime() {
        return overtime;
    }

    public void setOvertime(double overtime) {
        this.overtime = overtime;
    }


}
