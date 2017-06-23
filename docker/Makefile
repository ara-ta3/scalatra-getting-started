DOCKER_COMPOSE=$(shell which docker-compose)
DOCKER=$(shell which docker)
conf=

server:
	$(MAKE) docker-compose/up

server/clean: 
	$(MAKE) docker-compose/clean

docker-compose/build:
	$(DOCKER_COMPOSE) build

docker-compose/up: docker-compose/build
	$(DOCKER_COMPOSE) up

docker-compose/clean:
	$(DOCKER_COMPOSE) stop
	$(DOCKER_COMPOSE) rm
