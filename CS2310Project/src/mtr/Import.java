package mtr;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Import {

	public Import (){}
	
	
	
	public MTRNetwork getFromFile(){
		
		BufferedReader input;
		Station current;
		String temp;
		String[] tempArray;
		ArrayList<Station> mtrLine, linkingStations;
		linkingStations = new ArrayList<Station>();
		HashMap<String, Line> mtrLines = new HashMap<String, Line>();
		LinkedHashMap<String, Station> mtrStations = new LinkedHashMap<String, Station>();
		
		try {
			

			input = new BufferedReader(new FileReader(new File("Resources/MTRsystem_partial.csv")));
			do{
				mtrLine = new ArrayList<Station>();
				temp = input.readLine();
				if(temp == null){
					break;
				}
				tempArray = temp.split(",");
				
				for(int i = 1;i < tempArray.length;i++){
					mtrLine.add(new Station(tempArray[i],tempArray[0]));
					if(!mtrStations.containsKey(tempArray[i])){
						mtrStations.put(tempArray[i], new Station(tempArray[i],tempArray[0]));
					} else {
						mtrStations.get(tempArray[i]).add(tempArray[0]);
					}
				}
				mtrLines.put(tempArray[0], new Line(mtrLine));
			} while (true);
			Iterator<Map.Entry<String, Station>> it;
			//option to user
			//list all
			it = mtrStations.entrySet().iterator();
			while(it.hasNext()){
				
				current = it.next().getValue();
				if( current.lines.size() > 1){
					linkingStations.add(current);
				}
				
			}

			input.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new MTRNetwork(mtrLines,mtrStations,linkingStations);
	}
}
