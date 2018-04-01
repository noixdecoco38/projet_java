package RELATION;

import java.util.ArrayList;
import TYPE.Attribute;

public class Schema {
	protected ArrayList<Attribute> tableau_attributs;
	
	
	protected Schema(ArrayList<Attribute> tab) {
		tableau_attributs = new ArrayList<Attribute>(tab);
	}
	
	protected Attribute getAttribute(int index) {
		return tableau_attributs.get(index);
	}
	
	protected void addAttribute(Attribute att) {
		 tableau_attributs.add(att);
	}
	
}
