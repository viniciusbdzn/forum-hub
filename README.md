# Forum Hub

Bem-vindo ao FórumHub! Este projeto tem como objetivo replicar o funcionamento de um fórum no nível de back-end usando Spring Framework, permitindo aos usuários interagir com tópicos e respostas de maneira eficiente. Esta API REST foi desenvolvida como parte de um desafio para explorar conceitos fundamentais de desenvolvimento back-end, persistência de dados e segurança.

## Funcionalidades

A API FórumHub oferece as seguintes operações principais, seguindo o padrão CRUD (Create, Read, Update, Delete):

- **Criar um novo tópico**
- **Mostrar todos os tópicos criados**
- **Mostrar um tópico específico**
- **Atualizar um tópico**
- **Eliminar um tópico**

## Objetivos do Projeto

- Implementar uma **API REST** que segue as melhores práticas do modelo RESTful.
- Garantir **validações robustas** conforme as regras de negócio definidas.
- Utilizar uma **base de dados relacional** para a persistência dos dados.
- Implementar **autenticação e autorização** para restringir o acesso aos recursos de acordo com o nível de permissão do usuário.

## Tecnologias Utilizadas

- **Java 17**
- **Spring Boot** (para criação da API REST)
- **Spring Security** (para autenticação e autorização)
- **Hibernate** e **JPA** (para mapeamento e manipulação de dados)
- **H2 Database** ou outro banco de dados relacional (como PostgreSQL ou MySQL)
- **JWT (JSON Web Token)** (para gerenciamento de tokens de segurança)

## Endpoints

A API expõe os seguintes endpoints:

| Método HTTP | Endpoint              | Descrição                       |
|--------------|----------------------|----------------------------------|
| `POST`      | `/topicos`           | Cria um novo tópico             |
| `GET`       | `/topicos`           | Lista todos os tópicos          |
| `GET`       | `/topicos/{id}`      | Exibe um tópico específico      |
| `PUT`       | `/topicos/{id}`      | Atualiza um tópico existente    |
| `DELETE`    | `/topicos/{id}`      | Remove um tópico específico     |

## Requisitos de Instalação

1. Clone o repositório para sua máquina local.
2. Certifique-se de ter o Java 17 ou superior e o Maven instalados.
3. Configure o arquivo `application.properties` ou `application.yml` para o banco de dados desejado.

```properties
# Exemplo de configuração de banco de dados
spring.datasource.url=jdbc:h2:mem:forumhub
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.hibernate.ddl-auto=update
