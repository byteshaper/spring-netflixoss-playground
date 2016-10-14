FROM dockerhub.zanox.com:5000/baseimage-java:latest

# define working directory.
WORKDIR /srv

# copy jar to docker
ADD helixstatistic-service*.jar /srv/helixstatistic-service.jar

# create log dir
RUN mkdir -p /srv/log/helixstatistic-service

# expose ports
EXPOSE 8080
EXPOSE 80

# go
CMD ["java","-Xms1G","-Xmx3G","-jar","/srv/helixstatistic-service.jar"]
