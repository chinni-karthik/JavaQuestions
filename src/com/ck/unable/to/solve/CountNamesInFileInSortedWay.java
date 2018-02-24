package com.ck.unable.to.solve;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class CountNamesInFileInSortedWay {
	public static void main(String[] args) throws IOException {
		HashMap<String, Integer> map 	= new HashMap<>();
		BufferedReader br 				= new BufferedReader(new FileReader("D:\\input.txt"));
		String str 						= "";
		
		while ((str = br.readLine()) != null) {
			if (map.get(str) != null) {
				map.put(str, map.get(str) + 1);
			} else {
				map.put(str, 1);
			}
		}
		Set<Entry<String, Integer>> entrySet 		= map.entrySet();// We cannot sort
		ArrayList<Entry<String, Integer>> entryList = new ArrayList<>(entrySet);// Hence,we are making set as list.
		
		Collections.sort(entryList, new MyEntrySetComparator());
		PrintWriter pw = new PrintWriter("output.txt");

		for (Entry<String, Integer> entry : entryList) {
			pw.println(entry.getKey() + "---" + entry.getValue());
		}
		pw.flush();
		br.close();
		pw.close();
	}
}

class MyEntrySetComparator implements Comparator<Entry<String, Integer>> {
	@Override
	public int compare(Entry<String, Integer> entry1, Entry<String, Integer> entry2) {
		return entry1.getValue().compareTo(entry2.getValue());
	}
}
