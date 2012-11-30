package belajar.oop;

import java.math.BigDecimal;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Pembelian {
	private Pembeli pembeli;
	private Date tanggal;
	private Pembayaran pembayaran;

	private List<PembelianDetail> daftarPembelianDetail
		= new ArrayList<PembelianDetail>();

	public void prosesPembayaran(){
		if(pembayaran == null){
			System.out.println("Belum dibayar");
		} else {
			pembayaran.proses();
			System.out.println("Pembayaran sudah diproses");
		}
	}

	public BigDecimal total() {
		BigDecimal hasil = new BigDecimal(0);
		for(PembelianDetail pd : daftarPembelianDetail){
			hasil = hasil.add(pd.subtotal());
		}
		return hasil;
	}

	public Pembeli getPembeli(){
		return pembeli;
	}

	public void setPembeli(Pembeli p){
		this.pembeli = p;
	}

	public Date getTanggal(){
		return tanggal;
	}

	public void setTanggal(Date p){
		this.tanggal = p;
	}

	public Pembayaran getPembayaran(){
		return pembayaran;
	}

	public void setPembayaran(Pembayaran p){
		this.pembayaran = p;
	}

	public List<PembelianDetail> getDaftarPembelianDetail(){
		return this.daftarPembelianDetail;
	}

	public void setDaftarPembelianDetail(List<PembelianDetail> d){
		this.daftarPembelianDetail = d;
	}
}