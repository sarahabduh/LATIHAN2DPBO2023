<?php

class SivitasAkademik extends Human
{
    private $asalUni = "";
    private $email = "";

    public function __construct($asalUni = "", $email = ""){
        $this->asalUni = $asalUni;
        $this->email = $email;
    }

    // Get-set Asal Universitas
    public function setAsalUni($asalUni){
        $this->asalUni = $asalUni;
    }

    public function getAsalUni(){
        return $this->asalUni;
    }

    // Get-set Email
    public function setEmail($email){
        $this->email = $email;
    }

    public function getEmail(){
        return $this->email;
    }
}

?>