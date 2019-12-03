package com.uniyaz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App 
{
	 public static void main( String[] args )
	    {
	       
	       Scanner input=new Scanner(System.in);
	       List<Kisi> kisiList=new ArrayList();
	           
	       
	       while(true) {  
	    	   System.out.println("Ýþlem Seciniz");
	    	   
	    	   System.out.println("1.Kayýt");
	    	   System.out.println("2.Silme");
	    	   System.out.println("3.Listele");
	    	   System.out.println("4.Arama");
	    	   System.out.println("5.Çýkýþ");
	           
	           int yanit=input.nextInt();
	          
	           Scanner scanner=new Scanner(System.in);
	            if(yanit==1) {
	               kayitVerileriAlmaEkleme(scanner,kisiList);
	           }
	            else if(yanit==2) {
	            	listele(kisiList);
	            	int id=scanner.nextInt();
	            	sil(id,kisiList);
	            }
	            else if(yanit==3) {
	            	listele(kisiList);
	            }
	            else if(yanit==4) {
	            	String aranan=scanner.nextLine();
	            	arama(aranan,kisiList);
	            }
	            else if(yanit==5) {
	            	break;
	            }
	           
	       }
	}

	public static void kayitVerileriAlmaEkleme( Scanner input, List<Kisi> kisiList) {
	
		
		   System.out.println("Ýsim");
		   String ad=input.nextLine();
		   System.out.println("Soyad");
		   String soyad=input.nextLine();
		   System.out.println("Telefon");
		   int telefon=input.nextInt();
		   Kisi kisi=new Kisi(ad,soyad,telefon);
		   kisiList.add(kisi);
	}
	
	public static void listele(List<Kisi> kisiList) {
		 for(Kisi arr:kisiList) {
			 System.out.println(arr.getAd() + arr.getId());
		 }
	}
	
	public static void sil(int id,List<Kisi> kisiList) {
		for(Kisi arr:kisiList) {
			if(arr.getId()==id) {
				kisiList.remove(arr);
				break;//çýkýþ yapýlmasý lazým
			}
		 }
	}
	public static void arama(String ad,List<Kisi> kisiList) {
		for(Kisi arr:kisiList) {
			if(arr.getAd().equals(ad)) {
				System.out.println(ad);
			}
		 }
	}
	
}
