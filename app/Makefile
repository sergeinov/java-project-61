# Makefile
build:
	./gradlew installDist
install:
	./gradlew clean install
run:
	./build/install/my-app/bin/my-app
lint:
	./gradlew checkstyleMain
report:
	./gradlew jacocoTestReport
update:
	./gradlew useLatestVersions