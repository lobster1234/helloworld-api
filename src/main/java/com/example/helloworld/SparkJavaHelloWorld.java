package com.example.helloworld;

import static spark.Spark.*;
import spark.servlet.SparkApplication;

public class SparkJavaHelloWorld implements SparkApplication{

  @Override
  public void init(){
    get("/hello", (req, res) -> {
      return "Hello World!";
    });
  }

}