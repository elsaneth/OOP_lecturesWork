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

    @Override
    public void sethind() {
        setHind(maxKiirus);
    }

    public void show() {
        System.out.println("Number: " + this.number + ", max kiirus: " +
                this.maxKiirus + ", hind: " + this.hind + ", max korgus: ");
    }
}
