package belajar.exception;

import java.io.FileNotFoundException;

public class Notepad{
	public static void main(String[] xx) throws FormatFileTidakDikenaliException {
		menuOpenDiklik();
	}

	public static void menuOpenDiklik() throws FormatFileTidakDikenaliException {
		String namafile = "data.txt";

		FileManager fm = new FileManager();
		
		try {
			fm.buka(namafile);
			String data = fm.baca();
			System.out.println(data);
			fm.tutup();
		} catch (FileNotFoundException x){
			System.out.println("File "+namafile+" tidak ditemukan");
		}
	}
}