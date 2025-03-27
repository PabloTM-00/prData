package data;

import java.util.ArrayList;

public class Data {
    private ArrayList <Double> data;       
    private ArrayList <String> errors;     
    private double min;              
    private double max;
    
    public Data(String[] inputData, double min, double max) {
        this.data = new ArrayList<>();
        this.errors = new ArrayList<>();
        this.min = min;
        this.max = max;
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
	
}
