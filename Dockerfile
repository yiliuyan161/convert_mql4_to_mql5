FROM gradle:5.2-jdk-alpine as builder
USER root
COPY . /project
WORKDIR /project
RUN gradle bootJar

FROM openjdk:8u201-jdk-alpine3.9
RUN sed -i 's/dl-cdn.alpinelinux.org/mirrors.ustc.edu.cn/g' /etc/apk/repositories
RUN apk add fontconfig \
    && apk add --update ttf-dejavu \
    && fc-cache --force
RUN apk add --no-cache tzdata \
    && ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime \
    && echo "Asia/Shanghai" > /etc/timezone \
    &&rm -rf /var/cache/apk/* /tmp/* /var/tmp/* $HOME/.cache
COPY --from=builder /project/build/libs/website-0.0.1.jar /project/    
EXPOSE 8080
ENTRYPOINT java -Xms256M -Xmx768M -jar /project/website-0.0.1.jar
