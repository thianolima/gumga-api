package br.com.gumga.api.metrics.deductions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import br.com.gumga.api.metrics.Metric;

public class ConsecutiveLowercaseLettersMetric implements Metric{

    private static final Pattern REGEX = Pattern.compile("[a-z]{2,}");
	
	@Override
	public int count(String pwd) {
        Matcher matcher = REGEX.matcher(pwd.replaceAll("\\s", ""));
        
        int count = 0;
        while (matcher.find()){
            count += (matcher.group().length() - 1);
        }
        
        return count;
	}

	@Override
	public int rate(int len, int n) {
		int ret = 0;
				
		if(n > 0){
			ret= -(n*2);
		}
		
		return ret;
	}

}
