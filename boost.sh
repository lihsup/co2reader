#!/bin/bash

#Get parameters
cname=$1


docker build -t co2reader:0.0.1 .
docker rmi $(docker images -f "dangling=true" -q)
docker run -dit --name $cname co2reader:0.0.1 
#docker run -dit co2reader:0.0.1 $day1 $day2 $direction $resid 
#docker rmi co2reader:0.0.1
#docker exec -d penguin4 ./run.sh 11 12 north 9087
