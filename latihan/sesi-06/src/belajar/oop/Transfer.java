package belajar.oop;

public class Transfer extends Pembayaran {
	private String bank;
	private String nomerRekening;
	private String namaRekening;
	private String kodeApproval;

	public void proses(){
		System.out.println("Memproses pembayaran via transfer");
	}

	public String getBank(){
		return bank;
	}

	public void setBank(String k){
		this.bank = k;
	}

	public String getNomerRekening(){
		return nomerRekening;
	}

	public void setNomerRekening(String k){
		this.nomerRekening = k;
	}

	public String getNamaRekening(){
		return namaRekening;
	}

	public void setNamaRekening(String k){
		this.namaRekening = k;
	}

	public String getKodeApproval(){
		return kodeApproval;
	}

	public void setKodeApproval(String k){
		this.kodeApproval = k;
	}
}