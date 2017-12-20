package br.com.gumga.api.metrics.additions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import br.com.gumga.api.metrics.Metric;

public class RequirementsMetric implements Metric{

	@Override
	public int count(String pwd) {

		int count = 0;
		
		if(pwd.length() >= 8){
			count++;
		}
		
		Pattern REGEX;
		Matcher matcher;
		
		REGEX = Pattern.compile("[A-Z]*");
		matcher = REGEX.matcher(pwd); 
		while (matcher.find()){
			count++;
			break;
        }
		
		REGEX = Pattern.compile("[a-z]+");
		matcher = REGEX.matcher(pwd); 
		while (matcher.find()){
            count++;
            break;
        }
		
		REGEX = Pattern.compile("[0-9]+");
		matcher = REGEX.matcher(pwd); 
		while (matcher.find()){
            count++;
            break;
        }
		
		REGEX = Pattern.compile("[^a-zA-Z0-9\\s]+");
		matcher = REGEX.matcher(pwd); 
		while (matcher.find()){
            count++;
            break;
        }
		
		return count;
	}

	@Override
	public int rate(int len, int n) {
		return +(n * 2);
	}

}
