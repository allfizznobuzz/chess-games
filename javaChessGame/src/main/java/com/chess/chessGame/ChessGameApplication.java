package com.chess.chessGame;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.PrintWriter;

@SpringBootApplication
public class ChessGameApplication {

	public static void main(String[] args) {

		PrintWriter printWriter = new PrintWriter(System.out,true);
		char aa = '\u2654';
		printWriter.println("aa = " + aa);

		//SpringApplication.run(ChessGameApplication.class, args);
	}

}
