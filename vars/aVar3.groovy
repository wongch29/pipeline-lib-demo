#!/usr/bin/env groovy

def call(String name = 'human', Closure body) {
    echo "hellooo, ${name}."
    
    body()
}
