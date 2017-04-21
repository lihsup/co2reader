#!/bin/bash

#Get parameters

day1=$1
day2=$2
direction=$3
resid=$4
function=$5
cname=$6

#Get current position
TOP_DIR=$(pwd)

#Add all necessary jars
LIBPATH=lib/java-json.jar

docker exec -d $cname ./forward.sh $day1 $day2 $direction $resid $function

