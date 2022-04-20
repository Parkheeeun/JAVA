import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;

public class FileManager {

	//private HashMap<String, byte[]> hashSavedMap; --이걸로도 해보기
	
	private ArrayList<byte[]> savedBytes;
	
	public ArrayList<byte[]> getSavedBytes(){
		return this.savedBytes=new ArrayList<byte[]>();
	}
	
	public void fileToBytes(String strDir, String strFileName) {
		
		try {
			String fileFullPath=strDir+"/"+strFileName;
			File file=new File(fileFullPath);
			long filelength= file.length();
			byte[] bytes=new byte[(int)filelength];
			
			InputStream input=new FileInputStream(file);
			int inputNum=0;
			while(true) {
				inputNum=input.read(bytes);
				if(inputNum==-1) {
					break;
				}
			
		}
			File copyFile=new File("/Users/parkheeeun/자바수업/"+strFileName);
			FileOutputStream output=new FileOutputStream(copyFile);
			output.write(bytes);
			
			input.close();
			output.flush();
			output.close();
			
			
			//savedBytes.add(bytes);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
