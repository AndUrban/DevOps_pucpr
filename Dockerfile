# Etapa 1: Usar uma imagem base do OpenJDK
FROM openjdk:17-jdk-slim

# Etapa 2: Criar um diretório dentro do container para a aplicação
WORKDIR /app

# Etapa 3: Copiar o arquivo JAR gerado para dentro do container
COPY dist/biblioteca-virtual.jar app.jar

# Etapa 4: Definir o comando para rodar a aplicação Java
ENTRYPOINT ["java", "-jar", "app.jar"]
