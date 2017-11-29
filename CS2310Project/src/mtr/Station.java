package mtr;

import java.util.ArrayList;

public class Station {
	public String name;
	public ArrayList<String> lines;
	public Station(String name, String lineName){
		lines = new ArrayList<String>();
		this.name = name;
		add(lineName);
	}
	public void add(String toAdd){
		lines.add(toAdd);
	}
}
