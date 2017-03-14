FROM openjdk

ADD simulator-web.jar app.jar
RUN bash -c 'touch /app.jar'

ADD wait-for-it.sh wait-for-it.sh
RUN chmod +x /wait-for-it.sh

ENTRYPOINT ["./wait-for-it.sh", "db:3305", "-t", "40", "--", "java", "-jar", "/app.jar"]