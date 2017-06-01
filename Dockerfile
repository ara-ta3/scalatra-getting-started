FROM tomcat:8.0
COPY target/scala-2.11/scalatra-getting-started_2.11-0.1.0-SNAPSHOT.war /usr/local/tomcat/webapps/ROOT.war
