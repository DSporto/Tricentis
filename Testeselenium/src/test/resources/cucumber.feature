#language: pt
#Author: http://sampleapp.tricentis.com/


Funcionalidade: Preenchimento de formulario
   Eu como usuario quero acessar sampleapp.tricentis para validar informacoes
  
  Cenario: Formulario e validacao
    Dado que eu acesse "http://sampleapp.tricentis.com/101/app.php"
    Quando preencher o "formulario"
    Entao clico em salvar e valido "Sending e-mail success!"