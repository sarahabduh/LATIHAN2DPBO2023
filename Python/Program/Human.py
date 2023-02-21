class Human:
    __nik = ""
    __nama = ""
    __gender = ''

    def __init__(self, nik = "", nama = "", gender = ''):
        self.__nik = nik
        self.__nama = nama
        self.__gender = gender
    
    # Get-set NIK
    def setNIK(self, nik):
        self.__nik = nik

    def getNIK(self):
        return self.__nik

    # Get-set Nama
    def setNama(self, nama):
        self.__nama = nama

    def getNama(self):
        return self.__nama

    # Get-set Gender
    def setGender(self, gender):
        self.__gender = gender

    def getGender(self):
        return self.__gender