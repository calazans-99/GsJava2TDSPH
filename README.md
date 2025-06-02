# 🚀 SAFE.Core - API para Monitoramento Ambiental

![Java](https://img.shields.io/badge/Java-21-blue?logo=java)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.2.6-green?logo=springboot)
![Oracle](https://img.shields.io/badge/Oracle-Database-red?logo=oracle)
![Maven](https://img.shields.io/badge/Maven-3.9.0-blue?logo=apachemaven)
![Build Status](https://img.shields.io/badge/build-passing-brightgreen)

---

## 📖 Descrição

SAFE.Core é a API REST criada para o projeto **SAFE.Guard**, uma solução inteligente para monitoramento e prevenção de desastres naturais por meio de sensores ambientais.  
Ela oferece gerenciamento completo de sensores, estações, leituras, alertas e riscos, com funcionalidades modernas de CRUD, paginação, validação robusta e documentação interativa via Swagger.

---

## 🛠 Tecnologias Utilizadas

- Java 21
- Spring Boot 3.2.6
- Spring Data JPA
- Oracle Database
- Bean Validation (Jakarta Validation)
- ModelMapper
- Springdoc OpenAPI (Swagger UI)
- Maven

---

## ✨ Funcionalidades Principais

- CRUD completo para Sensores, Estações, Leituras, Alertas e Riscos
- Paginação configurável para listagens
- Validação automática com mensagens claras via Bean Validation
- Tratamento global de erros com respostas padronizadas e amigáveis
- Documentação automática e interativa com Swagger UI
- Arquitetura modular e organizada para facilitar manutenção e expansão

---

## 🚀 Como Rodar Localmente

### Pré-requisitos

- Java JDK 21 instalado
- Oracle Database configurado e acessível
- Maven instalado
- IDE recomendada: IntelliJ IDEA ou similar

### Passos para executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/calazans-99/GsJava2TDSPH.git
   ```
2. Ajuste o arquivo `src/main/resources/application.properties` com suas credenciais do banco Oracle.
3. Execute o script SQL para criar e popular as tabelas:
   ```
   /scripts/SAFE_Unificado_Populado.sql
   ```
4. Inicie a aplicação via Maven:
   ```bash
   mvn clean spring-boot:run
   ```
5. Acesse a API em:
   ```
   http://localhost:8080/api
   ```
6. Explore a documentação Swagger:
   ```
   http://localhost:8080/swagger-ui/index.html
   ```

---

## 📡 Endpoints Principais

| Entidade | Endpoint               | Método | Descrição                      |
| -------- | ---------------------- | ------ | ----------------------------- |
| Sensor   | `/api/sensor`          | GET    | Lista todos os sensores        |
| Sensor   | `/api/sensor/paginado` | GET    | Lista sensores com paginação  |
| Sensor   | `/api/sensor/{id}`     | GET    | Busca sensor por ID           |
| Sensor   | `/api/sensor`          | POST   | Cria um novo sensor           |
| Sensor   | `/api/sensor/{id}`     | PUT    | Atualiza sensor existente     |
| Sensor   | `/api/sensor/{id}`     | DELETE | Remove sensor                 |
| ...      |                        |        | *(outros endpoints CRUD seguem padrão similar)* |

---

## ⚠️ Validação e Tratamento de Erros

- Campos obrigatórios validados automaticamente, com mensagens claras.
- Respostas padronizadas para erros comuns (400, 404, 500).
- Tratamento global via `GlobalExceptionHandler` para uniformizar respostas.

---

## 📈 Status do Projeto

- Funcional para CRUD, paginação, validação e documentação.
- **Autenticação JWT e controle de acesso ainda não implementados.**

---

## 🛠 Próximos Passos Recomendados

- Implementar autenticação e autorização via JWT.
- Criar testes unitários e de integração para garantir qualidade.
- Enriquecer documentação Swagger com exemplos e detalhes.
- Automatizar deploy em ambiente de nuvem.
- Elaborar documentação técnica detalhada e guias para desenvolvedores.

---

## 🤝 Contato

Equipe SAFE.Guard  
📧 contato@safeguard.com
Nome:Marcus Vinicius de Souza Calazans RM:556620
Nome:Felipe Nogueira Ramon RM:555335
Nome:Fernando Hitoshi Hirosima RM:556730
---

<sup>_Obrigado por fazer parte do projeto SAFE.Core!_</sup>
