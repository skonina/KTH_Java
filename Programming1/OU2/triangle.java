// The bisector method accepts two sides and the angle ( in
// radians ) between these sides . The method returns the
// length of the corresponding bisector - the one which
// splits the given angle in two equals halves .
public static double bisector(double b, double c, double alpha) {
	double p = 2 * b * c * Math.cos(alpha / 2);
	double bis = p / (b + c);
	return bis;
}
