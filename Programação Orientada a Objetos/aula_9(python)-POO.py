class evento():

  def __init__ (self, nome, data, local):
    self.__nome = nome
    self.__data = data
    self.__local = local

  def getNome(self):
    return self.__nome

  def getData(self):
    return self.__data

  def getlocal(self):
    return self.__local

  def setNome(self, newNome):
    self.__nome = newNome

  def setData(self, newData):
    self.__data = newData

  def setLocal(self, newLocal):
    self.__local = newLocal

  def detalhes(self):
    print("O evento se chama: " + self.__nome + " // Ele ocorrerá na data: " + self.__data + " // Ele ocorrerá no local: " + self.__local + "\n")

class congresso (evento):

  def __init__ (self, nome, data, local, numTrabalhos):
    super().__init__(nome, data, local)
    self.numTrabalhos = numTrabalhos

  def getNumTrabalhos(self):
    return self.__numTrabalhos

  def setNumTrabalhos(self, newNum: int):
    self.__numTrabalhos = newNum

class palestra (evento):

  def __init__ (self, nome, data, local, palestrante):
    super().__init__(nome, data, local)
    self.__palestrante = palestrante

  def getPalestrante(self):
    return self.__palestrante

  def setPalestrante(self, newPalestrante):
    self.__palestrante = newPalestrante

class workshop (evento):

  def __init__(self, nome, data, local, vagas):
    super().__init__(nome, data, local)
    self.__vagas = vagas

  def getVagas(self):
    return self.__vagas

  def setVagas(self, newVagas: int):
    self.__vagas = newVagas

def mostrar_detalhes_evento(evento1):
  evento1.detalhes()

congresso1 = congresso("Conpog", "25/06/2025", "IFSP Campus São Paulo" , 50)
palestra1 = palestra("Uso de IA em diagnósticos médicos", "01/03/2025", "IFSP Campus São Paulo", "Vinicius Crestane")
workshop1 = workshop("Educação Empreendedora", "10/12/2024", "IFSP Campus São Paulo", 80)

mostrar_detalhes_evento(congresso1)
mostrar_detalhes_evento(palestra1)
mostrar_detalhes_evento(workshop1)

congresso1.setData("01/07/2025")
congresso1.setLocal("IFSP Campus Rio de Janeiro")

palestra1.setNome("Uso de IA na educação")
palestra1.setData("18/08/2025")

workshop1.setNome("Desenvolvimento orientado a objetos")
workshop1.setLocal("IFSP Campus Pirituba")

mostrar_detalhes_evento(congresso1)
mostrar_detalhes_evento(palestra1)
mostrar_detalhes_evento(workshop1)
