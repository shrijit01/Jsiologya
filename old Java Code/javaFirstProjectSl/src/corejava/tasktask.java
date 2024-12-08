package corejava;

public class tasktask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r=Integer.parseInt(args[0]);
		float pi=Integer.parseInt(args[1]);
		tasktask.AreaOfCircle(r,pi);
	}

	private static void AreaOfCircle(int r, float pi) {
		Float Area=pi*r*r;
		System.out.println("Area Of Circle:"+Area);
	}

	}

}
