package belajar.oop;

import java.math.BigDecimal;

public class Tunai extends Pembayaran {
	private BigDecimal dibayar;

	public BigDecimal kembalian(Pembelian p){
		return dibayar.subtract(p.total());
	}

	public void proses(){
		System.out.println("Memproses pembayaran tunai");
	}

	public BigDecimal getDibayar(){
		return this.dibayar;
	}

	public void setDibayar(BigDecimal d){
		this.dibayar = d;
	}
}