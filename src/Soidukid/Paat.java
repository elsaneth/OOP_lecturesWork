package Soidukid;

public class Paat extends Soiduk {
    public Paat(String number) {
        this.number = number;
    }

    double syvis;

    public Paat() {
    }

    public double getSyvis() {
        return syvis;
    }

    public void setSyvis(double syvis) {
        this.syvis = syvis;
    }

    public void setHind(double syvis, int maxKiirus) {
        if (syvis < 0.5) {
            this.hind = 100;
        } else {
            if (maxKiirus < 10) {
                this.hind = 300;
            } else {
                this.hind = 1500;
            }
        }
    }
}
