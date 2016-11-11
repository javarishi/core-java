package com.learn.day12;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterReading {

	public static void main(String[] args) {
		FileReader reader = null;
		FileWriter writer = null;
		try{
			reader = new FileReader("/RISHI/H2K/TestFiles/h2kTestInput.txt");
			writer = new FileWriter("/RISHI/H2K/TestFiles/h2kTestCharacterout.txt");
			StringBuffer bffer = new StringBuffer();
			int charInt;
			while((charInt = reader.read()) != -1){
				bffer.append(charInt);
				writer.write(charInt);
			}
			System.out.println(bffer);
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
