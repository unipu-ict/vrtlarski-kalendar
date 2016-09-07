package hr.unipu.hortus;


import java.util.ArrayList;
import java.util.List;

public class Podaci {
    private static List<Biljka> podaci = new ArrayList<>();

    public static List<Biljka> dajPodatke() {
        return podaci;
    }
    public static List<Biljka> dajBiljkeKojeSeSiju(int mjesec) {
        List<Biljka> biljke = new ArrayList<>();
        //za svaku biljku...
        for (Biljka biljka:podaci) {
            //...i svaki njen mogući mjesec sadnje...
            for(int mjesecSadnje:biljka.getMjeseciSadnjeArray()) {
                //...usporedi odgovara li traženom mjesecu...
                if(mjesecSadnje==mjesec) {
                    //...i ako da, dodaj tu biljku na popis i prekini gledati mjesece te biljke
                    biljke.add(biljka);
                    break;
                }
            }
        }

        return biljke;
    }
    public static List<Biljka> dajBiljkeKojeSeBeru(int mjesec) {
        List<Biljka> biljke = new ArrayList<>();
        //za svaku biljku...
        for (Biljka biljka:podaci) {
            //...i svaki njen mogući mjesec berbe...
            for(int mjesecBerbe:biljka.getMjeseciBerbeArray()) {
                //...usporedi odgovara li traženom mjesecu...
                if(mjesecBerbe==mjesec) {
                    //...i ako da, dodaj tu biljku na popis i prekini gledati mjesece te biljke
                    biljke.add(biljka);
                    break;
                }
            }
        }

        return biljke;
    }


    static {
        // naziv, opis, mjeseci sadnje, mjeseci berbe, slika
        podaci.add(new Biljka("Brokula", "Brokula (također: brokoli, brokolj i brokulica, lat. bracchium) je povrće iz porodice kupusnjača kojoj još pripadaju prokulica,kupus, koraba, karfiola, kelj i druge. Smatra se izvornim oblikom karfiola, a uzgaja se zbog središnjeg i postranih zelenihcvjetnih izdanaka smještenih na razgranatoj i mekanoj stabljici.", new int[]{3,4,5,6,7}, new int[]{6,7,8,9}, "brokula"));
        podaci.add(new Biljka("Cvjetača", "Cvjetača ili karfiol (Brassica oleracea var. botrytis) prehrambena biljka porodice Brassicaceae (krstašice ili kupusovke) koja se razvila kao jedna od brojnih podvrsti divljeg kupusa (Brassica oleracea L.).", new int[]{1,2,3,4,5,6,7}, new int[]{5,6,7,8,9,10}, "cvjetaca"));
        podaci.add(new Biljka("Kelj", "Kelj (Brassica oleracea var. sabauda) biljka je slična glavatom kupusu samo što ima smežurano lišće i više ovojna zelena lišća oko glave.", new int[]{3,4,5}, new int[] {1,2,3,9,10,11,12}, "kelj"));
        podaci.add(new Biljka("Luk","Luk (obični) ili crveni luk (lat. Allium cepa) biljka je iz porodice Alliaceae. Srodna je češnjaku, poriluku i vlascu. Upotrebljava u kulinarstvu imedicini.", new int[]{3,4,5}, new int[]{8,9},"luk"));
        podaci.add(new Biljka("Grašak","Grašak (lat. Pisum sativum) jednogodišnja je biljka iz porodice mahunarki, a kao povrtlarska kultura pripada zrnastim mahunarkama.", new int[]{3,4,5,6,7}, new int[]{5,6,7,8,9,10},"grasak"));
        podaci.add(new Biljka("Patlidžan","Patlidžan (lat. Solanum melongena) ili balancana je jednogodišnja vrsta biljke iz roda Solanum. Areal rasprostranjenja ove vrste obuhvaća istočnu Indiju i Šri Lanku, ali je ranom domestifikacijom proširen najprije na područje istočne Azije, Mediterana i Europe, a kasnije i na američke kontinente. Uzgaja se zbog plodova koji se koriste kao povrće.", new int[]{5,6}, new int[]{6,7,8,9,10},"patlidzan"));
        podaci.add(new Biljka("Mrkva","Mrkva (Daucus carota) je dvogodišnja biljka iz porodice štitarki. Povrtna biljka (Daucus carota L. ssp. sativus) ima nekoliko narodnih naziva merlin, koren, žuta repa, mrkvač.",new int[]{3,4,5,6,7}, new int[]{6,7,8,9}, "mrkva"));
        podaci.add(new Biljka("Krastavac","Krastavac (lat. Cucumis sativus) jednogodišnja je biljka iz porodice tikvi (lat. Cucurbitaceae).", new int[] {4,5}, new int[]{6,7,8,9}, "krastavac"));
        podaci.add(new Biljka("Paprika","Paprika je jednogodišnja povrtna kultura uspravne razgranate stabljike, visine 50-80 cm.", new int[]{2,3,4}, new int[]{7,8,9,10},"paprika"));
        podaci.add(new Biljka("Rajčica","Rajčica (česti nazivi paradajz, pomidor; Solanum lycopersicum L.) je jednogodišnja povrtna biljka bliži srodnik krumpiru, koja spada u porodicu voća a ne povrća kako se učestalno smatra",new int[]{2,3,4}, new int[]{7,8,9,10},"rajcica"));


    }

}