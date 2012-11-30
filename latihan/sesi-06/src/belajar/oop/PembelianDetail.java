package belajar.oop;

import java.math.BigDecimal;

public class PembelianDetail {
	private Produk produk;
	private Integer jumlah;

	public BigDecimal subtotal(){
		return produk.getHarga()
		.multiply(new BigDecimal(jumlah));
	}

	public Produk getProduk(){
		return produk;
	}

	public void setProduk(Produk p){
		this.produk = p;
	}

	public Integer getJumlah(){
		return jumlah;
	}

	public void setJumlah(Integer p){
		this.jumlah = p;
	}
}