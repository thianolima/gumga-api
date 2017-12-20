package br.com.gumga.api.metrics.deductions;

import java.util.Map;
import java.util.TreeMap;

import br.com.gumga.api.metrics.Metric;

public final class RepeatCharactersMetric implements Metric{

	@Override
	public int count(String pwd) {

		Map mapConsecutives = new TreeMap<String, Integer>();
		int count = 0;
		
		for(int idx = 0; idx < pwd.length(); idx++){
			
			char letterIDX = pwd.charAt(idx);			
			if(mapConsecutives.containsKey(letterIDX)){
				String aux = mapConsecutives.get(letterIDX).toString();
				
				//Enable this two lines for easyli the debug
				//mapConsecutives.remove(letterIDX);
				//mapConsecutives.put(letterIDX, Integer.parseInt(aux) + 1);		
				
				//In the first time the dafault value always will be him more two
				if(Integer.parseInt(aux) == 1){
					count+= 2;
					
				//Other time only sum with more one
				}else{
					count++;
				}
				
			}else{
				mapConsecutives.put(letterIDX, 1);
			}						
		}
		
		return count;

	}

	@Override
	public int rate(int len, int n) {		
		return -n;
	}

	
}
