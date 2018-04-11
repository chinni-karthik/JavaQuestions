package com.ck.lang;

public class PointEqualsExample {

	int x, y;

	public PointEqualsExample(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public boolean equals(Object o) {
		PointEqualsExample p = (PointEqualsExample) o;//you have taken clue here. Totally unexpected from you Karthik Chinni...!!!
		if (this.x == p.x && this.y == p.y) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		PointEqualsExample p1=new PointEqualsExample(10, 20);
		PointEqualsExample p2=new PointEqualsExample(10, 20);
		System.out.println(p1.equals(p2));
	}
}