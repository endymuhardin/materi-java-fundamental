% Java Fundamental - Instalasi Java
% Endy Muhardin <endy.muhardin@gmail.com>
% 21 September 2012

# Tujuan #
- Bisa menginstal Java SDK di Windows

# Langkah-langkah #
- Download
- Jalankan Installer
- Setting PATH
- Bisa compile source code
- Bisa run source code

# Download #
- http://www.oracle.com/technetwork/java/javase/downloads/index.html
- Pilih JDK, **jangan** JRE. Versi bebas, ambil yang terbaru
- Download juga dokumentasinya (Java SE 6 Documentation)

# Instalasi #
- Jalankan installer
- Klik Next sampai selesai
- Test 
    - Ketik cmd `java`, harusnya menghasilkan:
    
            Usage java [-options] class [args...]
    
    - Ketik cmd `javac`, harusnya menghasilkan:
        
            javac is not recognized


# Setting PATH [1] #
- Klik kanan My Computer, pilih Properties
- Pilih Advanced System Settings
- Klik Environment Variables
- Klik tombol New di User variables
- Isi form : 
    - Variable Name : `PATH`
    - Variable Value : `%PATH%;<lokasi-jdk-sampai-folder-bin>`

# Setting PATH [2] #
- Klik OK
- Tutup command prompt dan buka lagi yang baru
- Ketik `javac`, harusnya tampil seperti ini:

        Usage: javac <options> <source files>








