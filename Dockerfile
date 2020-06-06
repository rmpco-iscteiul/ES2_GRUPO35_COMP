# Source Image name
from openjdk:7
# Mainter Name
maintainer Amar Singh
COPY . /usr/app/
WORKDIR /usr/app
# Command to update and install Apache packages
# open port 
EXPOSE 80
# Command to run Apache server in background
CMD ["java", “-jar", “ES2-0.0.1-SNAPSHOT.jar"]
