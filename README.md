
# 🌍 SAFE.Core – API REST para Monitoramento de Desastres Naturais

> Sistema Inteligente de Monitoramento e Prevenção de Desastres Naturais – Global Solution FIAP 2025

---

## 🚀 Visão Geral

O **SAFE.Core** é a API principal do sistema **SAFE.Guard**, responsável por receber dados de sensores ambientais e processar os riscos em tempo real, oferecendo suporte a decisões preventivas contra desastres como enchentes, incêndios e deslizamentos.

---

## 🧠 Funcionalidades

- 📡 Registro de sensores e leituras ambientais
- 🚨 Cálculo de risco automatizado com base nos dados recebidos
- 📈 Emissão de alertas preventivos por região
- 🔐 Autenticação com JWT
- 📊 Integração com frontend e aplicativo mobile

---

## 🛠️ Tecnologias Utilizadas

| Tecnologia         | Finalidade                                 |
|--------------------|---------------------------------------------|
| Java 21            | Linguagem principal                         |
| Spring Boot 3.2.6  | Framework de desenvolvimento API            |
| Spring Security    | Controle de acesso e autenticação           |
| JWT (JJWT)         | Geração e validação de tokens de segurança  |
| Maven              | Gerenciamento de dependências               |
| Oracle DB          | Banco de dados relacional                   |
| Swagger / OpenAPI  | Documentação automática de endpoints        |
| ModelMapper        | Conversão entre entidades e DTOs            |

---

## 📑 Endpoints Principais

### 🔐 Autenticação
| Método | Rota             | Descrição              |
|--------|------------------|------------------------|
| POST   | /api/auth/login  | Login e retorno do JWT |

### 🛰️ Estações
| Método | Rota               | Descrição                      |
|--------|--------------------|--------------------------------|
| GET    | /api/estacoes      | Listar todas as estações       |
| GET    | /api/estacoes/{id} | Buscar por ID                  |
| POST   | /api/estacoes      | Criar nova estação             |
| PUT    | /api/estacoes/{id} | Atualizar estação              |
| DELETE | /api/estacoes/{id} | Remover estação                |

### 🔧 Sensores
| Método | Rota             | Descrição               |
|--------|------------------|-------------------------|
| GET    | /api/sensores    | Listar sensores         |
| POST   | /api/sensores    | Criar sensor            |

### 🌡️ Leituras
| Método | Rota             | Descrição                       |
|--------|------------------|---------------------------------|
| GET    | /api/leituras    | Listar leituras                 |
| POST   | /api/leituras    | Registrar leitura de sensor     |

### ⚠️ Alertas
| Método | Rota             | Descrição                     |
|--------|------------------|-------------------------------|
| GET    | /api/alertas     | Listar alertas gerados        |

---

## 🔐 Acesso ao Swagger

Após iniciar a aplicação:

📎 [`http://localhost:8080/swagger-ui.html`](http://localhost:8080/swagger-ui.html)

Clique em **Authorize** e insira o token JWT.

---

## 🧪 Execução Local

1. Clone o repositório:
```bash
git clone https://github.com/calazans-99/GsJava2TDSPH.git
```

2. Navegue até a pasta do projeto:
```bash
cd SAFE.Core
```

3. Execute a aplicação com Maven:
```bash
./mvnw spring-boot:run
```

4. Acesse a documentação:
```
http://localhost:8080/swagger-ui.html
```

---

## 👨‍💻 Autores

| Nome                            | RM      |
|---------------------------------|---------|
| Marcus Vinicius de Souza Calazans | 556620 |
| Felipe Nogueira Ramon            | 555335 |
| Fernando Hitoshi Hirasima        | 558730 |

---

## 🛡️ Segurança

- Todas as rotas (exceto `/api/auth/login`) são protegidas por token JWT.
- Use o token gerado no login para autenticar suas requisições.

---

## ✅ Status

🟢 **Projeto em desenvolvimento avançado – Integrado com frontend e app mobile**

---

