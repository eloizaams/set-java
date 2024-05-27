package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> alex = new ArrayList<>(Arrays.asList("A", "B", "C"));
		Set<Integer> studentNumbers = new HashSet<Integer>();
		try {
			for (String alexCourse: alex) {
				System.out.print("How many students for course " + alexCourse +": ");
				int totalStudents = sc.nextInt();
				for (int i = 0; i < totalStudents; i++) {
					int studentNumber = sc.nextInt();
					studentNumbers.add(studentNumber);
				}
			}
			System.out.print("Total studentes: ");
			System.out.println(studentNumbers.size());
			
		}
		catch (InputMismatchException e){
			System.out.println("Invalid number! Please restart the program.");
		}
		finally {
			sc.close();
		}
	}
}
