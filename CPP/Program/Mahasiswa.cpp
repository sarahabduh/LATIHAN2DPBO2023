#include "SivitasAkademik.cpp"

using namespace std;

class Mahasiswa: public SivitasAkademik{

    private:

    string nim;
    string prodi;
    string fakultas;

    public:
    
    // Constructor
    Mahasiswa(){
    }

    Mahasiswa(string nim, string prodi, string fakultas){
        this->nim = nim;
        this->prodi = prodi;
        this->fakultas = fakultas;
    }

    // Get-set NIM
    void setNIM(string nim){
        this->nim = nim;
    }

    string getNIM(){
        return this->nim;
    }

    // Get-set Prodi
    void setProdi(string prodi){
        this->prodi = prodi;
    }

    string getProdi(){
        return this->prodi;
    }

    // Get-set Fakultas
    void setFakultas(string fakultas){
        this->fakultas = fakultas;
    }

    string getFakultas(){
        return this->fakultas;
    }

    // Deconstructor
    ~Mahasiswa(){
    }

};