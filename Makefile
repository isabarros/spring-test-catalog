buildDocker:
	docker build --build-arg JAR_FILE=build/libs/*.jar -t spring-test-catalog .