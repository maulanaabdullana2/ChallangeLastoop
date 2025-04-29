package Allowence;

import java.time.LocalDate;

public class Tax extends Salary {
    private double PPH;
    private double Tapera;
    private double PPN;

    public Tax(LocalDate payDay, double PPH, double tapera, double PPN) {
        super(payDay);
        this.PPH = PPH;
        Tapera = tapera;
        this.PPN = PPN;
    }

    public double getPPH() {
        return PPH;
    }

    public void setPPH(double PPH) {
        this.PPH = PPH;
    }

    public double getTapera() {
        return Tapera;
    }

    public void setTapera(double tapera) {
        Tapera = tapera;
    }

    public double getPPN() {
        return PPN;
    }

    public void setPPN(double PPN) {
        this.PPN = PPN;
    }
}
