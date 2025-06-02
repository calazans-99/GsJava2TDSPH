
# 🌐 SAFE.Core – API RESTful de Monitoramento Ambiental

Projeto Java Spring Boot criado como parte da Global Solution 2025 – FIAP. Esta API compõe o núcleo do sistema **SAFE.Guard**, responsável por registrar, consultar e gerenciar estações, sensores e leituras ambientais em tempo real.

---

## 📌 Funcionalidades

- 🔁 CRUD completo para:
  - Estações (nome, cidade, estado)
  - Sensores (tipo, vinculação com estação)
  - Leituras (data/hora, valor, vinculação com sensor)
- 🔎 Paginação e ordenação automática nos endpoints
- 🧾 Documentação Swagger para testes
- 🔒 Estrutura preparada para segurança JWT (se necessário)
- 🔧 Estrutura modular pronta para deploy em nuvem e integração com app mobile

---

## 🛠️ Tecnologias Utilizadas

- Java 17+
- Spring Boot 3.x
- Spring Web
- Spring Data JPA
- Hibernate
- Oracle Database (via JDBC)
- ModelMapper
- Jakarta Validation
- Swagger (springdoc-openapi)

---

## 🚀 Como Executar o Projeto

### Pré-requisitos:
- JDK 17+
- Maven 3.x
- Banco Oracle com tabelas configuradas
- IDE recomendada: IntelliJ ou Eclipse

### Passos:
1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/SAFE.Core.git
   ```

2. Configure o `application.properties`:
   ```properties
   spring.datasource.url=jdbc:oracle:thin:@//oracle.fiap.com.br:1521/orcl
   spring.datasource.username=SEU_USUARIO
   spring.datasource.password=SUA_SENHA
   spring.jpa.hibernate.ddl-auto=none
   spring.jpa.show-sql=true
   ```

3. Execute com:
   ```bash
   mvn spring-boot:run
   ```

---

## 📑 Endpoints Principais

### 📍 Estações (`/api/estacoes`)
- `POST` Criar
- `GET` Listar com paginação
- `GET /{id}` Buscar por ID
- `PUT /{id}` Atualizar
- `DELETE /{id}` Deletar

### 📍 Sensores (`/api/sensores`)
- `POST` Criar
- `GET` Listar com paginação
- `GET /{id}` Buscar por ID
- `PUT /{id}` Atualizar
- `DELETE /{id}` Deletar

### 📍 Leituras (`/api/leituras`)
- `POST` Criar
- `GET` Listar com paginação
- `GET /{id}` Buscar por ID
- `PUT /{id}` Atualizar
- `DELETE /{id}` Deletar

---

## 🔎 Swagger (Documentação)

Acesse após rodar a aplicação:
```
http://localhost:8080/swagger-ui.html
```

---

## ✅ Padrões de Código Aplicados

- Clean Code e RESTful
- Injeção de dependência por construtor
- Tratamento de exceções (`ResponseStatusException`)
- Uso de DTOs e validações com `@Valid`, `@NotBlank`, `@Schema`
- ModelMapper para conversão DTO ↔ Entidade

---

## 📦 Estrutura de Pacotes

```
br.com.fiap.safeguard
│
├── config               # Configurações (ModelMapper, etc.)
├── controller           # Camada de controle (REST)
├── dto                  # Objetos de Transferência de Dados
├── model                # Entidades JPA
├── repository           # Interfaces JpaRepository
├── service              # Regras de negócio
└── SafeguardApplication.java
```

---

## 🤝 Autores

- **Marcus Calazans** – FIAP Global Solution 2025
- Professores e mentores do curso 2TDSS – Java Advanced

---

## 📘 Licença

Este projeto é de uso acadêmico no contexto da disciplina Global Solution – FIAP.
