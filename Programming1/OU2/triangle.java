import java.util.*;
class Triangle {
  // The bisector method accepts two sides and the angle ( in
  // radians ) between these sides . The method returns the
  // length of the corresponding bisector - the one which
  // splits the given angle in two equals halves .
  public static double bisector(double b, double c, double alpha) {
  	double p = 2 * b * c * Math.cos(alpha / 2);
  	double bis = p / (b + c);
  	return bis;
  }
  
  
  public static double circumradius (double a, double b, double c) {
    double cnr = ((a*b*c)/(Math.sqrt(((a+b+c)*(b+c-a)*(c+a-b)*(a+b-c)))));  
	return cnr;
  }
  
  public static double inradius (double a, double b, double c) {
    double inr = Math.sqrt((b+c-a)*(a-b+c)*(a+b-c)/(4*(a+b+c)));
    return inr;
  }
  
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    
    double a = in.nextDouble();
    double b = in.nextDouble();
    double c = in.nextDouble();
    
    System.out.println("The radius of the circumcircle = " + circumradius(a,b,c) + "\nThe radius of the incircle = " + inradius(a,b,c) + "\n");
  }
  
  
  
  
}

