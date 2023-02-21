from Human import Human

class SivitasAkademik(Human):
    __asalUni = ""
    __email = ""

    def __init__(self, asalUni = "", email = ""):
        self.__asalUni = asalUni
        self.__email = email
    
    # Get-set Asal Universitas
    def setAsalUni(self, asalUni):
        self.__asalUni = asalUni

    def getAsalUni(self):
        return self.__asalUni

    # Get-set Email
    def setEmail(self, email):
        self.__email = email

    def getEmail(self):
        return self.__email