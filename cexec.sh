#!/bin/bash

#Get parameters
cname=$5
day1=$1
day2=$2
direction=$3
resid=$4

docer start $cname
docker exec -d $cname ./run.sh $day1 $day2 $direction $resid 

