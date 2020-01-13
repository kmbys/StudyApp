#!/bin/bash

docker run -i yousan/swagger-yaml-to-html < ./openapi.yml > index.html
