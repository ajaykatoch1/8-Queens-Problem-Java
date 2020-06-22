package Constraints_Katoch;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Queens {
	
	
	private ArrayList<Integer> past_placements;
	private ArrayList<Integer> domain;
	private Integer current_placement;
	
	public Queens() {
		
		current_placement=-1;
		domain = new ArrayList<Integer>(Arrays.asList(0,1,2,3,4,5,6,7));
		 past_placements = new ArrayList<Integer>();
		past_placements.add(-1);
		
	}
	
	public ArrayList<Integer> getDomain(){
		return domain;
	}
	
	public void removeDomain(Integer p) {
		domain.remove(p);
	}
	
	public void resetDomain() {
		domain.clear();
		domain = new ArrayList<Integer>(Arrays.asList(0,1,2,3,4,5,6,7));
	}
	
	public ArrayList<Integer> getPastPlacements() {
		return past_placements;
	}
	
	public void addPastPlacements(Integer placementObj) {
		past_placements.add(placementObj);
	}
	
	public void resetPastPlacements(){
		past_placements.clear();
		past_placements.add(-1);
	}
	
	public Integer getCurrentPlacement() {
		return current_placement;
	}
	
	public Integer getCurrentPlacementAdd() {
		return current_placement+1;
	}
	
	public void setCurrentPlacements(Integer currPlace){
		this.current_placement=currPlace;
	}
	
	
}
