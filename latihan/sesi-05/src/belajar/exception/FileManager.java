package belajar.exception;

import java.util.Random;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class FileManager{
	private FileReader file;

	public void buka(String namafile) 
			throws FileNotFoundException, IllegalArgumentException {

		if(namafile == null || namafile.length() < 1){
			throw new IllegalArgumentException("Nama file harus diisi");
		}
		file = new FileReader(namafile);
	}

	public String baca() throws FormatFileTidakDikenaliException {
		// random number, kadang-kadang error
		int random = new Random().nextInt();
		if(random % 2 == 0){
			throw new FormatFileTidakDikenaliException();
		}
		return "ini datanya";
	}

	public void tutup() throws IllegalStateException {
		int random = new Random().nextInt();
		if(random % 2 == 0){
			throw new IllegalStateException();
		}
	}
}