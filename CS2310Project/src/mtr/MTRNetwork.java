package mtr;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class MTRNetwork {
	public HashMap<String, Line> mtrLines;
	public LinkedHashMap<String, Station> mtrStations;
	public ArrayList<Station> linkingNodes;

	public MTRNetwork(HashMap<String, Line> lines,LinkedHashMap<String, Station> stations,ArrayList<Station> linkNodes){
		mtrLines = lines;
		mtrStations = stations;
		linkingNodes = linkNodes;
	}
	
}
