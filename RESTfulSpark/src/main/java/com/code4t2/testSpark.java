package com.code4t2;

import static spark.Spark.get;

public class testSpark {
	
	public static void main(String[] args ) {
		
		get("/hello", (req, res) -> {
			return "Hey, there!";
		});
	}
	
}
