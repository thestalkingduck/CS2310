package mtr;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class MTRNetwork {
	public HashMap<String, Line> mtrLines;
	public LinkedHashMap<String, Station> mtrStations;

	public MTRNetwork(HashMap<String, Line> lines,LinkedHashMap<String, Station> stations){
		mtrLines = lines;
		mtrStations = stations;
	}
	
}
