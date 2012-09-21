% Java Fundamental - Version Control
% Endy Muhardin <endy.muhardin@gmail.com>
% 21 September 2012

# Tujuan #
- Memahami konsep version control
- Dapat menggunakan Git
- Dapat menggunakan Github

# Apa itu version control #
- Tempat penyimpanan file dan folder
- Dapat menyimpan history perubahan
- Seperti mesin waktu, bisa kembali ke posisi masa lalu

# Berbagai Aplikasi Version Control #
- Subversion
- Git
- Mercurial

# Berbagai Penyedia Version Control Gratis #
- Github
- Google Code
- Sourceforge

# Komponen Version Control #
- Aplikasi Client : diinstal di laptop/PC kita sendiri
- Aplikasi Server : diinstal di server

# Langkah Instalasi Client #
- Download 
- Install
- Setup User dan Email

# Langkah Instalasi Server #
- Tidak dibahas

# Berbagai Istilah #
- Repository : tempat penyimpanan data
- Remote : repository yang ada di server
- Local : repository yang ada di pc/laptop kita
- Commit : menyimpan perubahan ke repository local
- Update : mendownload perubahan di remote ke local
- Push : upload perubahan di local ke remote
- Pull : download perubahan di remote ke local

# Perintah yang sering digunakan #
* `git clone` : copy repository remote ke local
* `git status` : melihat kondisi working folder
* `git diff` : melihat perubahan yang dilakukan
* `git add` : menyiapkan file untuk dicommit
* `git diff --staged` : melihat perubahan yang akan dicommit
* `git commit` : menyimpan file ke repository local
* `git push` : mengupload perubahan di repository local ke remote
* `git pull` : mendownload perubahan di remote ke local

# Perintah yang sering digunakan #
* `git log` : melihat riwayat perubahan
* `git log --oneline` : melihat riwayat perubahan (singkat)
* `git checkout <commit-id>` : kembali ke posisi `<commit-id>`
* `git branch -a` : melihat daftar nama branch
* `git checkout <nama-branch>` : kembali ke posisi terbaru di `<nama-branch>`




