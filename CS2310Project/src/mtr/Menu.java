package mtr;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class Menu {
	public Menu(){
		Import in = new Import();
		MTRNetwork mtr;
		mtr = in.getFromFile();
		Station current;
		
		
		//option to user
		//list all
		Collection<Station> temp = mtr.mtrStations.values();
		Iterator it = temp.iterator();
		while(it.hasNext()){
			current = (Station) it.next();
			System.out.println(current.name);
		}
		//list line
		ArrayList<Station> temp2 = mtr.mtrLines.get("Disneyland Resort Line").stations;
//		for (int i = 0;i < temp2.size();i++){
//			System.out.println(temp2.get(i).name);
//		}
		//connected line
		System.out.println(temp2.get(0).name);
		System.out.println(temp2.get(temp2.size()-1).name);
		
		//path
		//exit
		
	}
	
}
