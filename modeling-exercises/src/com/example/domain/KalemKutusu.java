package com.example.domain;

import java.util.List;

public class KalemKutusu {
	// instance variable -> attribute
	private List<Kalem> kalemler;
	
	public void sakla(Kalem kalem) {
		kalemler.add(kalem);
	}
	
	public int kalemSayısı() {
		return kalemler.size();
	}
	
	// getirKalem: method's name
	// return type: Kalem
	// parameters: single parameter variable: renk -> Renk
	public Kalem rengeGöreKalemGetir(Renk renk) {
		for (Kalem kalem : kalemler) {
			if(kalem.rengi().equals(renk) ) {
				return kalem;
			}				
		}
		return null;
	}
}

