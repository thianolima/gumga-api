package br.com.gumga.api.metrics.additions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import br.com.gumga.api.metrics.Metric;

public class NumbersMetric implements Metric{

	private static final Pattern REGEX = Pattern.compile("[0-9]+");
	
	@Override
	public int count(String pwd) {
		Matcher matcher = REGEX.matcher(pwd);
	        
        int count = 0;
        while (matcher.find()){
            count += matcher.group().length();
        }
        
        return count;
	}

	@Override
	public int rate(int len, int n) {
		int ret = 0;
		
		if(n > 0){
			ret = +(n*4);
		}
		
		return ret;
	}

}
