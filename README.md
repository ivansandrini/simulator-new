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
> https://github.com/jquery/jquery-dist

E descompacte na pasta:
> simulator-web/src/main/resources/static/jquery

##### Materialize
Baixe o conteudo do repositório abaixo:
> https://github.com/Dogfalo/materialize.git

E descompacte na pasta:
> simulator-web/src/main/resources/static/materialize

##### Ace Editor
Baixe o conteudo do repositório abaixo:
> https://github.com/ajaxorg/ace-builds.git

E descompacte na pasta:
> simulator-web/src/main/resources/static/ace-builds

## Compilando
Na pasta raiz do projeto simulator, execute o seguinte comando:
```bash
mvn clean install
```

## Executando
Após os passos acima, antes de iniciar o simulador, será necessario criar as propriedades de conexão com o banco de dados.

Crie as variaveis de ambiente conforme abaixo:

Variavel | Valor
--- | ---
SIMULATOR_DB_DRIVER | com.mysql.jdbc.Driver
SIMULATOR_DB_URL | jdbc:mysql://localhost:3306/simulator
SIMULATOR_DB_USERNAME | nfse
SIMULATOR_DB_PASSWORD | nfse
> Obs: Substitua as informações pelas informações do seu banco de dados.
É interessante que o banco de dados utilizado seja MySQL, pois já está homologado.

Após os passos acima, para executar o simulador, existem dois processos.

##### Monitor
Utilize o comando abaixo, para executar o monitor.
```bash
java -jar simulator-web/target/simulator-web-0.0.1-SNAPSHOT.jar
```

##### Webservices
Utilize o comando abaixo, para executar o web service.
```bash
mvn jetty:run
```
