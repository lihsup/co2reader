FROM java:8
COPY . /usr/src/myapp
WORKDIR /usr/src/myapp/
RUN chmod +x make.sh
RUN chmod +x run.sh
RUN ./make.sh MainActivity
CMD ["/bin/bash"]
