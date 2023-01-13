import java.util.Scanner;
public class Main {
	public static void main(String[] args)

	{

	Scanner scan=new Scanner(System.in);

	System.out.println("Enter a number");

	int N =scan.nextInt();

	int x, y, flg;

	System.out.println("All the Prime numbers from 1 to " + N+ " are:");

	for (x = 1; x <= N; x++) {

	if (x == 1 || x == 0)

	continue;

	flg = 1;

	for (y = 2; y <= x / 2; ++y) {

	if (x % y == 0) {

	flg = 0;

	break;

	}

	}

	if (flg == 1)

	System.out.print(x + " ");

	}

	}
}
