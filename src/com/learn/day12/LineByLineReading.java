package com.learn.day12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class LineByLineReading {

	public static void main(String[] args) {
		BufferedReader reader = null;
		PrintWriter writer = null;
		
		try{
			reader = new BufferedReader(new FileReader("/RISHI/H2K/TestFiles/h2kTestInput.txt"));
			writer = new PrintWriter(new FileWriter("/RISHI/H2K/TestFiles/h2kTestLineByLineout.txt"));
			
			String eachLine;
			
			while((eachLine = reader.readLine()) != null){
				System.out.println(eachLine);
				writer.println(eachLine);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try {
				reader.close();
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
