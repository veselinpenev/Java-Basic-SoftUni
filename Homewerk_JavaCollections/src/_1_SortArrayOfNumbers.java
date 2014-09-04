import java.util.Arrays;
import java.util.Scanner;


public class _1_SortArrayOfNumbers {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int test=scan.nextInt();
		scan.nextLine();
		int[] numbers=new int[test];
		for (int i = 0; i < test; i++) {
			numbers[i]=scan.nextInt();
		}
		Arrays.sort(numbers);
		for (int number : numbers) {
			System.out.print(number +" ");
		}

	}

}
