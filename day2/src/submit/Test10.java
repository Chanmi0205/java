package submit;

public class Test10 {
	public static void main(String[] args) {
		
		for(int i=0; i<=6; i++ ) {
			for (int j=0; j<=6; j++) {
				if ( i == 0 || j == 0 || i == 6 || j == 6 ) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
