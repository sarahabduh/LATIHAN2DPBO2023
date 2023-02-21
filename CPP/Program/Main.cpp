#include <bits/stdc++.h>
#include "Mahasiswa.cpp"

int main()
{
    string nama;
    char gender;
    string nik;
    string asalUni;
    string email;
    string nim;
    string prodi;
    string fakultas;

    Mahasiswa mhs;

    // input data
    cout << "+--------------------------------------+" << '\n';
    cout << "| Input Data (tanpa spasi)             |" << '\n';
    cout << "+--------------------------------------+" << '\n';
    cout << "Nama               : ";
    cin >> nama;
    cout << "Jenis Kelamin (L/P): ";
    cin >> gender;
    cout << "NIK                : ";
    cin >> nik;
    cout << "Asal Universitas   : ";
    cin >> asalUni;
    cout << "Email              : ";
    cin >> email;
    cout << "NIM                : ";
    cin >> nim;
    cout << "Program Studi      : ";
    cin >> prodi;
    cout << "Fakultas           : ";
    cin >> fakultas;

    // set data
    mhs.setNama(nama);
    mhs.setGender(gender);
    mhs.setNIK(nik);
    mhs.setAsalUni(asalUni);
    mhs.setEmail(email);
    mhs.setNIM(nim);
    mhs.setProdi(prodi);
    mhs.setFakultas(fakultas);

    // print atribut Mahasiswa
    cout << "+--------------------------------------+" << endl;
    cout << "| Data Mahasiswa                       |" << endl;
    cout << "+--------------------------------------+" << endl;
    cout << "Nama             : " << mhs.getNama() << endl;
    cout << "Gender           : " << mhs.getGender() << endl;
    cout << "NIK              : " << mhs.getNIK() << endl;
    cout << "Asal Universitas : " << mhs.getAsalUni() << endl;
    cout << "Email            : " << mhs.getEmail() << endl;
    cout << "NIM              : " << mhs.getNIM() << endl;
    cout << "Program Studi    : " << mhs.getProdi() << endl;
    cout << "Fakultas         : " << mhs.getFakultas() << endl;

    return 0;
}
