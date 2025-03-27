package data;

import java.util.ArrayList;

public class Data {
    private ArrayList <Double> data = new ArrayList<>();    
    private ArrayList <String> errors = new ArrayList<>();     
    private double min;              
    private double max;
    
    /**
     * These 2 arrays can be initialized outside the constructor because they are independent 
     */
    
    public Data(String[] values, double min, double max) {
        this.min = min;
        this.max = max;
        
        for (String val : values) { //Advanced for loop
        	try {
        		data.add(Double.parseDouble(val));
        	}
        	//We know the error to catch from the documentation
        	catch(NumberFormatException nfe){
        		errors.add(val);
        	}
        }
    }

	public ArrayList<Double> getData() {
		return data;
	}

	public void setData(ArrayList<Double> data) {
		this.data = data;
	}

	public ArrayList<String> getErrors() {
		return errors;
	}

	public void setErrors(ArrayList<String> errors) {
		this.errors = errors;
	}
	
	public double calcAverage() throws DataException {
	    double sum = 0;
	    int count = 0;

 	    for (double val : values) {
	        if (val >= min && val <= max) {
	            sum += val;   
	            count++;     
	        }
	    }

 	    if (count == 0) {
	        throw new DataException("There are no data in the specified range");
	    }

 	    return sum / count;
	}
	
	double calcStandardDeviation() {
		try {
			 
		}
		catch(DataException de) {
	        throw new DataException("There are no data in the specified range");
		}
	}

	
}
