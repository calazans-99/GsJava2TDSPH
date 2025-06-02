# SAFE.Core - API para Monitoramento Ambiental

## Descrição
SAFE.Core é a API REST desenvolvida para o projeto SAFE.Guard, uma solução inteligente para monitoramento e prevenção de desastres naturais através de sensores ambientais. Esta API gerencia sensores, estações, leituras, alertas e riscos, oferecendo funcionalidades completas de CRUD, paginação, validação e documentação via Swagger.

---

## Tecnologias Utilizadas
- Java 21
- Spring Boot 3.2.6
- Spring Data JPA
- Oracle Database
- Bean Validation (Jakarta Validation)
- ModelMapper
- Springdoc OpenAPI (Swagger UI)
- Maven

---

## Funcionalidades Implementadas
- CRUD completo para entidades principais: Sensores, Estações, Leituras, Alertas e Riscos
- Paginação configurada para listagem de dados
- Validação de dados via Bean Validation
- Tratamento global de exceções com respostas padronizadas
- Documentação interativa da API via Swagger UI
- Estrutura organizada em pacotes para facilitar manutenção

---

## Como Rodar Localmente

### Pré-requisitos
- Java JDK 21 instalado
- Oracle Database configurado e acessível
- Maven instalado
- IDE recomendada: IntelliJ IDEA

### Passos
1. Clone o repositório:
   ```bash
   git clone https://github.com/calazans-99/GsJava2TDSPH.git
   ```
2. Configure o arquivo `application.properties` com os dados do seu banco Oracle.
3. Execute o script SQL unificado disponível em `/scripts/SAFE_Unificado_Populado.sql` para criar e popular as tabelas.
4. No terminal, dentro do projeto, execute:
   ```bash
   mvn clean spring-boot:run
   ```
5. Acesse a API em: `http://localhost:8080/api`
6. A documentação Swagger está disponível em:  
   `http://localhost:8080/swagger-ui/index.html`

---

## Endpoints Principais

| Entidade  | Endpoint               | Método | Descrição                      |
|-----------|------------------------|--------|-------------------------------|
| Sensor    | `/api/sensor`          | GET    | Lista todos os sensores        |
| Sensor    | `/api/sensor/paginado` | GET    | Lista sensores com paginação  |
| Sensor    | `/api/sensor/{id}`     | GET    | Busca sensor por ID           |
| Sensor    | `/api/sensor`          | POST   | Cria novo sensor              |
| Sensor    | `/api/sensor/{id}`     | PUT    | Atualiza sensor               |
| Sensor    | `/api/sensor/{id}`     | DELETE | Remove sensor                 |
| ...       |                        |        | *(outros endpoints seguem padrão CRUD com paginação)* |

---

## Validação e Tratamento de Erros
- Todos os dados recebidos são validados com mensagens claras em caso de falhas.
- Respostas de erro padronizadas com códigos HTTP apropriados (400, 404, 500).
- Tratamento global de exceções via `GlobalExceptionHandler`.

---

## Status Atual
- Projeto funcional para operações CRUD, paginação, validação e documentação.
- **Autenticação via JWT ainda não implementada.**

---

## Próximos Passos
- Implementar segurança com autenticação e autorização JWT.
- Criar testes unitários e de integração.
- Melhorar documentação Swagger com exemplos detalhados.
- Preparar para deploy em ambiente de nuvem.
- Criar README mais detalhado com diagramas e instruções para contribuidores.

---

## Contato
Equipe SAFE.Guard  
Email: contato@safeguard.com  
Nome:Marcus Vinicius de Souza Calazans RM:556620
Nome:Felipe Nogueira Ramon RM:555335
Nome:Fernando Hitoshi Hirosima RM:556730
---

_Obrigado por contribuir com o projeto!_
