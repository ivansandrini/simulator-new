# Simulator

> Simulator é um simulador para prefeituras.

## Dependências Monitor
Antes de compilar o simulador, é preciso baixar as libs de front-end do monitor (simulator-web).
Isto pode ser feito de duas formas utilizando bower, ou baixando as diretamente.

### Bower
Na pasta raiz do monitor (simulator-web), execute o seguinte comando:

```bash
bower install
```

O processo demora um pouco até concluir.

### Download
Caso não possua o bower, as dependencias podem ser baixadas manualmente conforme abaixo.

##### jQuery
Baixe o conteudo do repositório abaixo:
> https://github.com/jquery/jquery-dist#3.1.1

E descompacte na pasta:
> simulator-web/src/main/resources/static/jquery

##### Material Icons
Baixe o conteudo do repositório abaixo:
> https://github.com/google/material-design-icons.git#3.0.1

E descompacte na pasta:
> simulator-web/src/main/resources/static/material-design-icons

##### Materialize
Baixe o conteudo do repositório abaixo:
> https://github.com/Dogfalo/materialize.git#0.97.7

E descompacte na pasta:
> simulator-web/src/main/resources/static/materialize

## Compilando
Na pasta raiz do projeto simulator, execute o seguinte comando:
```bash
mvn clean install
```

## Executando
Após os passos acima, para executar o simulador, existem dois processos.

##### Monitor
Verifique a configuração de banco, para apontar para o servidor de banco local.
> simulator-web/src/main/resources/application.properties

Utilize o comando abaixo, para executar o monitor.
```bash
java -jar simulator-web/target/simulator-web-0.0.1-SNAPSHOT.jar
```

##### Webservices
Verifique a configuração de banco, para apontar para o servidor de banco local.
> simulator-ws/src/main/resources/META-INF/persistence.xml

Utilize o comando abaixo, para executar o web service.
```bash
mvn jetty:run
```
