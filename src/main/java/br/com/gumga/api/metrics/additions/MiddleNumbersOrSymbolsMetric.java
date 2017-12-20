package br.com.gumga.api.metrics.additions;

import br.com.gumga.api.enums.TypeChar;
import br.com.gumga.api.helpers.UtilsHelper;
import br.com.gumga.api.metrics.Metric;

public class MiddleNumbersOrSymbolsMetric implements Metric{

	private static final String REGEX = "[\\d]|[^a-zA-Z\\s]";
	
	@Override
	public int count(String pwd) {
		int count = 0;
        String p = pwd.replaceAll("\\s", "");
        int length = pwd.length();
        for (int i = 0; i < length; i++) {
            String c = p.substring(i, i + 1);
            boolean isMiddle = i > 0 && i < length - 1;
            if (c.matches(REGEX) && isMiddle)
                count++;
        }
        return count;
		
		/*
		int ret = 0;
		
		if(pwd.length() >= 3){			
			for(int idx = 1; idx < pwd.length()-1; idx++){									
				TypeChar letterTypeIDX    = UtilsHelper.getTypeChar(pwd.charAt(idx));
				TypeChar letterTypeBefore = UtilsHelper.getTypeChar(pwd.charAt(idx-1));
				TypeChar letterTypeAfter  = UtilsHelper.getTypeChar(pwd.charAt(idx+1));
				
				if ((letterTypeIDX != letterTypeBefore) && (letterTypeIDX != letterTypeAfter) && (letterTypeIDX == TypeChar.NUMBER_CHAR)){
					ret++;				
				}
				
				//I disagree with this, but i dont know other way for result to stay exactly wiht the site passwordmeter
				if(((letterTypeIDX == letterTypeBefore) || (letterTypeIDX == letterTypeAfter)) && (letterTypeIDX == TypeChar.NUMBER_CHAR)){
					ret++;
				}
			}
		
			//This condition is equal the before, I need insert into code for fixed
			//if((UtilsHelper.getTypeChar(pwd.charAt(pwd.length()-1)) == TypeChar.NUMBER_CHAR) && 
			//   (UtilsHelper.getTypeChar(pwd.charAt(pwd.length()-2)) == TypeChar.NUMBER_CHAR) &&
			//   (UtilsHelper.getTypeChar(pwd.charAt(pwd.length()-3)) == TypeChar.NUMBER_CHAR)){
			//	ret++;
			//}
			 
		}
						
		return ret;
		 */
		
	}

	@Override
	public int rate(int len, int n) {
		int ret = 0;
		
		if(n > 0){
			ret = +(n*2);
		}
		
		return ret;
	}

}
