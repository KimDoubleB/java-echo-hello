# Java echo test application

<br>

## Overview

Use gradle `bootBuildImage` task to create a container image.

```bash
./gradlew bootBuildImage --imageName={Container Image Name} --publishImage
```


Please refer to [the official document](https://docs.spring.io/spring-boot/docs/2.5.0/gradle-plugin/reference/htmlsingle/#build-image.examples.builder-configuration) for more information on setting the container image.

<br>

## Kubernetes

If you want to use it at Kubernetes, please refer to the deployment/service manifest below.

```yaml
# Deployment
apiVersion: apps/v1
kind: Deployment
metadata:
  name: java-echo-hello
  labels:
    app: java-echo-hello
spec:
  replicas: 1
  selector:
    matchLabels:
      app: java-echo-hello
  template:
    metadata:
      labels:
        app: java-echo-hello
    spec:
      containers:
        - name: java-echo-hello
          image: java-echo-hello # update this value to container image
          ports:
            - containerPort: 8080
---
# Service
apiVersion: v1
kind: Service
metadata:
  name: java-echo-hello-svc
spec:
  selector:
    app: java-echo-hello
  ports:
    - protocol: TCP
      port: 8080
      targetPort: 8080
```
