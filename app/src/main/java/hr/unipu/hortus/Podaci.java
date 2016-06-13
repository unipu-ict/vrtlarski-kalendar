package hr.unipu.hortus;


import java.util.ArrayList;
import java.util.List;

public class Podaci {
    private static List<Biljka> podaci = new ArrayList<>();

    public static List<Biljka> dajPodatke() {
        return podaci;
    }

    static {
        // naziv, opis, mjeseci sadnje, mjeseci berbe, slika
        podaci.add(new Biljka("Brokula", "Brokula (također: brokoli, brokolj i brokulica, lat. bracchium) je povrće iz porodice kupusnjača kojoj još pripadaju prokulica,kupus, koraba, karfiola, kelj i druge. Smatra se izvornim oblikom karfiola, a uzgaja se zbog središnjeg i postranih zelenihcvjetnih izdanaka smještenih na razgranatoj i mekanoj stabljici.", new int[]{3,4,5,6,7}, new int[]{6,7,8,9}, "brokula"));
        podaci.add(new Biljka("Cvjetača", "Cvjetača ili karfiol (Brassica oleracea var. botrytis) prehrambena biljka porodice Brassicaceae (krstašice ili kupusovke) koja se razvila kao jedna od brojnih podvrsti divljeg kupusa (Brassica oleracea L.).", new int[]{1,2,3,4,5,6,7}, new int[]{5,6,7,8,9,10}, "cvjetaca"));


    }

}