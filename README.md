# Projeto de Automação Front-End com Java e Selenium

Este projeto é uma automação para o site da Amazon, desenvolvida em Java utilizando o Selenium WebDriver. 

O objetivo é simular o acesso a produtos e categorias e adicionar itens ao carrinho de compras.


## 📝 Introdução

Este projeto foi criado para demonstrar como utilizar o Selenium WebDriver com Java para realizar automações em um site de e-commerce. 

As principais funcionalidades incluem:

- Navegação entre categorias de produtos.
- Pesquisa e visualização de produtos.
- Adição de produtos ao carrinho.


## 💾 Instalação

### Requisitos

- Java Development Kit (JDK) 8 ou superior
- Apache Maven (para gerenciamento de dependências)
- WebDriver correspondente ao navegador utilizado (por exemplo, ChromeDriver para Google Chrome)

### Passos de Instalação

1. **Clone o repositório:**

   ```bash
   git clone https://github.com/usuario/projeto-amazon-automacao.git
   cd projeto-amazon-automacao


2. Configure o WebDriver:

Faça o download do WebDriver correspondente ao seu navegador e coloque o arquivo executável em um diretório de sua escolha. 
Adicione o caminho do WebDriver ao PATH do sistema ou configure o caminho diretamente no código.

Instale as dependências:

Execute o comando Maven para baixar as dependências necessárias:

mvn install


🚀 Uso

1.Executando o Projeto:

Certifique-se de que o WebDriver está corretamente configurado. Execute o projeto com o seguinte comando Maven:

mvn test

2.Modifique as Configurações:

As configurações do WebDriver e as URLs dos sites estão localizadas no arquivo src/test/java/config/Config.java. Ajuste conforme necessário.

3.Testes:

Os testes de automação estão localizados em src/test/java/tests/. Abra esses arquivos para modificar ou adicionar novos testes.

