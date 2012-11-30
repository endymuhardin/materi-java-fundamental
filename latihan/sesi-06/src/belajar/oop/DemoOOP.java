package belajar.oop;

import java.util.Date;
import java.math.BigDecimal;

public class DemoOOP {

	public static void main(String[] xx){
		Produk p1 = new Produk();
		Produk p2 = new Produk();
		Produk p3 = new Produk();

		p1.setNama("Laptop");
		p2.setNama("Mouse");
		p3.setNama("USB Flashdisk");

		p1.setHarga(new BigDecimal(5000));
		p2.setHarga(new BigDecimal(150));
		p3.setHarga(new BigDecimal(200));

		PembelianDetail pd1 = new PembelianDetail();
		pd1.setProduk(p1);
		pd1.setJumlah(1);

		PembelianDetail pd2 = new PembelianDetail();
		pd2.setProduk(p2);
		pd2.setJumlah(1);

		PembelianDetail pd3 = new PembelianDetail();
		pd3.setProduk(p3);
		pd3.setJumlah(2);

		Pembeli endy = new Pembeli();
		endy.setNama("Endy");
		endy.setAlamat("Jakarta Selatan");

		Pembelian p = new Pembelian();
		p.setPembeli(endy);
		p.getDaftarPembelianDetail().add(pd1);
		p.getDaftarPembelianDetail().add(pd2);
		p.getDaftarPembelianDetail().add(pd3);

		// coba proses pembayaran, padahal belum dibayar
		p.prosesPembayaran();

		Tunai tunai = new Tunai();
		tunai.setNilai(p.total());
		tunai.setDibayar(new BigDecimal(10000));

		// tentukan metode pembayaran;
		p.setPembayaran(tunai);

		// bisa juga diisi semua tipe data turunan Pembayaran
		//p.setPembayaran(new Kredit()); 
		//p.setPembayaran(new Transfer());

		// setelah metode pembayaran ditentukan, proses pembayaran
		p.prosesPembayaran();

		// tampilkan datanya
		System.out.println("Total : "+p.total());
		System.out.println("Dibayar : "+tunai.getDibayar());
		System.out.println("Kembalian : " + tunai.kembalian(p));
	}
}