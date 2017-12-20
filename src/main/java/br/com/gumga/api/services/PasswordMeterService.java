package br.com.gumga.api.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.gumga.api.enums.Complexity;
import br.com.gumga.api.metrics.Metric;import br.com.gumga.api.models.PasswordMeter;

@Service
public class PasswordMeterService {

	@Autowired
	List<Metric> metrics;
	
	public PasswordMeter validate(String pwd){										
		//Calculating Complexity
		int score = 0;
		int len = pwd.length();
		for(Metric metric : metrics){
			int count = metric.count(pwd);
			int rate = metric.rate(len, count);
			score+= rate;
		}
		
		//this control I copied of javascript of page
		if(score > 100){
			score = 100;
		} else if(score < 0){
			score = 0;
		}
		
		Complexity complexity = null;		
		if (score >= 0 && score < 20){ 
			complexity = Complexity.VERY_WEEK;   
		
		} else if (score >= 20 && score < 40) { 
			complexity = Complexity.WEAK;        
		
		}else if (score >= 40 && score < 60) { 
			complexity = Complexity.GOOD;        
		
		} else if (score >= 60 && score < 80) { 
			complexity = Complexity.STRONG;      
		
		} else if (score >= 80 && score <= 100) { 
			complexity = Complexity.VERY_STRONG; 
		} 
		
		PasswordMeter pm = new PasswordMeter(score, complexity);		
		
		return pm;
	}
	
}
