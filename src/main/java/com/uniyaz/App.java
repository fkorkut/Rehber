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
	       Islemler islem=new Islemler();
	       
	       while(true) {  
	    	   System.out.println("Islem Seciniz");
	    	   
	    	   System.out.println("1.Kayıt");
	    	   System.out.println("2.Silme");
	    	   System.out.println("3.Listele");
	    	   System.out.println("4.Arama");
	    	   System.out.println("5.Çıkış");
	           
	           int yanit=input.nextInt();
	          
	           Scanner scanner=new Scanner(System.in);
	            if(yanit==1) {
					islem.kayitVerileriAlmaEkleme(scanner,kisiList);
	           }
	            else if(yanit==2) {
					islem.listele(kisiList);
	            	int id=scanner.nextInt();
					islem.sil(id,kisiList);
	            }
	            else if(yanit==3) {
					islem.listele(kisiList);
	            }
	            else if(yanit==4) {
	            	String aranan=scanner.nextLine();
					islem.arama(aranan,kisiList);
	            }
	            else if(yanit==5) {
	            	System.exit(0);
	            	break;
	            }
	           
	       }
	}


	
}
