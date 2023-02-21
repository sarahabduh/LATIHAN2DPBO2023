from Mahasiswa import Mahasiswa

mhs = Mahasiswa()

print("+--------------------------------------+")
print("| Input Data (tanpa spasi)             |")
print("+--------------------------------------+")
nama = input("Nama               : ")
gender = input("Jenis Kelamin (L/P): ")
nik = input("NIK                : ")
asalUni = input("Asal Universitas   : ")
email = input("Email              : ")
nim = input("NIM                : ")
prodi = input("Program Studi      : ")
fakultas = input("Fakultas           : ")

mhs.setNama(nama);
mhs.setGender(gender);
mhs.setNIK(nik);
mhs.setAsalUni(asalUni);
mhs.setEmail(email);
mhs.setNIM(nim);
mhs.setProdi(prodi);
mhs.setFakultas(fakultas);

print("+--------------------------------------+")
print("| Data Mahasiswa                       |")
print("+--------------------------------------+")
print("Nama             : " + mhs.getNama());
print("Gender           : " + mhs.getGender());
print("NIK              : " + mhs.getNIK());
print("Asal Universitas : " + mhs.getAsalUni());
print("Email            : " + mhs.getEmail());
print("NIM              : " + mhs.getNIM());
print("Program Studi    : " + mhs.getProdi());
print("Fakultas         : " + mhs.getFakultas());


