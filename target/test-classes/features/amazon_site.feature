#language:pt
#encoding:utf-8
@test
Funcionalidade: Abrir o site da Amazon
  Permitir que o usuario navegue no site

  Cenário: Criar carrinho de compras
    Dado que acesso o site
    E clico em ofertas do dia
    E seleciono o produto
    Então adiciono ao carrinho
    Então verifico dados da pagina

  Cenário: Validar login inválido
    Dado que acesso o site
    E clico em categorias
    E seleciono o produto da categoria
    E clico em comprar agora
    E preencho os dados
      |email                                |senha     |
      | teste@teste.com                     | 123456 |
    Então o login ficara invalido