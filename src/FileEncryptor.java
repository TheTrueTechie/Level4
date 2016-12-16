import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileEncryptor {
	
	static FileReader fr = null; 
	static BufferedReader br = null; 
	
	public static File openSecretFile() {
		
		return new File("./src/NSAClassified_Hacked");
	}

	public static String readOneLine(File file) {
		
		if (br==null) {
			try {
				fr = new FileReader(file);
				br = new BufferedReader(fr);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
		try {
			return br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
			return null; 
		} 
	 
	}

	public static String readFileContents(File file) {
		 
		return null;
	}

}
