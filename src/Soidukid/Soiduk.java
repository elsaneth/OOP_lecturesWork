package Soidukid;

public class Soiduk {
    String number;
    int maxKiirus;
    int hind;


    public String getNumber() {
        return number;
    }

    public int getMaxKiirus() {
        return maxKiirus;
    }

    public int getHind() {
        return hind;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setMaxKiirus(int maxKiirus) {
        this.maxKiirus = maxKiirus;
    }

    public void setHind() {
        this.hind = 0;
    }

    @Override
    public String toString() {
        return "\n{Number: " + this.number + ", max kiirus: " + this.maxKiirus + ", hind: " + this.hind + "}";
    }
}

