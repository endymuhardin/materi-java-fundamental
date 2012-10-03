% Java Fundamental - Hello World
% Endy Muhardin <endy.muhardin@gmail.com>
% 21 September 2012

# Hal yang harus diperhatikan #

* Case Sensitive : huruf besar dan kecil berpengaruh
* Nama public class harus sama dengan nama file

* Method main bisa dijalankan (run)

        public static void main(String[] xx)

* Modifier `public static void`
* Nama method : `main`
* Argumen : `String[]` 

# Kompilasi Kode Program #

* Mengubah source code menjadi binary
* Gunakan perintah javac

        javac nama-file

* Kode program : `*.java`
* Hasil kompilasi : `*.class`

* Opsi tambahan : 
    * -d : destination (tujuan)

* Contoh

        javac -d bin src/Halo.java
        javac -d folder-tujuan src/*.java

# Menjalankan Program Java #

* Berada di folder yang sama dengan *.class
* Gunakan perintah java nama-class. Contoh:

        java Halo

* Bila berada di folder berbeda, gunakan opsi -cp

        java -cp bin Halo

* Opsi -cp : classpath
    * Classpath = lokasi class

# Classpath #

* Classpath : tempat Java mencari class yang ingin dipakai
* Classpath bisa satu atau banyak
* Kesalahan konfigurasi classpath menimbulkan error:

        java.lang.NoClassDefFoundError

* Artinya : tidak menemukan class definition

# Berbagai cara konfigurasi classpath #

* Opsi -cp pada command line
* Environment variable (local)
    * Windows : 
    
            set CLASSPATH=folder1;c:\folder2;..\folder3

    * Linux : 
    
            export CLASSPATH=folder1:/home/endy:../folder3

* Environment variable (global)
    * Windows : 
        * Klik kanan My Computer > Properties
        * Advanced > Environment Variable
    
    * Linux : 
        * File /etc/environment
        * File /etc/bashrc

# Package #

* pengelompokan class supaya rapi
* untuk source code, 
__sebaiknya__ disesuaikan dengan struktur folder
* untuk hasil kompilasi, 
__otomatis__ dibuatkan struktur folder
* untuk menjalankan, panggil nama lengkap

        java -cp bin belajar.java.BelajarPackage

