package Soidukid;

public class Auto extends Soiduk {

    public Auto(String number) {
        this.number = number;
    }

    public Auto() {

    }

    public void setHind(int maxKiirus) {
        if (maxKiirus < 50) {
            this.hind = 400;
        } else {
            this.hind = 1000;
        }
    }
}
