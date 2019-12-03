package com.uniyaz;

public class Kisi {

	private String ad;
	private String soyad;
	private int telefon;
	private static int kisiId;
	private int id;
	
	Kisi(String ad,String soyad,int telefon)  {
		this.kisiId++;
		this.ad=ad;
		this.soyad=soyad;
		this.telefon=telefon;
		this.id=kisiId;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public int getTelefon() {
		return telefon;
	}

	public void setTelefon(int telefon) {
		this.telefon = telefon;
	}

	public static int getKisiId() {
		return kisiId;
	}

	public static void setKisiId(int kisiId) {
		Kisi.kisiId = kisiId;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

	
}
