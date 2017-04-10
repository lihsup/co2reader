#!/bin/bash

#Get current position
TOP_DIR=$(pwd)

#Get parameters
day1=$1
day2=$2
direction=$3
resid=$4
function=$5

#Add all necessary jars
LIBPATH=lib/java-json.jar

#run program

javac -cp $TOP_DIR/bin:$LIBPATH src/yellow/$function.java -d ./bin/.
cd bin
java -cp .:../$LIBPATH yellow/$function $day1 $day2 $direction $resid

