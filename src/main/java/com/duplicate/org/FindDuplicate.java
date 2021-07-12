package com.duplicate.org;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FindDuplicate {

	public void duplicate(String dup) {
		
		Map<Character, String> m= new HashMap<Character, String>();
		
		char[] charArray = dup.toCharArray();
		
		for (Character c : charArray) {
			
			if (m.containsKey(c)) {
				m.put(c, m.get(c)+1);
				
			}
			else {
				m.put(c, 1);
				
			}
			
		}
			
		}
		
		
		}
			
		


