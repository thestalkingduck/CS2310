package mtr;

import java.util.HashMap;

public class MTRNetwork {
	public HashMap<String, Line> mtrLines;
	public HashMap<String, Station> mtrStations;

	public MTRNetwork(HashMap<String, Line> lines,HashMap<String, Station> stations){
		mtrLines = lines;
		mtrStations = stations;
	}
}
