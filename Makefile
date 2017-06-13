SBT=./sbt
DOCKER=$(shell which docker)
docker_tag_name=scalatra_getting_started

server/local:
	$(SBT) ~jetty:start

server: package
	cd docker && $(MAKE) server

package:
	$(SBT) assembly
	cp -f target/scala-2.11/scalatra_getting_started-assembly-0.1.0-SNAPSHOT.jar ./builds/ROOT.war
