#!/bin/bash

#Get current position
TOP_DIR=$(pwd)

#Get parameters
day1=$1
day2=$2
direction=$3
resid=$4

#Add all necessary jars
LIBPATH=lib/java-json.jar

#run program
cd bin
java -cp .:../$LIBPATH yellow/MainActivity $day1 $day2 $direction $resid
