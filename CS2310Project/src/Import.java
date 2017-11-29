import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Import {

	
	
	
	
	public void getFromFile(){
		BufferedReader input;
		try {
			

			input = new BufferedReader(new FileReader(new File("C:\\Users\\Charlie\\Downloads\\MTRsystem_partial.csv")));
			
			

			input.close();	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {		
		}
	}
}
