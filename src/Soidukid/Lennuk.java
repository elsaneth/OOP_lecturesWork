package Soidukid;

public class Lennuk extends Soiduk {
    int maxKorgus;
    int lennuUlatus;

    public Lennuk(String number) {
        this.number = number;
    }

    public int getMaxKorgus() {
        return maxKorgus;
    }

    public int getLennuUlatus() {
        return lennuUlatus;
    }

    public void setMaxKorgus(int maxKorgus) {
        this.maxKorgus = maxKorgus;
    }

    public void setLennuUlatus(int lennuUlatus) {
        this.lennuUlatus = lennuUlatus;
    }

    public void setHind(int maxKorgus, int lennuUlatus) {
        if (maxKorgus < 10) {
            this.hind = 30000;
        } else {
            if (lennuUlatus < 5000) {
                this.hind = 35000;
            } else {
                this.hind = 40000;
            }
        }
    }

    @Override
    public void sethind() {
        setHind(maxKorgus, lennuUlatus);
    }

    @Override
    public void show() {
        System.out.println("Number: " + this.number + ", max kiirus: " +
                this.maxKiirus + ", hind: " + this.hind + ", max korgus: " +
                this.maxKorgus + ", lennu ulatus: " + this.lennuUlatus);
    }
}
