import Soidukid.Auto;
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

        auto2.setNumber("999SAL");
        paat2.setNumber("DEF-456");

        auto1.setMaxKiirus(240);
        auto2.setMaxKiirus(40);

        paat1.setMaxKiirus(8);
        paat2.setMaxKiirus(50);

        paat1.setSyvis(0.3);
        paat2.setSyvis(0.8);

        auto1.setHind(auto1.getMaxKiirus());
        auto2.setHind(auto2.getMaxKiirus());
        paat1.setHind(paat1.getSyvis(), paat1.getMaxKiirus());
        paat2.setHind(paat2.getSyvis(), paat1.getMaxKiirus());
        paat2.setHind();

        String auto1Nr = auto1.getNumber();
        String auto2Nr = auto2.getNumber();
        String paat1Nr = paat1.getNumber();
        String paat2Nr = paat2.getNumber();

        int auto1Hind = auto1.getHind();
        int auto2Hind = auto2.getHind();
        int paat1Hind = paat1.getHind();
        int paat2Hind = paat2.getHind();

        System.out.println("Auto1 number: " + auto1.getNumber() + ", hind: " + auto1Hind + ", max kiirus: " + auto1.getMaxKiirus());
        System.out.println("Auto2 number: " + auto2Nr + ", hind: " + auto2Hind + ", max kiirus: " + auto2.getMaxKiirus());
        System.out.println("Paat1 number: " + paat1Nr + ", hind: " + paat1Hind + ", max kiirus: " + paat1.getMaxKiirus());
        System.out.println("Paat2 number: " + paat2Nr + ", hind: " + paat2Hind + ", max kiirus: " + paat2.getMaxKiirus());

        List<Soiduk> soidukid = new ArrayList<>();

        soidukid.add(auto1);
        soidukid.add(auto2);
        soidukid.add(paat1);
        soidukid.add(paat2);

        System.out.println("Soidukid: " + soidukid);
    }
}
