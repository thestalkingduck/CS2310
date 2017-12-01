package mtr;
import java.util.Map.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Menu {
	public Menu(){
		Import in = new Import();
		MTRNetwork mtr;
		mtr = in.getFromFile();
		Station current;
		Iterator<Map.Entry<String, Station>> it;
		//option to user
		//list all
		it = mtr.mtrStations.entrySet().iterator();
		while(it.hasNext()){
			current = (Station) it.next().getValue();
			System.out.println(current.name);
		}
		//list line
		ArrayList<Station> temp2 = mtr.mtrLines.get("Disneyland Resort Line").stations;
		for (int i = 0;i < temp2.size();i++){
			System.out.println(temp2.get(i).name);
		}
		//connected line
		System.out.println(temp2.get(0).name);
		System.out.println(temp2.get(temp2.size()-1).name);
		
		//path
		//exit
		
	}
	
}
