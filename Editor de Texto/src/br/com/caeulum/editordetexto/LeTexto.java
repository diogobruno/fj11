package br.com.caeulum.editordetexto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class LeTexto {
	public static void main(String[] args) throws IOException {
		
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		
		while (!s.equalsIgnoreCase("fim")) {
			System.out.println(s);
			s = br.readLine();
		}
	}
}
