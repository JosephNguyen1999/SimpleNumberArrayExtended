/*
 * Stat.java
 * Author:  Joseph Nguyen 
 * Submission Date:  4/17/2020
 *
 * Purpose: The purpose of this program is to make a stat class with methods and constructors that create and store an array
 * and find out certain aspects of the array.
 *
 * Statement of Academic Honesty:
 *
 * The following code represents my own work. I have neither
 * received nor given inappropriate assistance. I have not copied
 * or modified code from any source other than the course webpage
 * or the course textbook. I recognize that any unauthorized
 * assistance or plagiarism will be handled in accordance with
 * the University of Georgia's Academic Honesty Policy and the
 * policies of this course. I recognize that my work is based
 * on an assignment created by the Department of Computer
 * Science at the University of Georgia. Any publishing 
 * or posting of source code for this assignment is strictly
 * prohibited unless you have written consent from the Department
 * of Computer Science at the University of Georgia.  
 */

public class Stat {

	private double[] data;

	//creates double array of 0.0
	public Stat () {
		data = new double[0];
	}

	//creates a new double array of d and assigns data to the new array
	public Stat(double[] d) {
		if (d == null) {
			data = new double[0];
		}
		else {
			double[] newArray = new double[d.length];
			for (int i = 0; i < d.length; i++) {
				newArray[i] = d[i];
			}
			data = newArray;
		}
	}

	//creates a new array based on f and assigns data to the new array
	public Stat(float[] f) {
		if (f == null) {
			data = new double[0];
		}
		else {
			double[] newArray = new double[f.length];
			for (int i = 0; i < f.length; i++) {
				newArray[i] = f[i];
			}
			data = newArray;
		}
	}

	//creates a new array based on i and assigns data to the new array
	public Stat(int[] i) {
		if (i == null) {
			data = new double[0];
		}
		else {
			double[] newArray = new double[i.length];
			for (int z = 0; z < i.length; z++) {
				newArray[z] = i[z];
			}
			data = newArray;
		}
	}

	//creates a new array based on lo and assigns data to the new array
	public Stat(long[] lo) {
		if (lo == null) {
			data = new double[0];
		}
		else {
			double[] newArray = new double[lo.length];
			for (int i = 0; i < lo.length; i++) {
				newArray[i] = lo[i];
			}
			data = newArray;
		}
	}

	//creates new array based on f and assigns data to the new array
	public void setData(float[] f) {
		if (f == null) {
			data = new double[0];
		}
		else {
			double[] newArray = new double[f.length];
			for (int i = 0; i < f.length; i++) {
				newArray[i] = f[i];
			}
			double[] newD = newArray;
			data = newD;
		}
	}

	//creates new array based on d and assigns data to the new array
	public void setData(double[] d) {
		if (d == null) {
			data = new double[0];
		}
		else {
			double[] newD = d;
			data = newD;
		}
	}

	//creates new array based on i and assigns data to the new array
	public void setData(int[] i) {
		if (i == null) {
			data = new double[0];
		}
		else {
			double[] newArray = new double[i.length];
			for (int z = 0; z < i.length; z++) {
				newArray[z] = i[z];
			}
			double[] newD = newArray;
			data = newD;
		}
	}

	//creates new array based on lo and assigns data to the new array
	public void setData(long[] lo) {
		if (lo == null) {
			data = new double[0];
		}
		else {
			double[] newArray = new double[lo.length];
			for (int i = 0; i < lo.length; i++) {
				newArray[i] = lo[i];
			}
			double[] newD = newArray;
			data = newD;
		}
	}

	//creates a new array equal to data and returns the new array
	public double[] getData() {
		double[] newArray = new double[data.length];
		for (int i = 0; i < data.length; i++) {
			newArray[i] = data[i];
		}
		return newArray;
	}

	//sees if both arrays have the same values in the same order or not
	public boolean equals(Stat s) {
		if (s == null) {
			return false;
		}
		else if (s.data.length == 0) {
			if (data.length == 0) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			for(int i = 0; i < data.length; i++) {
				if (data[i] != s.data[i])
					return false;
			}
			return true;
		}
	}

	//resets the data array to empty
	public void reset() {
		double[] newArray = new double[0];
		data = newArray;
	}

	//adds onto the current data array
	public void append (int[] i) {
		if (i == null) {
		}
		else {
			int j = 0;
			int k = 0;
			double[] newArray = new double[data.length + i.length];
			for (int z = 0; z < data.length + i.length; z++) {
				if (z > data.length - 1) {
					newArray[z] = i[j];
					j++;
				}
				else {
					newArray[z] = data[k];
					k++;
				}
			}
			data = newArray;
		}
	}

	//adds onto the current data array
	public void append (float[] f) {
		if (f == null) {
		}
		else {
			int j = 0;
			int i = 0;
			double[] newArray = new double[data.length + f.length];
			for (int z = 0; z < data.length + f.length; z++) {
				if (z > data.length - 1) {
					newArray[z] = f[j];
					j++;
				}
				else {
					newArray[z] = data[i];
					i++;
				}
			}
			data = newArray;
		}
	}

	//adds onto the current data array
	public void append (long[] lo) {
		if (lo == null) {
		}
		else {
			int j = 0;
			int i = 0;
			double[] newArray = new double[data.length + lo.length];
			for (int z = 0; z < data.length + lo.length; z++) {
				if (z > data.length - 1) {
					newArray[z] = lo[j];
					j++;
				}
				else {
					newArray[z] = data[i];
					i++;
				}
			}
			data = newArray;
		}
	}

	//adds onto the current data array
	public void append (double[] d) {
		if (d == null) {
		}
		else {
			int j = 0;
			int i = 0;
			double[] newArray = new double[data.length + d.length];
			for (int z = 0; z < data.length + d.length; z++) {
				if (z > data.length - 1) {
					newArray[z] = d[j];
					j++;
				}
				else {
					newArray[z] = data[i];
					i++;
				}
			}
			data = newArray;
		}
	}

	//checks to see if the data array is empty or not
	public boolean isEmpty() {
		if (data.length == 0) {
			return true;
		}
		else {
			return false;
		}
	}

	//returns the array in String form
	public String toString() {
		String toString;
		toString = "[";
		for(int i = 0; i < data.length; i++) {
			toString += data[i];
			if (!(i == data.length - 1)) {
				toString += ", ";
			}
		}
		toString += "]";
		return toString;
	}

	//returns the minimum value in the array
	public double min() {
		if (data.length == 0) {
			return Double.NaN;
		}
		double min = data[0];
		for(int i = 1; i < data.length; i++) {
			if(data[i] < min) {
				min = data[i];
			}
		}
		return min;
	}

	//returns the maximum value in the array
	public double max() {
		if (data.length == 0) {
			return Double.NaN;
		}
		double max = data[0];
		for(int i = 1; i < data.length; i++) {
			if(data[i] > max) {
				max = data[i];
			}
		}
		return max;
	}

	//returns the average of the array
	public double average() {
		if (data.length == 0) {
			return Double.NaN;
		}
		double sum = 0;
		double average = 0;
		for (double value : data) {
			sum += value;
		}
		if (data.length != 0) {
			average = sum / data.length;
		}
		return average;
	}

	//returns the mode of the array (most frequent number if any)
	public double mode() {
		if (data.length == 0) {
			return Double.NaN;
		}
		double mode1 = 0;
		int numberOfTimes1 = 1;
		double mode2 = 0;
		int numberOfTimes2 = 1;
		for (int i = 0; i < data.length; i++) {
			mode1 = data[i];
			numberOfTimes1 = 1;
			if (data.length == 1) {
				return mode1;
			}
			for (int a = i + 1; a < data.length; a++) {
				if (mode1 == data[a]) {
					numberOfTimes1++;
				}
			}
			if (numberOfTimes1 > numberOfTimes2) {
				mode2 = mode1;
				numberOfTimes2 = numberOfTimes1;
			}
			else if (numberOfTimes1 == numberOfTimes2) {
				mode2 = Double.NaN;
			}
		}
		return mode2;
	}

	//returns the variance of the array
	public double variance() {
		if (data.length == 0) {
			return Double.NaN;
		}
		double mean = 0;
		for (int i = 0; i < data.length; i++) {
			mean += data[i];
		}
		double actualMean = mean / data.length;
		double[] newArray = new double[data.length];
		for (int i = 0; i < data.length; i++) {
			newArray[i] = data[i] - actualMean;
		}
		double[] newArray1 = new double[data.length];
		for (int i = 0; i < data.length; i++) {
			newArray1[i] = Math.pow(newArray[i], 2);
		}
		double sum = 0;
		for (int i = 0; i < data.length; i++) {
			sum += newArray1[i];
		}
		double variance = sum / data.length;
		return variance;
	}

	//returns the standard deviation of the array
	public double standardDeviation() {
		if (data.length == 0) {
			return Double.NaN;
		}
		double standardDeviation = Math.sqrt(variance());
		return standardDeviation;
	}


}
