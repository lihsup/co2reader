#!/bin/bash

#Get current position
TOP_DIR=$(pwd)

#Get parameters
function=$1

#Add all necessary jars
LIBPATH=lib/java-json.jar

#run program

javac -cp $TOP_DIR/bin:$LIBPATH src/yellow/$function.java -d ./bin/.
curl 172.17.0.1:3000/co2/WriteMap/$function/1
