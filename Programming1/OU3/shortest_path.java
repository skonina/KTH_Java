import java.util.*;




class TheShortestPath {
	// The method intermediateStations returns a vector of the
	// intermediate stations that are on the shortest path .
	// The ordinal number of the first station is located in
	// index 1 of the vector , and the second station on index 2.
	public static int[] intermediateStations(int[] a, int[][] b, int[] c) {
		// *** WRITE YOUR CODE HERE ***
		final int MAXX = 1000000;
		
		
		int[] f = new int[3];
		int sum = MAXX;
		
		
		for(int a_current = 0; a_current < a.length; a_current++)
		{
		  if (a[a_current] < sum)
		  {
		    for(int b_current = 0; b_current < b[a_current].length; b_current++)
		    {
		      if( (a[a_current] + b[a_current][b_current] + c[b_current]) < sum)
		      {
		        sum = a[a_current] + b[a_current][b_current] + c[b_current];
		        f[0] = a_current;
		        f[1] = b_current;
		        // System.out.println("! " + sum + ": " + (f[0]+1) +" "+ (f[1]+1) +"<=" + a[a_current] +" " + b[a_current][b_current] + " " + c[b_current]);
		      }
		    }
		  }
		}
		return f;
	}
	// The method length returns the length of the shortest path .
	public static int PathLength(int[] a, int[][] b, int[] c) {
	
		int[] iS = intermediateStations(a, b, c);
		
		return (a[iS[0]] + b[iS[0]][iS[1]] + c[iS[1]]);
	}
	
}

class DetermineTheShortestPath {
  public static void main(String[] args){
	  Scanner in = new Scanner (System.in);
	  
	  int a_length = in.nextInt();
	  int b_length = in.nextInt();
	 // int b2_length = in.nextInt();
	 // int c_length = in.nextInt();
	  
	  int[] a = new int[a_length];
	  int[][] b = new int[a_length][b_length];
	  int[] c = new int[b_length];
	  
	  for(int q = 0; q < a_length; q++){
	    a[q] = in.nextInt();
	  }
	  
	  for(int q = 0; q < a_length; q++){
	    for(int s = 0; s < b_length; s++){
	      b[q][s] = in.nextInt();
	    }
	  }
	  
	  for(int q = 0; q < b_length; q++){
	    c[q] = in.nextInt();
	  }
	  
	  
	  int[] result = TheShortestPath.intermediateStations(a,b,c);
	  
	  System.out.println("Result: " + (result[0]+1)+ " "  + (result[1]+1) );
	  System.out.println("Length: " + TheShortestPath.PathLength(a,b,c) );
	  
	}
}

	
