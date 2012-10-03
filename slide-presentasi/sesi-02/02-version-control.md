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
- Bisa mengelola kolaborasi banyak orang

# Berbagai Aplikasi Version Control #
- Subversion
- Git
- Mercurial

# Berbagai Penyedia Version Control #
- Github <http://github.com>
- Bitbucket <http://bitbucket.com>
- Google Code <http://code.google.com>
- Sourceforge <http://sourceforge.net>

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
* `git init` : Membuat repository baru
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

# Beberapa istilah lagi #

* commit : satu set perubahan, memiliki relasi ke induk (parent)
* head : commit paling ujung
* branch : head yang diberi nama
* HEAD : head di branch yang sedang aktif

# Undo sebelum commit #

* Reset working folder ke posisi terakhir commit

        git reset --hard

* Reset staging ke posisi terakhir commit

        git reset --mixed
        git reset

# Undo setelah commit #

* Revert : 

        git revert <commit-id>

# Konsep Branch #

* digunakan untuk paralel development
* contoh penggunaan:
    * bugfix vs development
    * paralel development (per orang 1 fitur)

# Teknis Branch #

* Membuat branch

        git branch <nama-branch> <parent-commit>

* Daftar branch

        git branch -a

* Pindah ke branch

        git checkout <nama-branch>

* Menghapus branch

        git branch -d <nama-branch>
        git branch -D <nama-branch>

# Konsep Merge #

* Menggabungkan dua branch menjadi satu
* Kemungkinan hasil :
    * sukses : bila tidak ada edit di lokasi yang sama
    * conflict : bila ada edit di lokasi yang sama

# Penanganan Konflik #

* Cari tahu siapa orang lain yang mengedit di lokasi yang sama
* Koordinasikan tentang versi mana yang seharusnya ada
* Resolve conflict

# Teknis Merge #

* Pindah dulu ke branch tujuan

        git checkout master

* Tarik branch yang mau dimerge

        git merge fitur-xx

# Teknis Penanganan Konflik #

* Bagian yang conflict akan ditandai

        <<<HEAD
        isi file di versinya HEAD
        =====
        isi file versi branch lain
        >>>fitur-xx

* Edit file yang conflict

* Setelah selesai commit

        git add . 
        git commit -m "Merge dan edit conflict"

# Remote Repository #

* Copy remote repository ke local

        git clone <url-repository>
        git clone 
            https://github.com/endymuhardin/buku-git.git

* Melihat daftar remote repository

        git remote -v

* Menambah remote repository

        git remote add <nama-remote> <url-remote>
        git remote add endy-github 
            https://github.com/endymuhardin/buku-git.git

# Sinkronisasi Local - Remote #

* Upload commit di local ke remote

        git push <remote> <branch-local>:<branch-remote>

* Contoh

        git push endy-github master:master

* Download commit di remote ke local

        git remote update



# Remote Branch #

* Melihat daftar branch baik local maupun remote

        git branch -a

    * Branch yang namanya diawali remotes adalah remote branch
    * Contoh
    
            git branch -a
            * master
            remotes/origin/master

# Remote Branch #

* Menghapus remote branch

        git push <remote> :<branch-remote>

    * Contoh
    
            git push endy-github :branch-percobaan

# Merge dengan Remote Branch #

* Merge commit dari remote branch ke local

        git merge <remote-branch>

* Contoh merge remote branch ke local

        git checkout master
        git merge endy-github/master

# Pull #

* Pull = remote update + merge
* Contoh cara manual

        git remote update
        git checkout master
        git merge origin/master

* Dengan git pull

        git pull origin master

# Membuat Server Git #

* Pilihan Aplikasi
    * Gitolite (command line, python)
    * Gitblit (web-based, java)

# Menggunakan Gitblit #

* Download
* Extract
* Edit gitblit.properties

# gitblit.properties #

* Folder penyimpanan repository

        git.repositoriesFolder

* IP Server

        server.httpsBindInterface

* Port Server

        server.httpsPort

# Menjalankan Gitblit #

* Run

        java -jar gitblit.jar

* Browse

        https://ip-server:8443/

* Login
    * Username : admin
    * Password : admin

# Push ke Gitblit #

* Login ke Gitblit
* Create New Repository
* Add remote repository

        git remote add gitblit 
        https://localhost:8443/git/latihan-git.git

* Push

        git push gitblit master

# Self-signed Certificate

* Error certificate
    
        error: server certificate verification failed. 
        CAfile: /etc/ssl/certs/ca-certificates.crt
        CRLfile: none while accessing 
        https://localhost:8443/git/latihan-git.git/info/refs
        fatal: HTTP request failed

* Ignore self signed certificate

        git config http.sslVerify false

