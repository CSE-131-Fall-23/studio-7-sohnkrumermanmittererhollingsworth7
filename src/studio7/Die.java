package studio7;

public class Die {
	private int sides;
	
	public Die (int sides) {
		this.sides = sides;

	}
	public int rollVal() {
	
	int value  =(int)(Math.random()*sides + 1);
	return value;
	}

	public static void main(String[] args) {
		Die D1 = new Die(6);
		System.out.println(D1.rollVal());
		

	}

}
