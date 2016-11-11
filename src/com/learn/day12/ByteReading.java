package com.learn.day12;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteReading {

	public static void main(String[] args) {
		FileInputStream in = null;
		FileOutputStream out = null;
		
		try{
			in = new FileInputStream("/RISHI/H2K/TestFiles/h2kTestInput.txt");
			out = new FileOutputStream("/RISHI/H2K/TestFiles/h2kTestByteout.txt");
			int readByte;
			while((readByte = in.read()) != -1){
				out.write(readByte);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
