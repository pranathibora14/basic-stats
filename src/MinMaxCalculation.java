import java.util.*;

/**
 * A simple class to compute basic, descriptive statistics.
 */
public class MinMaxCalculation {

  public ArrayList<Double> data = new ArrayList<Double>();

  private double getMin(ArrayList<Double> data) {
    
	  double min = Collections.min(data);
	  return min;
  }

  private double getMax(ArrayList<Double> data) {
    
	  double max = Collections.max(data);
	  return max;
  }

  public static void main() {

  }
}
