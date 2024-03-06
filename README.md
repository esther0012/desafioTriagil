# Desafio Triágil

Este projeto foi desenvolvido como parte do desafio proposto pela Triágil para testar conhecimentos de programação e integração com APIs.

## Descrição

O Desafio Triágil consiste em desenvolver uma API para montar times de Pokémon, utilizando a [PokeAPI](https://pokeapi.co/) para obter os dados dos Pokémon. A API permite que os usuários criem, visualizem e gerenciem times de Pokémon, além de buscar informações detalhadas sobre os Pokémon disponíveis.

## Funcionalidades

- Criação de times de Pokémon
- Visualização de times de Pokémon existentes
- Busca de times de Pokémon por usuário
- Busca de times de Pokémon por ID
- Integração com a PokeAPI para obter informações sobre os Pokémon

## Tecnologias Utilizadas

- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- H2 Database
- Maven


## Instalação e Uso

### Pré-requisitos

- JDK 11 ou superior
- Maven

### Passos para Instalação

1. Clone o repositório para o seu ambiente local:
 
2. Navegue até o diretório do projeto:
cd desafio-triagil

3. Compile o projeto com Maven:
mvn clean install

5. Acesse a API em `http://localhost:8080`.

### Endpoints da API

- `GET /api/teams`: Retorna todos os times registrados.
- `GET /api/teams/{user}`: Busca um time registrado por usuário.
- `GET /api/teams/{id}`: Busca um time registrado por ID.
- `POST /api/teams`: Cria um novo time de Pokémon.

## Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir um pull request com melhorias, correções de bugs ou novas funcionalidades.

## Licença

Este projeto é licenciado sob a [Licença MIT](https://opensource.org/licenses/MIT).


