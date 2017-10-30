FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD service-dashboard-0.0.1-SNAPSHOT.jar app.jar
RUN sh -c 'touch /app.jar'
ENV JAVA_OPTS="-server -Xms256m -Xmx256m"
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]
EXPOSE 10030