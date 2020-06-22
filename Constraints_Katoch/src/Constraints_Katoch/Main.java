package Constraints_Katoch;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	Queens[] q = new Queens[8];
	public static int solutionCount=0;
	public static int backtrackCount=0;
	


	public static void forwardCheck(Queens[] q){
		
		for(int i=0;i<7;i++) {
			if(q[i].getCurrentPlacement() != -1) {
			for(int j=i+1;j<8;j++) {
				
				//if(q[i].getCurrentPlacement() != -1) {
				if(q[j].getDomain().contains(q[i].getCurrentPlacement())){
					q[j].getDomain().remove(q[i].getCurrentPlacement());
				}
					int temp1=q[i].getCurrentPlacement();
					int temp2=temp1+(j-i);
					int temp3=temp1-(j-i);
					Integer temp4 = temp2;
					Integer temp5 = temp3;
					
					if(temp2<8) {
						if(q[j].getDomain().contains(temp2)){
							q[j].getDomain().remove(temp4);
						}
					}
					
					if(temp3>=0) {
						if(q[j].getDomain().contains(temp3)){
							q[j].getDomain().remove(temp5);
						}
					}
					
				}
				
			}
			
		}
		
	}
	
	public static void printTest(Queens[] q) {
		
		   int n = 8;
	
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	            	if(!q[i].getDomain().contains(j)) {
	            		System.out.print("X ");
	            	}
	            	else if (q[i].getCurrentPlacement() == j) {
	                	System.out.print("Q ");
	                }
	                
	                else {
	                	System.out.print("* ");
	                }
	            }
	            System.out.println();
	        }
	}
	
	public static void printSolution(Queens[] q) {
		
		   int n = 8;
		   String letter="";
		   
		   for(int l=0;l<8;l++) {
			   if(q[l].getCurrentPlacement()==0) {
				   letter="A";
			   }
			   else if(q[l].getCurrentPlacement()==1) {
				   letter="B";
			   }
			   else if(q[l].getCurrentPlacement()==2) {
				   letter="C";
			   }
			   else if(q[l].getCurrentPlacement()==3) {
				   letter="D";
			   }
			   else if(q[l].getCurrentPlacement()==4) {
				   letter="E";
			   }
			   else if(q[l].getCurrentPlacement()==5) {
				   letter="F";
			   }
			   else if(q[l].getCurrentPlacement()==6) {
				   letter="G";
			   }
			   else if(q[l].getCurrentPlacement()==7) {
				   letter="H";
			   }
		   }
		 
	        for (int i = 0; i < n; i++) {
	        	int temp=i+1;
	            for (int j = 0; j < n; j++) {
	            	
	            	if (q[i].getCurrentPlacement() == j) {
	                	System.out.println("Queen "+temp+": Row "+temp+", Column "+q[i].getCurrentPlacementAdd());
	                }
	                
	                else {
	                	System.out.print("");
	                }
	            }
	        }
	}
	
	
	public static void reset(Queens[] q,int k) {
		
		Integer temp1 = k;
		q[k].addPastPlacements(q[k].getCurrentPlacement());
		q[k].setCurrentPlacements(-1);
		k=k+1;
		while(k<8) {
			q[k].resetDomain();
			q[k].resetPastPlacements();
			k++;
		}
		
	}
	
	public static Boolean place(Queens q) {
		 
		
		if(q.getCurrentPlacement() != -1) {
			System.out.println("ERROR ATTEMPT TO PLACE AN ALREDY PLACED QUEEN");
			System.exit(0);
		}
		
		for(int i = 0; i < 8; ++i) {
			if((q.getDomain().contains(i)) && (!q.getPastPlacements().contains(i)) ) {
				q.setCurrentPlacements(i);
				return true;
			}
		}		
		return false;
	}
	
	
	public static Boolean deadEnd(Queens[] q) {
		
		for(int i =0; i < 8; ++i) {
			if(q[i].getDomain().isEmpty()) {
				return true;
			}
		}
		return false;
	}
	
public static Boolean placeCheck(Queens q) {		
		
		for(int i = 0; i < 8; ++i) {
			if((q.getDomain().contains(i)) && (!q.getPastPlacements().contains(i)) ) {
				return true;
			}
		}		
		return false;
	}
	

	//recursive
	/*public static void Money(Queens[] q, int k ) {
		//SOLUTION CHECK
		if( k == 8) {
			solutionCount++;
			//place holder for print
			printSolution(q);
			
			backtrackCount = 0;
			return;
		}
		//END CHECK
		if(!placeCheck(q[1])) {
			if(solutionCount == 0) {
				System.out.println("There were no solutions for your placement of Queen 1");
				System.exit(0);
			}
		}
		
		//WORK ZONE
		for(int i = 0; i <8;++i) {
			if(place(q[k])) {
				forwardCheck(q);
				printTest(q);
				if(!deadEnd(q)) {
					Money(q, k+1);
					backtrackCount++;
				}else {
					backtrackCount++;
				}
			}
			reset(q,k);
		}
		
	}*/


public static void recursive(Queens[] q, int k ) {
	//SOLUTION CHECK
	if( k == 8) {
		solutionCount++;
		//place holder for print
		System.out.println();
		System.out.println("Solution " + solutionCount+":");
		System.out.println("The positions of the queens are: ");
		//printTest(q);
		printSolution(q);
		System.out.println("Total number of backtracks in this solution with forward checking: "+ backtrackCount);
		System.out.println("Total number of backtracks in this solution with directional look ahead: "+backtrackCount/2);
		backtrackCount = 0;
		return;
	}
	//END CHECK
	if(!placeCheck(q[1])) {
		if(solutionCount == 0) {
			System.out.println("There were no solutions for your placement of Queen 1");
			return ;
		}
	}
	
	//WORK ZONE
	for(int i = 0; i <8;++i) {
		if(place(q[k])) {
			forwardCheck(q);
			if(!deadEnd(q)) {
				recursive(q, k+1);
				backtrackCount++;
			}else {
				backtrackCount++;
			}
		}
		reset(q,k);
	}
	
}

	
	public static void main(String args[]) {
		
		//-----------------------------------------test-------------------------------------------
		
		
		
		//--------------------------------------------test----------------------------------------
		
		Queens[] q= new Queens[8];
		for(int i =0; i<8;i++) {
			q[i] = new Queens();
		}
		
		System.out.println("8 Queens Problem");
		System.out.println("----------------");
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.print("Enter the position of the first queen within row 1(ex.columns 1-8): ");
	    int firstQueen = myObj.nextInt();
	    if(firstQueen>8) {
	    	System.out.println("Not a valid placement for queen 1");
	    	
	    }
	    else {
	    	Integer firstQueenUse=new Integer(firstQueen);
	    	System.out.println("You have placed the first queen in row 1, column "+firstQueenUse);
	    	q[0].setCurrentPlacements(firstQueenUse-1);
	    	//printTest(q);
	    	System.out.println();
	    	recursive(q,1);
	    }
		
		
	}
	
}
