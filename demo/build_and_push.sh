mvn clean install
docker build . -t dlisaev/cats-api:1.0.0
docker push dlisaev/cats-api:1.0.0
