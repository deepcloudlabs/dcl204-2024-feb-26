package com.example.domain;

// Domain-Driven Design
// Entity
public class Kalem {
	private QrCode qrCode;	
	private Renk renk;
	
	public Kalem(Renk renk) {
		this.renk = renk;
	}

	public Renk rengi() {
		return renk;
	}
	
	public void yaz() {}
}
