package Allowence;

import java.time.LocalDate;

public class Operational extends Salary {
    private double Days;
    private double Lunch;
    private double transport;

    public Operational(LocalDate payDay, double days, double lunch, double transport) {
        super(payDay);
        Days = days;
        Lunch = lunch;
        this.transport = transport;
    }

    public double getDays() {
        return Days;
    }

    public void setDays(double days) {
        Days = days;
    }

    public double getLunch() {
        return Lunch;
    }

    public void setLunch(double lunch) {
        Lunch = lunch;
    }

    public double getTransport() {
        return transport;
    }

    public void setTransport(double transport) {
        this.transport = transport;
    }

}
