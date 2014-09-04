import java.util.Scanner;


public class TriangleArea {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int ax=scan.nextInt();
		int ay=scan.nextInt();
		scan.nextLine();
		int bx=scan.nextInt();
		int by=scan.nextInt();
		scan.nextLine();
		int cx=scan.nextInt();
		int cy=scan.nextInt();
		int area=Math.abs((ax*(by-cy)+bx*(cy-ay)+cx*(ay-by))/2);
		System.out.println(area);

	}

}
