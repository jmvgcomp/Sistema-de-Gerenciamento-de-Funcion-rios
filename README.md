# ![Sistema Simples de Gerenciamento de Funcionários](https://gerenciador-funcionario.herokuapp.com/) [![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)


![apresentacao](https://media.giphy.com/media/UUtvUhw0IfX3W861b6/giphy.gif)

Projeto utilizando Spring Boot, MVC, JPA e Thymeleaf. 

A camada de persistência é padrão DAO a validação de formulário é no lado do servidor utilizando Bean Validation.

Projeto do [curso de Marcio Ballem](https://www.udemy.com/course/spring-boot-mvc-com-thymeleaf/)

## Configuração do banco

Em src\main\resources\application.properties

```bash
spring.datasource.url=jdbc:mysql://localhost:3306/[nomedobanco]?serverTimezone=UTC
spring.datasource.username=[usuario]
spring.datasource.password=[senha]
```


## Contribuindo
Pull Requests são bem-vindos. O intuito é melhorar e aprender cada vez mais, fique à vontade para abrir issues e vamos discutir mudanças!
