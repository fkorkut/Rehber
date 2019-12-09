package com.uniyaz;

import java.util.List;
import java.util.Scanner;

public class Islemler {
    public static void kayitVerileriAlmaEkleme(Scanner input, List<Kisi> kisiList) {
        System.out.println("Isim");
        String ad=input.nextLine();
        System.out.println("Soyad");
        String soyad=input.nextLine();
        System.out.println("Telefon");
        int telefon=input.nextInt();
        Kisi kisi=new Kisi(ad,soyad,telefon);
        kisiList.add(kisi);
    }

    public static void listele(List<Kisi> kisiList) {
        for(Kisi kisi:kisiList) {
            System.out.println(kisi.getId() +" "+kisi.getAd()+" "+kisi.getTelefon());
        }
    }

    public static void sil(int id,List<Kisi> kisiList) {
        for(Kisi kisi:kisiList) {
            if(kisi.getId()==id) {
                kisiList.remove(kisi);
                break;
            }
        }
    }
    public static void arama(String ad,List<Kisi> kisiList) {
        for(Kisi kisi:kisiList) {
            if(kisi.getAd()==ad) {
                System.out.println(kisi.getAd()+" "+kisi.getSoyad()+" "+kisi.getTelefon());
            }
        }
    }
}
