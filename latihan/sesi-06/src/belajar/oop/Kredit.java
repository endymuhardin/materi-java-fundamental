package belajar.oop;

public class Kredit extends Pembayaran {
	private String penerbit;
	private String nama;
	private String kodeApproval;

	public void proses(){
		System.out.println("Memproses pembayaran kredit");
	}

	public String getPenerbit(){
		return penerbit;
	}

	public void setPenerbit(String k){
		this.penerbit = k;
	}

	public String getNama(){
		return nama;
	}

	public void setNama(String k){
		this.nama = k;
	}

	public String getKodeApproval(){
		return kodeApproval;
	}

	public void setKodeApproval(String k){
		this.kodeApproval = k;
	}
}