#language: pt
@busca_webmotors
Funcionalidade: Teste pratico Taking

  Contexto: 
    Dado que foi acessado o site da WebMotors
    Entao deve apresentar o resultado

  @busca_marca
  Cenario: CT: Busca pela marca - WebMotors
    E inserir a marca do carro
    Quando selecionar a marca

  @busca_modelo
  Cenario: CT: Busca pela marca - WebMotors
    E inserir o modelo do carro
    Quando selecionar o modelo