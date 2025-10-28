# 🖥️📚 TUGAS PBO – Pertemuan Kesebelas  

**Implementasi Java Persistence API (JPA) pada Aplikasi CRUD Data Member Ryo’s Gym**  

---

## 📄 Deskripsi  
Proyek ini dibuat untuk memenuhi tugas mata kuliah **Pemrograman Berorientasi Objek (PBO)** dengan studi kasus **CRUD Data Member Ryo’s Gym** yang menggunakan **Java Persistence API (JPA)** untuk menggantikan koneksi JDBC manual, sehingga pengelolaan data lebih  terstruktur dan berorientasi objek.  

---

## ⚙️ Fitur Utama  
- 🔹 **Insert, Update, Delete, Upload** berbasis JPA  
- 📂 **Upload CSV** otomatis via `EntityManager`  
- 🧾 **Print Laporan** dengan JasperReport  
- 🧠 Tanpa query SQL manual (semua via Persistence)  

---

## ⚙️ Proses Implementasi  

### 1️⃣ Membuat Persistence Unit  
Membuat file `persistence.xml` untuk mengatur koneksi database PostgreSQL.  

<img width="740" height="400" alt="image" src="https://github.com/user-attachments/assets/126e12b8-9f3e-4c1f-ac8a-48de6a70e31c" />  
<br>  
<img width="740" height="400" alt="image" src="https://github.com/user-attachments/assets/1ad2b528-44fd-456b-84dc-bb326ed0622d" />  

---

### 2️⃣ Membuat Entity Class `MemberGym`  
Kelas `MemberGym` merepresentasikan tabel `member_gym` di database.  

<img width="740" height="400" alt="image" src="https://github.com/user-attachments/assets/d013af0a-18ca-4a63-b301-94e6298cf4d4" />  
<br>  
<img width="740" height="400" alt="image" src="https://github.com/user-attachments/assets/d8cee765-1b73-493b-b258-a5e0f2d3bc1b" />  

---

### 3️⃣ Menambahkan Kelas `JPAUtil`  
Kelas ini berfungsi untuk menginisialisasi dan menyediakan `EntityManager` bagi seluruh form.  

<img width="740" height="400" alt="image" src="https://github.com/user-attachments/assets/f42ed2ad-479c-4543-a4af-5a473c4b2be0" />  
<br>  
<img width="740" height="400" alt="image" src="https://github.com/user-attachments/assets/8f4a4a3a-568f-49d9-ab3f-ab47ec87466e" />  

---

### 4️⃣ Mengubah Kode CRUD agar Menggunakan JPA  

#### 🔹 Insert  
<img width="740" height="400" alt="image" src="https://github.com/user-attachments/assets/7a332485-2d5e-4e11-843e-4d4af6b5cba0" />  

#### 🔹 Load Data (Read)  
<img width="740" height="400" alt="image" src="https://github.com/user-attachments/assets/28f7ae9c-eb66-4a45-9c26-a9da0207ffae" />  

#### 🔹 Update  
<img width="740" height="400" alt="image" src="https://github.com/user-attachments/assets/ce5fe3ed-bbf8-4717-812d-77962365f5c6" />  

#### 🔹 Delete  
<img width="740" height="400" alt="image" src="https://github.com/user-attachments/assets/9070c4be-165f-444f-91fd-2ad905a68117" />  

#### 🔹 Upload CSV  
<img width="740" height="400" alt="image" src="https://github.com/user-attachments/assets/56483173-515b-4d64-bbc2-8e4275200803" />  
<br>  
<img width="740" height="400" alt="image" src="https://github.com/user-attachments/assets/4975fbc8-1436-4d34-83a7-b908a5878b16" />  

---

## 🧪 Uji Coba  

### 1️⃣ Menjalankan Aplikasi  
Jalankan file `MemberFrame.java`.  

<img width="740" height="400" alt="image" src="https://github.com/user-attachments/assets/d9ada7f5-a927-41f7-98df-5c9f671d9760" />  

---

### 2️⃣ Uji Coba Tombol CRUD dan Upload  

#### ✅ Insert Berhasil  
<img width="740" height="400" alt="image" src="https://github.com/user-attachments/assets/923754ee-f0f0-4bf7-84df-28ac2642e0ae" />  

#### 🔄 Update Berhasil  
<img width="740" height="400" alt="image" src="https://github.com/user-attachments/assets/8ef6d85b-b45d-45b1-a408-60406a7dd5cf" />  

#### ❌ Delete Berhasil  
<img width="740" height="400" alt="image" src="https://github.com/user-attachments/assets/7ce364cf-2e69-442c-abb1-278489c8b634" />  

#### 📂 Upload CSV Berhasil  
<img width="740" height="400" alt="image" src="https://github.com/user-attachments/assets/4154aa47-8512-4d06-bc50-585d2df239e6" />  

---

## 👨‍💻 Author  
**Ryo Satriagung Hidayat**  
NIM: 09010624015  
Program Studi: Sistem Informasi  
Universitas Islam Negeri Sunan Ampel Surabaya – 2025  
