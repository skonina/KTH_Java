import java.util.*; // Scanner , Locale
class Temperatures {
	public static void main(String[] args) {
		
		final double INF = 10^308;
		
		
		System.out.println(" TEMPERATURES \n ");
		// input tools
		Scanner in = new Scanner(System. in ); in .useLocale(Locale.US);
		// enter the number of weeks and measurements
		System.out.print(" number of weeks : ");
		int nofWeeks = in .nextInt();

		System.out.print(" number of measurements per week : ");
		int nofMeasurementsPerWeek = in .nextInt();
		// storage space for temperature data
		double[][] t = new double[nofWeeks + 1][nofMeasurementsPerWeek + 1];
	
		double[] minT = new double[nofWeeks + 1];
		double[] maxT = new double[nofWeeks + 1];
		double[] sumT = new double[nofWeeks + 1];
		double[] avgT = new double[nofWeeks + 1];
		
		
		double minTemp = INF;
		double maxTemp = 0;
		double sumTemp = 0;
		double avgTemp = 0;
	
    	
	
		// read the temperatures
		for (int week = 1; week <= nofWeeks; week++) {
			System.out.println(" temperatures - week " + week + " : ");
			minT[week]=INF;
			for (int reading = 1; reading <= nofMeasurementsPerWeek; reading++){
			  t[week][reading] = in .nextDouble();
			  if (t[week][reading] > maxT[week])
			    maxT[week] = t[week][reading];
			  if (t[week][reading] < minT[week])
			    minT[week] = t[week][reading];
			  avgT[week] += t[week][reading]; 
			}
			
			avgT[week] = avgT[week] / nofMeasurementsPerWeek;
			avgTemp += avgT[week] / nofWeeks;
			if (maxT[week] > maxTemp)
			  maxTemp = maxT[week];
			if (minT[week] < minTemp)
			  minTemp = minT[week];
			  
		}
		System.out.println();
		// show the temperatures
		System.out.println(" the temperatures : ");
		for (int week = 1; week <= nofWeeks; week++) {
			for (int reading = 1; reading <= nofMeasurementsPerWeek; reading++)
			System.out.print(t[week][reading] + " ");
			System.out.println();
			System.out.println("Week"+week+" Min:"+minT[week]+" Max:"+maxT[week]+" Avg:"+avgT[week]);
		}
		System.out.println();
		System.out.println("Overall Min:"+minTemp+" Max:"+maxTemp+" Avg:"+avgTemp);
	}
}
