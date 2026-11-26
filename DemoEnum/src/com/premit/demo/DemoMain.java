package com.premit.demo;

public class DemoMain {
	public static void main(String[] args) {
		
		Day day = Day.SUNDAY;
		
		System.out.println("day:"+day);
		
		Day[] dayConstants = Day.values();
		
		System.out.println("==Day constants==");
		for(Day constant : dayConstants)
		{
			System.out.println(constant);
		}
		
		Day currentDay = Day.valueOf("SUNDAY");
		System.out.println("currentDay : "+currentDay);
		
		System.out.println("==ordinal()==");
		int indexOfSunday = Day.SUNDAY.ordinal();
		int indexOfMonday = Day.MONDAY.ordinal();
		int indexOfTuesday = Day.TUESDAY.ordinal();
		int indexOfWednesday = Day.WEDNESDAY.ordinal();
		int indexOfThursday = Day.THURSDAY.ordinal();
		int indexOfFriday = Day.FRIDAY.ordinal();
		int indexOfSaturday = Day.SATURDAY.ordinal();
		
		System.out.println("indexes");
		System.out.println("indexOfSunday:"+indexOfSunday);
		System.out.println("indexOfMonday:"+indexOfMonday);
		System.out.println("indexOfTuesday:"+indexOfTuesday);
		System.out.println("indexOfWednesday:"+indexOfWednesday);
		System.out.println("indexOfThursday:"+indexOfThursday);
		System.out.println("indexOfFriday:"+indexOfFriday);
		System.out.println("indexOfSaturday:"+indexOfSaturday);
		
		System.out.println("==name()==");
		String name = Day.MONDAY.name();
		System.out.println("name : "+name);
	}
}
