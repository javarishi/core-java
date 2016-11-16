package com.learn.day12;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class ObjectStreamTest {

	public static void main(String[] args) {
		Customer cst = new Customer();
		cst.setFirstName("David");
		cst.setLastName("Patterson");
		FileInputStream in = null;
		FileOutputStream out = null;
		try {
			out = new FileOutputStream("/RISHI/H2K/TestFiles/customerObj.obj");
			ObjectOutputStream objOut = new ObjectOutputStream(out);
			// Write a Object in Memory
			objOut.writeObject(cst); 
			objOut.close();
			
			in = new FileInputStream("/RISHI/H2K/TestFiles/customerObj.obj");
			ObjectInputStream objIn = new ObjectInputStream(in);
			Customer cst2 =  (Customer) objIn.readObject(); // read a Object from Memory
			
			System.out.println("Customer FirstName :: " + cst2.getFirstName());
			objIn.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
