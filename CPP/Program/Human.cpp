#include <iostream>
#include <string>

using namespace std;

class Human{

    private:

    string nama;
    string nik;
    char gender;

    public:
    
    // Constructor
    Human(){
    }

    Human(string nama, string nik, char gender){
        this->nama = nama;
        this->nik = nik;
        this->gender = gender;
    }

    // Get-set Nama
    void setNama(string nama){
        this->nama = nama;
    }

    string getNama(){
        return this->nama;
    }

    // Get-set NIK
    void setNIK(string nik){
        this->nik = nik;
    }

    string getNIK(){
        return this->nik;
    }

    // Get-set Gender
    void setGender(char gender){
        this->gender = gender;
    }

    char getGender(){
        return this->gender;
    }

    // Deconstructor
    ~Human(){
    }
};