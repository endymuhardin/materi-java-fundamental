package belajar.oop;

import java.math.BigDecimal;

public class Produk {

	private String kode;
	private String nama;
	private BigDecimal harga;

	public String getKode(){
		return kode;
	}

	public void setKode(String k){
		this.kode = k;
	}

	public String getNama(){
		return nama;
	}

	public void setNama(String n){
		this.nama = n;
	}

	public BigDecimal getHarga(){
		return harga;
	}

	public void setHarga(BigDecimal n){
		this.harga = n;
	}
}