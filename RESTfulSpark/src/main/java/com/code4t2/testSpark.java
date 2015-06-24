package com.code4t2;

import static spark.Spark.get;
import static spark.Spark.post;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.util.Jetty;

import spark.Request;
import spark.Response;
import spark.Route;

public class testSpark {
	
	public static void main(String[] args ) {
		
		get("/hello", (req, res) -> {
			return "Hey, there!";
		});
	}
	
}
