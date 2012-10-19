public class DemoVariabel{
    public static void main(String[] xx){
        Integer a;  // deklarasi variabel
        a = 11;     // inisialisasi variabel
        
        System.out.println("Variabel a berisi : "+a);
        
        Integer b = 5; // deklarasi + inisialisasi
        
        Integer c = a / b;
        System.out.println("Variabel c berisi : "+c);
        
        Float d = 11f / 5f;
        System.out.println("Variabel d berisi : "+d);
        
        char x = 'z'; 
        System.out.println("Variabel x berisi : "+x);
        
        int y = 'z'; // tipe data berbeda, dikonversi menjadi kode ASCII
        System.out.println("Variabel y berisi : "+y);
        
        boolean z = 'a'; // tidak bisa, karena tipe data berbeda
    }
}
