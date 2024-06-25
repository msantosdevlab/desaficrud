# CRUD de Clientes - Desafio

Este repositório contém o código-fonte de um projeto Spring Boot que implementa um CRUD completo de web services REST para gerenciar clientes. Este projeto faz parte do Módulo "API REST, camadas, CRUD, exceções, validações" da formação Java Spring Professional oferecida pela [DevSuperior](https://devsuperior.com.br).

A pontuação obtida na avaliação foi 10 de 10.

## Funcionalidades

O projeto implementa as seguintes operações:

- **Busca paginada de recursos**: Retorna uma lista de clientes com paginação.
- **Busca de recurso por ID**: Retorna um cliente específico pelo seu ID.
- **Inserir novo recurso**: Adiciona um novo cliente ao banco de dados.
- **Atualizar recurso**: Atualiza as informações de um cliente existente.
- **Deletar recurso**: Remove um cliente do banco de dados.

## Especificações da Entidade Cliente

Um cliente possui os seguintes atributos:

- **Nome**: `name` (String)
- **CPF**: `cpf` (String)
- **Renda**: `income` (Double)
- **Data de Nascimento**: `birthDate` (LocalDate)
- **Quantidade de Filhos**: `children` (Integer)

## Regras de Validação
- **Nome**: Não pode ser vazio.
- **Data de Nascimento**: Não pode ser uma data futura (use a anotação `@PastOrPresent`).

## Tratamento de Exceções
- **ID não encontrado**: Retorna código 404 para GET por ID, PUT e DELETE.
- **Erro de validação**: Retorna código 422 e mensagens customizadas para cada campo inválido.

## Configuração do Ambiente

O projeto utiliza as seguintes tecnologias e configurações:

- **Spring Boot**
- **Maven**: Gerenciador de dependências.
- **Java**: Linguagem de programação.
- **H2 Database**: Banco de dados em memória para testes.
- **Seed de Dados**: Inicializa o banco de dados com pelo menos 10 clientes com dados significativos.

## Como Executar o Projeto

1. **Clone o repositório**:
   ```bash
   git clone https://github.com/msantosdevlab/desaficrud
   ```
2. **Importe o projeto na sua IDE**:
   - Certifique-se de que a IDE está configurada para usar Java e Maven.
3. **Execute o projeto**:
   - O projeto pode ser executado como uma aplicação Spring Boot na sua IDE.
4. **Acesse o banco de dados H2**:
   - O console do H2 Database pode ser acessado em `http://localhost:8080/h2-console`.

## Endpoints da API

### Busca de Cliente por ID
- **GET** `/clients/{id}`

### Busca Paginada de Clientes
- **GET** `/clients?page=0&size=6&sort=name`

### Inserção de Novo Cliente
- **POST** `/clients`
  ```json
  {
    "name": "Maria Silva",
    "cpf": "12345678901",
    "income": 6500.0,
    "birthDate": "1994-07-20",
    "children": 2
  }
  ```

### Atualização de Cliente
- **PUT** `/clients/{id}`
  ```json
  {
    "name": "Maria Silvaaa",
    "cpf": "12345678901",
    "income": 6500.0,
    "birthDate": "1994-07-20",
    "children": 2
  }
  ```

### Deleção de Cliente
- **DELETE** `/clients/{id}`

## Checklist de Correção
1. Busca por ID retorna cliente existente.
2. Busca por ID retorna 404 para cliente inexistente.
3. Busca paginada retorna listagem paginada corretamente.
4. Inserção de cliente insere cliente com dados válidos.
5. Inserção de cliente retorna 422 e mensagens customizadas com dados inválidos.
6. Atualização de cliente atualiza cliente com dados válidos.
7. Atualização de cliente retorna 404 para cliente inexistente.
8. Atualização de cliente retorna 422 e mensagens customizadas com dados inválidos.
9. Deleção de cliente deleta cliente existente.
10. Deleção de cliente retorna 404 para cliente inexistente.

