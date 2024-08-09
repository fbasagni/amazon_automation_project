#language:pt
#encoding:utf-8
@test
Funcionalidade: Abrir o site da Testers
  Permitir que o usuario navegue no site

  Cenário: Acessar o site Amazon
    Dado que acesso o site
    #E clico no menu solucoes
    E clico em ofertas do dia
    E seleciono o produto
    Então adiciono ao carrinho
    Então verifico dados da pagina

  Cenário: Entre em contato
    Dado que acesso o site
    E clico em vamos conversar
    E preencho os dados para envio
      | nome  | email                | telefone    | mensagem                                              |
      | Francine | franbasagni@gmail.com | 11999999999 | Preciso de um orçamento para automatizar meu software |
    Quando envio a mensagem
    Entao o email é enviado