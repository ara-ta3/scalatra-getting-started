FROM ubuntu:16.10
RUN apt-get update
RUN apt-get install -y openjdk-8-jdk tomcat8
EXPOSE 8080
CMD /etc/init.d/tomcat8 start && wait && tail -f /var/log/tomcat8/catalina.out
