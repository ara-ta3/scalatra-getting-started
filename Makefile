SBT=./sbt
DOCKER=$(shell which docker)
docker_tag_name=scalatra_getting_started

server:
	$(SBT) ~jetty:start

package:
	$(SBT) package

docker/build:
	$(DOCKER) build . -t $(docker_tag_name)

docker/run: docker/build
	$(DOCKER) run $(docker_tag_name)

