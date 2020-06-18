# desafiob3

Projeto criado para o desafio da B3 pela consultoria BRQ

### Abordagem Técnica
- Linguagem: Java 8
- Framework: Spring Boot 2.3.1
- Gerenciamento de dependência: Maven
- Utilizada as práticas de Clean Code : Nomes precisos,entre outros aspectos.
- Banco de dados: H2
- Biblioteca Externa: Lombok
- Swagger utilizado para Documentação

## ENDPOINTS E EXEMPLOS DE CHAMADAS : 
http://localhost:8080/swagger-ui.html#/user-controller/

###  User 

#####  Inserção

```json
  {
  "birthDate": "1990-10-18",
  "companyId": 1,
  "email": "josé@gmail.com.br"
}
```

###### Exemplo de Retorno de Sucesso - 200 OK

```json
{
  "userId": 3,
  "companyId": 1,
  "email": "josé@gmail.com.br",
  "birthDate": "1990-10-18"
}
```

##### Consulta
http://localhost:8080/v1/desafio/user/all
###### Consultar todos os usuários cadastrados - 200 OK

```json
[
  {
    "userId": 1,
    "companyId": 1,
    "email": "joao@gmail.com.br",
    "birthDate": 771897600000
  },
  {
    "userId": 2,
    "companyId": 1,
    "email": "pedro@gmail.com.br",
    "birthDate": 908668800000
  },
  {
    "userId": 3,
    "companyId": 1,
    "email": "josé@gmail.com.br",
    "birthDate": 656208000000
  }
]
```

http://localhost:8080/v1/desafio/user/companyId/1
###### Consultar empresa por id - 200 OK

```json
[
  {
    "userId": 1,
    "companyId": 1,
    "email": "joao@gmail.com.br",
    "birthDate": 771897600000
  },
  {
    "userId": 2,
    "companyId": 1,
    "email": "pedro@gmail.com.br",
    "birthDate": 908668800000
  },
  {
    "userId": 3,
    "companyId": 1,
    "email": "josé@gmail.com.br",
    "birthDate": 656208000000
  }
]
```

http://localhost:8080/v1/desafio/user/email/e%40e.com.br
###### Consultar usuário por email por id - 200 OK

```json
[
  {
    "userId": 1,
    "companyId": 1,
    "email": "joao@gmail.com.br",
    "birthDate": 771897600000
  },
  {
    "userId": 2,
    "companyId": 1,
    "email": "pedro@gmail.com.br",
    "birthDate": 908668800000
  },
  {
    "userId": 3,
    "companyId": 1,
    "email": "josé@gmail.com.br",
    "birthDate": 656208000000
  }
]
```