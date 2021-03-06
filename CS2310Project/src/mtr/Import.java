package mtr;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;

public class Import {

	public Import (){}
	
	
	
	public MTRNetwork getFromFile(){
		
		BufferedReader input;
		int counter = 0;
		int key = 0;
		String temp;
		String[] tempArray;
		Station[] mtrLine;
		HashMap<String, Line> mtrLines = new HashMap<String, Line>();
		HashMap<String, Station> mtrStations = new HashMap<String, Station>();
		
		try {
			

			input = new BufferedReader(new FileReader(new File("Resources/MTRsystem_partial.csv")));
			do{
				temp = input.readLine();
				if(temp == null){
					break;
				}
				tempArray = temp.split(",");
				mtrLine = new Station[tempArray.length-1];
				for(int i = 1;i < tempArray.length;i++){
					mtrLine[counter] = new Station(tempArray[i],tempArray[0]);
					if(!mtrStations.containsKey(tempArray[i])){
						mtrStations.put(tempArray[i], new Station(tempArray[i],tempArray[0]));
					} else {
						mtrStations.get(tempArray[i]).add(tempArray[0]);
					}
				}
				mtrLines.put(tempArray[0], new Line(mtrLine));
				
			} while (true);
			

			input.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new MTRNetwork(mtrLines,mtrStations);
	}
}
