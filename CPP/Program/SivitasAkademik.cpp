#include "Human.cpp"

using namespace std;

class SivitasAkademik: public Human{

    private:

    string asal_universitas;
    string email_edu;

    public:
    
    // Constructor
    SivitasAkademik(){
    }

    SivitasAkademik(string asal_universitas, string email_edu){
        this->asal_universitas = asal_universitas;
        this->email_edu = email_edu;
    }

    // Get-set Asal Universitas
    void setAsalUni(string asal_universitas){
        this->asal_universitas = asal_universitas;
    }

    string getAsalUni(){
        return this->asal_universitas;
    }

    // Get-set Email Edu
    void setEmail(string email_edu){
        this->email_edu = email_edu;
    }

    string getEmail(){
        return this->email_edu;
    }

    // Deconstructor
    ~SivitasAkademik(){
    }

};