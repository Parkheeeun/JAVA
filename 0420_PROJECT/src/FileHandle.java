import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileHandle {

	
	
	private boolean checkDir(String orgDir) { //디렉토리가 존재하는지 확인하는 메서드
		boolean isResult=false;
		File file=new File(orgDir);
		if(file.exists()) { //디렉토리가 존재하면 true를 리턴
			isResult=true;
		}
		return isResult;
		
	}
	
	private void bytesToFile(String copyDir, byte[] bytes, String fileName) {
		try {
			
			String strFullPath=copyDir+"/"+fileName;
			File file=new File(strFullPath);
			FileOutputStream output=new FileOutputStream(file);
			output.write(bytes);
		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void fileCopy(String orgDir,String copyDir, String fileName) {
	
		boolean isCheckDir=checkDir(copyDir);
		if(!isCheckDir) { //디렉토리가없으면 디렉토리를 만들자.
			File file=new File(copyDir);
			file.mkdirs();
			
		}
		try {
	
			String orgFullName=orgDir+"/"+fileName;
			File orgFile=new File(orgFullName);
			
			//클라이언트가 선택한 파일을 byte[]타입으로 메모리에 저장한다.
			FileInputStream input=new FileInputStream(orgFile);
			
			long orgFileSize=orgFile.length();
			byte[] orgFileBytes=new byte[(byte)orgFileSize];
			int inputNum=0;
			while(true) {
				inputNum=input.read(orgFileBytes);
			
				if(inputNum==-1) {
					break;
				}
			}
			bytesToFile(copyDir,orgFileBytes,fileName);

		
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
