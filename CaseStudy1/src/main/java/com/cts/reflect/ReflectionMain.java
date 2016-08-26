package com.cts.reflect;

import java.lang.reflect.Field;

public class ReflectionMain {
	public static void main(String[] args) {
		try {
			Class cls = Class.forName("com.cts.reflect.reflection");
			Object obj = cls.newInstance();
			Field[] fields = cls.getDeclaredFields();
			for (int i = 0; i < fields.length; i++) {
				fields[i].setAccessible(true);
				System.out.println("Field Name-->" + fields[i].getName() + "\t" + "Field Type-->"
						+ fields[i].getType().getName() + "\t" + "Field Value-->" + fields[i].get(obj));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
