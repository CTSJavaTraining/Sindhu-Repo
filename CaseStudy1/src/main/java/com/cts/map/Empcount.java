package com.cts.map;

import java.util.HashMap;
import java.util.Scanner;

public class Empcount {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		char ch;
		for (int i = 0; i < s.length(); i++) {
			ch = s.charAt(i);
			if (hm.containsKey(ch)) {
				hm.put(ch, hm.get(ch) + 1);
			} else {
				hm.put(ch, 1);
			}

		}

		System.out.println(hm);
	}
}