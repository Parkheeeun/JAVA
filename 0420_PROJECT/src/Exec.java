import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Exec {

	public static void main(String[] args) {
		/*
		String strDir="/Users/parkheeeun/자바수업";
		
		try {
			File dir=new File(strDir);
			if(dir.exists()) {
				
			}
			File orgFile=new File(strDir+"/test.txt"); 
			FileInputStream input=new FileInputStream(orgFile);
			long orgFileLength=orgFile.length();
			byte[] orgFileBytes=new byte[(int)orgFileLength];
			int inputNum=0;
			while(true) {
				
			inputNum=input.read();
				if(inputNum==-1) {
					break;
				}
			
			}
			File copyFile=new File("/Users/parkheeeun/자바수업/test1-2.txt");
			FileOutputStream output=new FileOutputStream(copyFile);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}*/
		
		
		
		
		
		FileHandle fh=new FileHandle();
		String orgDir="/Users/parkheeeun/자바수업";
		String copyDir="/Users/parkheeeun/자바수업/testdir";
		String fileName="test.txt";
		fh.fileCopy(orgDir, copyDir, fileName); 
		
		
		
		
		
		
		/*
		File file=new File("/Users/parkheeeun/자바수업/testfile");
		boolean isResult=file.mkdir();
		
		System.out.println(isResult);
		*/
		
		
		
		/*
		File file1=new File("/Users/parkheeeun/자바수업");
		File[] existFiles =file1.listFiles();
		String fileName="";
		String gbn="";
		for(int i=0; i<existFiles.length;i++) {
			fileName=existFiles[i].getName();
			if(existFiles[i].isDirectory()) { //.이없으면 디렉토리로보자는뜻
				gbn="directory";
			}else {
				gbn="file";
			}
			System.out.println(fileName+"-"+gbn);
		}
		
		File file2=new File("/Users/parkheeeun/자바수업");
		File[] existFiles2=file2.listFiles();
		String fileName2="";
		String gbn2="";
		for(File existFile:existFiles2) {
			fileName2=existFile2.getName();
			if(existFiles2[i].isDirectory()) {
				
			}
		}*/
		
		
		
/*
try {
		FileManager fm=new FileManager();
		fm.fileToBytes("/Users/parkheeeun/자바수업","test.txt");
		fm.fileToBytes("/Users/parkheeeun/자바수업","test2.xlsx");
		
		ArrayList<byte[]> arrSavedBytes =fm.getSavedBytes();
		
		
		for(byte[] bytes: arrSavedBytes) {
			 File file=new File("/Users/parkheeeun/자바수업/testdir");
			 FileOutputStream output=new FileOutputStream(file);
			 output.write(bytes);
			 output.flush();
			 output.close();
		}
	}catch(Exception e) {
		e.printStackTrace();
		}
*/	
		
		
		

	}
}
