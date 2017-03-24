#!/bin/bash

#Get current position
TOP_DIR=$(pwd)

#Add all necessary jars
LIBPATH=lib/java-json.jar

#compile java file
javac -cp $LIBPATH src/yellow/CallbackCo2.java -d ./bin/.
javac -cp $LIBPATH src/yellow/Writeback.java -d ./bin/.
javac -cp $TOP_DIR/bin:$LIBPATH src/yellow/MainActivity.java -d ./bin/.
