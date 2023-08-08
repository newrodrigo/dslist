# DSList PRO
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/newrodrigo/dslist/blob/main/LICENSE) 

# Sobre o projeto
DSList PRO é uma aplicação backend construída durante o Intensivão Java Spring, evento organizado pela [DevSuperior](https://devsuperior.com.br/).

O DSList é um aplicativo desenvolvido para ajudar os usuários a gerenciar suas listas de jogos favoritos. Com este aplicativo, os usuários podem criar várias listas de jogos, como "Aventura e RPG", "Jogos de Plataforma", entre outras, e adicionar seus jogos preferidos em cada uma delas.

## Exemplos de consultas realizadas no Postman
 1. Listar todos os jogos cadastrados:
    - Consulta que retorna a lista de todos os jogos cadastrados no sistema com informações básicas.
   - Método: GET
   - Endpoint: `/games`
   
   ![Exemplo 1](https://github.com/newrodrigo/dslist/assets/88519491/8da7edb9-ce79-4a5c-8562-96153252440c)


2. Buscar o jogo por id:
   - Consulta de um jogo a partir do id exibindo as informações completas
   - Método: GET
   - Endpoint: `/games/1`

    ![Exemplo 2](https://github.com/newrodrigo/dslist/assets/88519491/25fa4b8f-16e9-4430-91e5-22473d161cbb)


4. Listar todas as listas de jogos cadastradas:
   - Consulta todos os jogos a partir do id de uma lista
   - Método: GET
   - Endpoint: `/lists`
   
   ![Exemplo 3](https://github.com/newrodrigo/dslist/assets/88519491/ade7d2b9-1d21-46bb-9b81-f19c4574152d)


5. Buscar as listas de jogos por id:
   - Consulta que retorna uma lista de jogos a partir de um id
   - Método: GET
   - Endpoint: `/lists/2/games`
     
   ![Exemplo 4](https://github.com/newrodrigo/dslist/assets/88519491/303864ea-3ea5-4aaa-8474-c096bd1fa273)

6. Ordenar jogos de uma lista:
   - Permite organizar a lista movendo os jogos
   - Método: POST
   - Endpoint: `/lists/2/replacement`
   - Body: 
     ```json
     {
        "sourceIndex": 3,
        "destinationIndex": 1
     }
     ```
   ![Exemplo 5](https://github.com/newrodrigo/dslist/assets/88519491/ba3ef777-293a-4dd2-b00d-c4fd38adeceb)
   
# Consulta de um jogo inexistente por ID
- Tratamento de exceção para uma consulta de um jogo que não existe
- Método: GET
- Endpoint: `/games/999`

Resposta esperada:
```
Status:  404 Not Found
{
    "timestamp": "2023-07-29T03:18:45.746392980Z",
    "status": 404,
    "error": "Resource not found",
    "message": "Entity not found",
    "path": "/games/999"
}
 ```
![Resposta esperada para consulta inexistente](https://github.com/newrodrigo/dslist/assets/88519491/92feeba0-29f1-4137-914e-38214cb76ff5)

## Modelo conceitual
![Modelo Conceitual](https://raw.githubusercontent.com/devsuperior/java-spring-dslist/main/resources/dslist-model.png)

# Tecnologias utilizadas
## Back end
- Java
- Spring Boot
- JPA / Hibernate
- SQL
- Maven
- H2
- Postgres

## Implantação em produção
- Back end: Railway
- Banco de dados: Postgresql

# Como executar o projeto
## Back end
Pré-requisitos: Java 17

```bash
# clonar repositório
git clone https://github.com/newrodrigo/dslist

# entrar na pasta do projeto back end
cd dslist

# executar o projeto
./mvnw spring-boot:run
```

# Autor

Rodrigo Oliveira Cerqueira

[LinkedIn](https://www.linkedin.com/in/rodrigooc)
