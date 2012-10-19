% Java Fundamental - Operator
% Endy Muhardin <endy.muhardin@gmail.com>
% 10 Oktober 2012

# Operator #

* Notasi untuk melakukan operasi terhadap data
* Berbagai jenis operator :
    - assignment : untuk mengisi data
    - relasi : untuk membandingkan dua nilai
    - aritmatik : operasi matematika
    - logika : operasi boolean

# Assignment #

* Mengisi nilai `10` ke dalam `x`

        int x = 10;

* Menambah dan mengisi

        x += 5;
        x = x + 5;

* Menambah satu 

        x++;
        x += 1;
        x = x + 1;

# Relasi #

* lebih kecil : `<`
* lebih besar : `>`
* kecil atau sama : `<=`
* besar atau sama : `>=`
* tidak sama : `!=`
* sama dengan : `==`

# Aritmatika #

* Penjumlahan : `+`
* Pengurangan : `-`
* Perkalian : `*`
* Pembagian : `/`
* Modulus : `%`

# Tabel Logika #

* AND : keduanya TRUE maka hasilnya TRUE, selain itu FALSE
* OR : salah satu TRUE maka hasilnya TRUE
* XOR : kalau keduanya berbeda maka TRUE, kalau sama maka FALSE

# Logika #

* AND (malas = lazy) : `&&`
* AND (rajin = eager) : `&`
* OR (malas) : `||`
* OR (rajin) : `|`
* Negasi : `!`
* XOR : `^`

# Malas vs Rajin #

* Malas : kalau operand satu sudah menghasilkan kesimpulan, operand dua tidak diperiksa

* Rajin : walaupun operand satu sudah menghasilkan kesimpulan, operand dua tetap diperiksa
