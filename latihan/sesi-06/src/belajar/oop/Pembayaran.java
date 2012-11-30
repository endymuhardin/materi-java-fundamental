package belajar.oop;

import java.math.BigDecimal;

public abstract class Pembayaran {
	private BigDecimal nilai;

	public abstract void proses();

	public BigDecimal getNilai(){
		return nilai;
	}

	public void setNilai(BigDecimal n){
		this.nilai = n;
	}
}