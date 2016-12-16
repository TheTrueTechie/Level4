import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Copyright {
	public static void main(String[] args) {

		try (Stream<Path> paths = Files.walk(Paths.get("./src"))) {
			paths.forEach(filePath -> {
				if (Files.isRegularFile(filePath) && filePath.toFile().getName().endsWith(".java")) {
					System.out.println(filePath);

					if (!isCopyrighted(filePath)) {
						addCopyright(filePath);
						System.out.println("Adding Copyright!");

					}

				}
			});
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static boolean isCopyrighted(Path filePath) {
		 String CurrentLine = "";
		 String lastLine = "";
		try (FileReader fw = new FileReader(filePath.toString());
				BufferedReader br = new BufferedReader(fw)){
			
			

			    while ((CurrentLine = br.readLine()) != null) 
			    {
			        lastLine = CurrentLine;
			    }
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return (lastLine.startsWith("//Copyright"));
		
	}

	private static void addCopyright(Path filePath) {

		try (FileWriter fw = new FileWriter(filePath.toString(), true);
				BufferedWriter bw = new BufferedWriter(fw);
				PrintWriter out = new PrintWriter(bw)) {
			out.println("//Copyright ©TheTrueTechies");
			
		} catch (IOException e) {
			e.printStackTrace();

		}
	}
}

// Copyright ©TheTrueTechies
//Copyright ©TheTrueTechies
