SBT=./sbt
DOCKER=$(shell which docker)
docker_tag_name=scalatra_getting_started

server/local:
	$(SBT) ~jetty:start

package:
	$(SBT) package
	cp -f target/scala-2.11/scalatra-getting-started_2.11-0.1.0-SNAPSHOT.war ./builds/ROOT.war
