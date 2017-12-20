package br.com.gumga.api.metrics.deductions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import br.com.gumga.api.metrics.Metric;

public class LettersOnlyMetric implements Metric {

	private static final Pattern REGEX = Pattern.compile("[^a-zA-Z\\s]*");

	@Override
	public int count(String pwd) {		
		Matcher matcher = REGEX.matcher(pwd); 
		
        int count = 0;
        while (matcher.find()){
            count += matcher.group().length();
        }
        
        return (count > 0) ? 0 : pwd.length();
	}

	@Override
	public int rate(int len, int n) {		
        return -n;
	}
}
