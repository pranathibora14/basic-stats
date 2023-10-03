import java.util.*;

/**
 * A simple class to compute basic, descriptive statistics.
 */
public class MinMaxCalculation {

  public ArrayList<Double> data = new ArrayList<Double>();

  private double getMinMax(ArrayList<Double> data) {
    
	  double min = Collections.min(data);
	  return min;
  }

  public static void main() {

  }
}
