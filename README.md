# 🌐 SAFE Guard - Sistema de Monitoramento de Riscos Ambientais

> Projeto desenvolvido para a disciplina **Java Advanced** da FIAP - Global Solution 2025/1  
> Tema: **Eventos Extremos da Natureza**  
> Solução proposta: Monitoramento inteligente de riscos ambientais urbanos com alertas em tempo real

---

## 🚀 Visão Geral

O **SAFE Guard** é uma plataforma RESTful desenvolvida com **Spring Boot** que centraliza a coleta, análise e emissão de alertas sobre riscos ambientais como poluição, ruído, radiação UV e vazamentos químicos. Integrado a sensores IoT e um app mobile, o sistema visa prevenir danos à saúde da população e ao meio ambiente em contextos de **eventos extremos**.

---

## 🧩 Funcionalidades

- 🔐 Autenticação segura com JWT
- 📦 CRUD completo para sensores, leituras, estações, alertas e riscos
- 📊 Paginação, ordenação e filtros
- 📚 Documentação automática com Swagger
- 🛡️ Validações robustas com Bean Validation
- ☁️ Deploy em nuvem com Docker (via Railway)
- 📥 Banco de dados PostgreSQL (containerizado)
- 🌐 CORS liberado para uso com app mobile
- 🔄 Integração com front-end React Native e sensores IoT

---

## 🗂️ Tecnologias Utilizadas

- Java 17
- Spring Boot 3
- Spring Security + JWT
- Spring Data JPA
- PostgreSQL
- Swagger / OpenAPI
- Docker e Docker Compose
- ModelMapper
- Maven
- Railway (Deploy)

---

## 🏗️ Arquitetura do Projeto

```
📦 SAFE.Core
 ┣ 📁 config            → JWT, Security, Swagger, CORS
 ┣ 📁 controller        → Endpoints REST
 ┣ 📁 dto               → Modelos de entrada/saída de dados
 ┣ 📁 model             → Entidades JPA
 ┣ 📁 repository        → Interfaces de acesso ao banco
 ┣ 📁 service           → Regras de negócio
 ┣ 📄 application.properties
 ┣ 📄 Dockerfile
 ┗ 📄 docker-compose.yml
```

---

## 🛠️ Como Executar o Projeto Localmente

### Pré-requisitos

- Docker + Docker Compose
- JDK 17
- Git

### Passos

```bash
# Clone o repositório
git clone https://github.com/seu-usuario/safe-guard.git
cd safe-guard

# Build e execução dos containers
docker-compose up --build
```

A API estará disponível em:  
📍 `http://localhost:8080`

Swagger:  
📘 `http://localhost:8080/swagger-ui.html`

---

## 🔐 Autenticação com JWT

- Para acessar endpoints protegidos:
  1. Faça login em `/auth/login` com `username` e `password`
  2. Use o token JWT retornado no header:  
     `Authorization: Bearer {token}`

---

## 🔍 Endpoints Principais (Swagger)

- `/auth/login` – Login e geração de token
- `/sensores` – CRUD de sensores ambientais
- `/leituras` – Registros de medições dos sensores
- `/alertas` – Geração de alertas automáticos
- `/riscos` – Classificação de níveis de risco
- `/estacoes` – Estações de monitoramento

---

## 🔧 Variáveis de Ambiente

Setadas em `application.properties` ou como ENV no Docker:

```properties
spring.datasource.url=jdbc:postgresql://db:5432/safeguard
spring.datasource.username=gs
spring.datasource.password=gs123
safeguard.jwt.secret=segredo-gs-safe
safeguard.jwt.expiration=86400000
```

---

## ✅ Testes

Você pode testar a API com ferramentas como **Postman**, **Insomnia** ou diretamente no **Swagger**.  
Para testes automatizados, o projeto inclui dados de exemplo em `data.sql`.

---

## ☁️ Deploy em Nuvem

A aplicação está hospedada via [Railway](https://railway.app):

🔗 API online: [https://safe-guard.up.railway.app](https://safe-guard.up.railway.app)  
🔗 Swagger online: [https://safe-guard.up.railway.app/swagger-ui.html](https://safe-guard.up.railway.app/swagger-ui.html)

---

## 🎥 Vídeos

- 📺 **Demonstração técnica**: https://youtu.be/link-video-demo
- 📢 **Pitch da solução**: https://youtu.be/link-video-pitch

---

## 👥 Equipe

| Nome Completo      | RM        |
|--------------------|-----------|
| Fulano de Tal      | RM123456  |
| Ciclano de Souza   | RM654321  |
| Beltrano Lima      | RM789123  |

---

## 📄 Licença

MIT License - veja o arquivo `LICENSE` para mais detalhes.
