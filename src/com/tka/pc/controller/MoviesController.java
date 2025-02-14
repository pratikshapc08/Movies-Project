package com.tka.pc.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.tka.pc.entity.MovieCast;
import com.tka.pc.service.MoviesService;

public class MoviesController {
		static Map<Integer,Map<String,List<MovieCast>>>movieMap=new HashMap<Integer,Map<String,List<MovieCast>>>();
		private MoviesService ms=new MoviesService();
		
		//add Movies
		public void addMovieController(Scanner sc) {
			ms.addMovieService(sc);
			
		}
		//remove movies
		public void removeMovieController(Scanner sc) {
			ms.removeMovieService(sc);
			
		}
		//get cast of movie
		public  List<String>getMovieCastController(Scanner sc){
			List<String>l1 = ms.getMovieCastService(sc);
			return l1;
		}
		//Total movies of cast
		public List<String>totalmoviesofcastController(Scanner sc){
			List<String>l2 = ms.totalmoviesofcastService(sc);
			return l2;
		}
		//all movies of specific year
		public Set<String>getMoviesofyearController(Scanner sc){
			Set<String>s1=ms.getMoviesofyearService(sc);
			return s1;
			
		}
		//all movies from database
		public Set<String>allMoviesofAllYearsController(){
			Set<String>s2=ms.allMoviesofAllYearsService();
			return s2;
		}
		//information about cast
		public MovieCast infoAboutCastController(Scanner sc) {
			MovieCast ab=ms.infoAboutCastService(sc);
			return ab;
		}
}
		