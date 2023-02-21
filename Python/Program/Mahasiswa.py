from SivitasAkademik import SivitasAkademik

class Mahasiswa(SivitasAkademik):
    __nim = ""
    __prodi = ""
    __fakultas = ""

    def __init__(self, nim = "", prodi = "", fakultas = ""):
        self.__nim = nim
        self.__prodi = prodi
        self.__fakultas = fakultas
    
    # Get-set NIM
    def setNIM(self, nim):
        self.__nim = nim

    def getNIM(self):
        return self.__nim

    # Get-set Prodi
    def setProdi(self, prodi):
        self.__prodi = prodi

    def getProdi(self):
        return self.__prodi

    # Get-set Fakultas
    def setFakultas(self, fakultas):
        self.__fakultas = fakultas

    def getFakultas(self):
        return self.__fakultas