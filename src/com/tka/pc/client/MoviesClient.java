package com.tka.pc.client;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.tka.pc.controller.MoviesController;
import com.tka.pc.entity.MovieCast;

public class MoviesClient {
	public static void main(String[] args) {
		MoviesController mc = new MoviesController();
		Scanner sc = new Scanner(System.in);

		int choice;
		do {
			System.out.println("        Welcome to Our Website           ");
			System.out.println();
			System.out.println("        Movies Management System          ");
			System.out.println();
			System.out.println("1. Add Movies");
			System.out.println("2. Remove Movies");
			System.out.println("3. Get cast for movie");
			System.out.println("4. View Information of actors");
			System.out.println("5. View All movies of specific actor");
			System.out.println("6. View of All movies for a specific year");

			System.out.println("7. View of all movies  in the databse");
			System.out.println("8. Exit ");
			System.out.println(" Enter your choice;");

			choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {
			case 1:
				mc.addMovieController(sc);
				System.out.println();
				break;
			case 2:
				mc.removeMovieController(sc);
				System.out.println();
				break;
			case 3:
				List<String> l1 = mc.getMovieCastController(sc);
				System.out.println(l1);
				System.out.println();
				break;
			case 4:
				MovieCast ab = mc.infoAboutCastController(sc);
				System.out.println(ab);
				System.out.println();
				break;
			case 5:
				List<String> l2 = mc.totalmoviesofcastController(sc);
				System.out.println(l2);
				System.out.println();
				break;
			case 6:
				Set<String> s1 = mc.getMoviesofyearController(sc);
				System.out.println(s1);
				System.out.println();
				break;
			case 7:
				Set<String> s2 = mc.allMoviesofAllYearsController();
				System.out.println(s2);
				System.out.println();
				return;

			case 8:
				System.out.println("Thank you for visiting our site");
				System.out.println();
				return;
			default:
				System.out.println("Invalid Choice .Try Again");

			}
			if (choice == 8) {
				break;

			}
		} while (true);
	}
}
