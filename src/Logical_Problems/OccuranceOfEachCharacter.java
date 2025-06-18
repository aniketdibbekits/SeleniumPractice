package Logical_Problems;

import java.util.Map;

import org.apache.commons.collections4.map.HashedMap;

public class OccuranceOfEachCharacter {
	public static void main(String[] args) {
		String str = "hello";
		char[] arr = str.toCharArray();
		
		Map<Character,Integer> map=new HashedMap();
		for(char ch:arr)
		{
			if(!map.containsKey(ch))
			{
				map.put(ch, 1);
			}
			else {
				int value = map.get(ch);
				map.put(ch, value+1);
			}
		}
		System.out.println(map);
	}

}
