package br.com.gumga.api.helpers;

import br.com.gumga.api.enums.TypeChar;

public class UtilsHelper {
	
	public static TypeChar getTypeChar(char x){
		
		int unicode = (int)x;
		
		if((unicode >= 65) && (unicode <= 90)){
			return TypeChar.UPPER_CHAR;
		
		} else if((unicode >= 97) && (unicode <= 122)){
			return TypeChar.LOWER_CHAR;
		
		}else if((unicode >= 48) && (unicode <= 57)){
			return TypeChar.NUMBER_CHAR;
		
		}else if(((unicode >= 33) && (unicode <= 47)) || 
		         ((unicode >= 58) && (unicode <= 64)) ||
		         ((unicode >= 91) && (unicode <= 96)) ||
		         ((unicode >= 123) && (unicode <= 126))){
			
			return TypeChar.SYMBOL_CHAR;
		
		} else{
			return null;
		}
	}
}
