import java.util.ArrayList;
import java.util.Scanner;

public class StudentNameOrderByNameAnotherWay {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int classes = sc.nextInt();
		while (classes-- > 0) {
			int studentNames = sc.nextInt();
			ArrayList<String> names = new ArrayList<>();
			while (studentNames-- > 0) {
				names.add(sc.next());
			}
			 names.stream().distinct()
					.sorted().forEach(System.out::println);
		}
		sc.close();
	}
}
