package google;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int n = 4; // Midpoint (rows for increasing stars)

	        // First part: increasing stars
	        for (int i = 1; i <= n; i++) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print("* ");
	            }
	            System.out.println();
	        }

	        // Second part: decreasing stars
	        for (int i = n - 1; i >= 1; i--) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print("* ");
	            }
	            System.out.println();
	        }
		
		
		
		
		
	}

}
