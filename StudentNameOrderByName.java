import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
public class StudentNameOrderByName {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int classes = sc.nextInt();
        while (classes-- > 0) {
            int studentNames = sc.nextInt();

            ArrayList<String> names=new ArrayList<>();
            while (studentNames-- > 0) {
                names.add(sc.next());
            }
            names=(ArrayList<String>) names.stream().distinct().sorted().collect(Collectors.toList());
            for (String name : names) {
                System.out.println(name);
            }
        }
        sc.close();  
    }
}

