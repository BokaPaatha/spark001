package spark001;

import static spark.Spark.get;

public class MainSpark {
	public static void main(String[] args) {
		get("/hello", (req, res) -> "Hello World");
	}
}
