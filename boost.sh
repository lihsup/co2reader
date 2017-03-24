#!/bin/bash

#Get parameters
day1=$1
day2=$2
direction=$3
resid=$4

docker build -t co2reader:0.0.1 .
docker run -d --rm co2reader:0.0.1 $day1 $day2 $direction $resid
#docker rmi co2reader:0.0.1
docker rmi $(docker images -f "dangling=true" -q)
