package com.ck.unable.to.solve;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class ExistingMapToRangeMapCount {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("1000", 1);
		map.put("1050", 3);
		map.put("1460", 6);
		map.put("2000", 4);
		map.put("2040", 1);
		map.put("2400", 3);

		HashMap<String, Integer> outputMap = new HashMap<>();
		
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			String effectiveKey = getEffectiveKey(entry.getKey());
			if(outputMap.get(effectiveKey)==null){
				outputMap.put(effectiveKey, map.get(entry.getKey()));
			}else{
				//Splitted for better readability
				int valOne=map.get(entry.getKey());
				int valTwo=outputMap.get(effectiveKey);
				outputMap.put(effectiveKey, valOne+valTwo);
			}
		}
		Set<Entry<String, Integer>> outputEntrySet = outputMap.entrySet();
		for (Entry<String, Integer> entry : outputEntrySet) {
			System.out.println(entry.getKey()+"---"+entry.getValue());
		}
	}
	public static String getEffectiveKey(String actualKey){
		char[] actualKeyCharArray = actualKey.toCharArray();
		for (int i = 1; i < actualKeyCharArray.length; i++) {
			actualKeyCharArray[i]='0';
		}
		return String.valueOf(actualKeyCharArray);
	}
}
