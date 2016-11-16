package com.learn.day12;

import java.io.File;

public class FileHandlingTest {

	public static void main(String[] args) {
		File file = new File("/RISHI/H2K/TestFiles/fileTest.txt");
		File file2 = new File("/RISHI/H2K/TestFiles/TestDir/fileTest2.txt");
		try{
			boolean isExists = file.exists();
			if(isExists){
				System.out.println("File is Present");
			}else{
				System.out.println("File is not present so create new one");
				file.createNewFile(); 
				file2.createNewFile();
			}
		boolean status = file2.renameTo(file); 
		System.out.println("Rename status :: " + status);
		
		File dirFile = new File("/RISHI/H2K/TestFiles/TestDir");
		dirFile.mkdirs(); // create directory
		
		File testFilesDir = new File("/RISHI/H2K/TestFiles");
		File[] filesInDir = testFilesDir.listFiles(); // all files in Dir
		
		for(File eachFile : filesInDir){
			System.out.println(eachFile.getName()); // Prints the name of each file
			System.out.println(eachFile.getAbsolutePath());
			System.out.println(eachFile.getPath());
			System.out.println(eachFile.canRead());
			System.out.println(eachFile.canWrite());
			System.out.println(eachFile.canExecute());
			
		}
		file.deleteOnExit(); // File will be deleted
		
		
		
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
