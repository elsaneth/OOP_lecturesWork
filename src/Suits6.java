import Soidukid.Auto;
import Soidukid.Lennuk;
import Soidukid.Paat;
import Soidukid.Soiduk;

import java.util.ArrayList;
import java.util.List;

public class Suits6 {
    public static void main(String[] args) {
        Auto auto1 = new Auto("111SAL");
        Auto auto2 = new Auto();
        Paat paat1 = new Paat("ABC-123");
        Paat paat2 = new Paat();
        Lennuk lennuk1 = new Lennuk("ESIMENE");
        Lennuk lennuk2 = new Lennuk("TEINE");

        auto2.setNumber("999SAL");
        paat2.setNumber("DEF-456");

        auto1.setMaxKiirus(240);
        auto2.setMaxKiirus(40);

        paat1.setMaxKiirus(8);
        paat2.setMaxKiirus(50);

        lennuk1.setMaxKiirus(800);
        lennuk2.setMaxKiirus(870);

        lennuk1.setMaxKorgus(8);
        lennuk2.setMaxKorgus(12);

        lennuk1.setLennuUlatus(4000);
        lennuk2.setLennuUlatus(8000);

        paat1.setSyvis(0.3);
        paat2.setSyvis(0.8);

        auto1.sethind();
        auto2.sethind();
        paat1.sethind();
        paat2.sethind();
        paat2.sethind();
        lennuk1.sethind();
        lennuk2.sethind();

        String auto1Nr = auto1.getNumber();
        String auto2Nr = auto2.getNumber();
        String paat1Nr = paat1.getNumber();
        String paat2Nr = paat2.getNumber();

        int auto1Hind = auto1.getHind();
        int auto2Hind = auto2.getHind();
        int paat1Hind = paat1.getHind();
        int paat2Hind = paat2.getHind();

        List<Soiduk> soidukid = new ArrayList<>();

        soidukid.add(auto1);
        soidukid.add(auto2);
        soidukid.add(paat1);
        soidukid.add(paat2);
        soidukid.add(lennuk1);
        soidukid.add(lennuk2);

        System.out.println("Soidukid ja nende ühised andmed: " + soidukid);
        System.out.println();
        System.out.println("SOIDUKITE DETAILNE ULEVAADE: ");
        System.out.println("LENNUKID: ");
        lennuk1.show();
        lennuk2.show();
        System.out.println("AUTOD: ");
        auto1.show();
        auto2.show();
        System.out.println("PAADID: ");
        paat1.show();
        paat2.show();
    }
}
