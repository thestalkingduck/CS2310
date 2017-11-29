package mtr;

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
		//connected line
		//path
		//exit
		
	}
	
}
