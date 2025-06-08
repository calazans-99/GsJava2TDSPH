
# Deploy da API Java + Oracle com Docker

## Requisitos
- Docker e Docker Compose instalados
- Projeto Java buildado com `mvn clean package`

## Como usar

1. Posicione o JAR da API na pasta `/target`
2. Rode o comando abaixo:

```bash
docker-compose up --build
```

3. Acesse:
- Swagger: http://localhost:8080/swagger-ui.html
- Oracle: porta 1521

## Credenciais Oracle
- Usuário: gs
- Senha: gs123
- SID: XEPDB1
