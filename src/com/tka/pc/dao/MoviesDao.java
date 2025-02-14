package com.tka.pc.dao;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.tka.pc.entity.MovieCast;

public class MoviesDao {
	public Map<Integer, Map<String, List<MovieCast>>> getAllMoviesDao() {
		Map<Integer, Map<String, List<MovieCast>>> allMovies = new LinkedHashMap<Integer, Map<String, List<MovieCast>>>();

		// 2023
		Map<String, List<MovieCast>> Movies2023 = new TreeMap<String, List<MovieCast>>();

		List<MovieCast> JawanCast = new ArrayList<MovieCast>();
		JawanCast.add(new MovieCast("Shah Rukh khan", "Male", 58));
		JawanCast.add(new MovieCast("Nayanthara", "Female", 39));
		JawanCast.add(new MovieCast("Vijay Setupathi", "Male", 46));
		JawanCast.add(new MovieCast("Deepika Padukone", "Female", 38));
		JawanCast.add(new MovieCast("Saniya Malhotra", "Female", 32));
		JawanCast.add(new MovieCast("Sanjay Dutt", "Male", 64));

		Movies2023.put("Jawan", JawanCast);

		List<MovieCast> PathanCast = new ArrayList<MovieCast>();
		PathanCast.add(new MovieCast("Shah Rukh khan", "Male", 58));
		PathanCast.add(new MovieCast("Salman khan", "Male", 45));
		PathanCast.add(new MovieCast("Jhon Abrahm", "Male", 51));
		PathanCast.add(new MovieCast("Deepika Padukone", "Female", 38));
		PathanCast.add(new MovieCast("Ashutosh Rana", "Male", 58));
		PathanCast.add(new MovieCast("Shah Rukh khan", "Male", 56));
		Movies2023.put("Pathan", PathanCast);

		List<MovieCast> AnimalCast = new ArrayList<MovieCast>();
		AnimalCast.add(new MovieCast("Ranbir Kapur", "Male", 41));
		AnimalCast.add(new MovieCast("Rashmika Maddana", "Female", 28));
		AnimalCast.add(new MovieCast("Tripti Dimri", "Female", 30));
		AnimalCast.add(new MovieCast("Anil Kapoor", "Male", 67));
		AnimalCast.add(new MovieCast("Bobby Deol", "Male", 55));
		Movies2023.put("Animal", AnimalCast);

		List<MovieCast> Gadar2Cast = new ArrayList<MovieCast>();
		Gadar2Cast.add(new MovieCast("Sunny Deol", "Male", 51));
		Gadar2Cast.add(new MovieCast("Ameesha Patel", "Female", 48));
		Gadar2Cast.add(new MovieCast("Utkarsh Sharma", "Male", 29));
		Gadar2Cast.add(new MovieCast("Simrat Kaur", "Female", 30));
		Gadar2Cast.add(new MovieCast("Manish wadhwa", "Male", 51));
		Movies2023.put("Gadar2", Gadar2Cast);

		List<MovieCast> LeoCast = new ArrayList<MovieCast>();
		LeoCast.add(new MovieCast("Vijay", "Male", 49));
		LeoCast.add(new MovieCast("Trisha Krishanan", "Female", 41));
		LeoCast.add(new MovieCast("Sanjay Dutt", "Male", 64));
		LeoCast.add(new MovieCast("Arjun Sarja", "Male", 59));
		LeoCast.add(new MovieCast("Gutam Vasudev Menon", "Male", 50));

		Movies2023.put("Leo", LeoCast);

		allMovies.put(2023, Movies2023);

		// 2022
		Map<String, List<MovieCast>> Movies2022 = new TreeMap<String, List<MovieCast>>();
		List<MovieCast> BramhastraCast = new ArrayList<MovieCast>();
		BramhastraCast.add(new MovieCast("Ranbir Kapur", "Male", 41));
		BramhastraCast.add(new MovieCast("Alia Bhatt", "Female", 30));
		BramhastraCast.add(new MovieCast("Amitabh Bachchan", "Male", 81));
		BramhastraCast.add(new MovieCast("Nagarjuna Akkineni", "Male", 64));
		BramhastraCast.add(new MovieCast("Mouni Roy", "Female", 38));
		Movies2022.put("Bramhastra", BramhastraCast);

		List<MovieCast> TheKashmirFilesCast = new ArrayList<MovieCast>();
		TheKashmirFilesCast.add(new MovieCast("Anupam Kher", "Male", 69));
		TheKashmirFilesCast.add(new MovieCast("Mithun Chakraborty", "Male", 73));
		TheKashmirFilesCast.add(new MovieCast("Pallavi Joshi", "FemMale", 54));
		TheKashmirFilesCast.add(new MovieCast("Darshan Kumar", "Male", 37));
		TheKashmirFilesCast.add(new MovieCast("Chinmay Mandlekar", "Male", 51));
		Movies2022.put("The Kashmir Files", TheKashmirFilesCast);

		List<MovieCast> BhoolBhulaiya2Cast = new ArrayList<MovieCast>();
		BhoolBhulaiya2Cast.add(new MovieCast("Kartik Aryan", "Male", 33));
		BhoolBhulaiya2Cast.add(new MovieCast("Kiara Advani", "Female", 32));
		BhoolBhulaiya2Cast.add(new MovieCast("Tabu", "Female", 52));
		BhoolBhulaiya2Cast.add(new MovieCast("Rajpal Yadav", "Male", 52));
		BhoolBhulaiya2Cast.add(new MovieCast("sanjay Mishra", "Male", 60));
		Movies2022.put("BhoolBhulaiya2", BhoolBhulaiya2Cast);

		List<MovieCast> Drishyam2Cast = new ArrayList<MovieCast>();
		Drishyam2Cast.add(new MovieCast("Ajay Devgan", "Male", 55));
		Drishyam2Cast.add(new MovieCast("Shriya Saran", "Female", 41));
		Drishyam2Cast.add(new MovieCast("Tabu", "Female", 52));
		Drishyam2Cast.add(new MovieCast("Akshay Khanna", "Male", 48));
		Drishyam2Cast.add(new MovieCast("Ishita Dutta", "Female", 33));
		Movies2022.put("Drishyam2", Drishyam2Cast);
		allMovies.put(2022, Movies2022);

		// 2021
		Map<String, List<MovieCast>> Movies2021 = new TreeMap<String, List<MovieCast>>();
		List<MovieCast> SooryavanshiCast = new ArrayList<MovieCast>();
		SooryavanshiCast.add(new MovieCast("Akashay Kumar", "Male", 56));
		SooryavanshiCast.add(new MovieCast("Katrina Kaif", "Female", 40));
		SooryavanshiCast.add(new MovieCast("Ajay Devgan", "Male", 55));
		SooryavanshiCast.add(new MovieCast("Ranveer Singh", "Male", 39));
		SooryavanshiCast.add(new MovieCast("Jackie Shroff", "Male", 66));
		Movies2021.put("Sooryavanshi", SooryavanshiCast);

		List<MovieCast> ShershaahCast = new ArrayList<MovieCast>();
		ShershaahCast.add(new MovieCast("Siddhart Malhotra", "Male", 39));
		ShershaahCast.add(new MovieCast("kiara Advani ", "Female", 32));
		ShershaahCast.add(new MovieCast("Shiv Pandit", "Male", 39));
		ShershaahCast.add(new MovieCast("Nikitin Dheer", "Male", 43));
		ShershaahCast.add(new MovieCast("Sahil Vaid", "Male", 36));
		Movies2021.put("Shershaah", ShershaahCast);
		allMovies.put(2021, Movies2021);

		// 2020
		Map<String, List<MovieCast>> Movies2020 = new TreeMap<String, List<MovieCast>>();
		List<MovieCast> TanhajiCast = new ArrayList<MovieCast>();
		TanhajiCast.add(new MovieCast("Ajay Devgan", "Male", 55));
		TanhajiCast.add(new MovieCast("Saif Ali Khan", "Male", 53));
		TanhajiCast.add(new MovieCast("Kajol", "Female", 49));
		TanhajiCast.add(new MovieCast("Sharad Kelkar", "Male", 46));
		TanhajiCast.add(new MovieCast("Luke Kenny", "Male", 53));
		Movies2020.put("Tanhaji", TanhajiCast);

		List<MovieCast> LaxmiiCast = new ArrayList<MovieCast>();
		LaxmiiCast.add(new MovieCast("Akshay Kumar", "Male", 56));
		LaxmiiCast.add(new MovieCast("Kiara Advani", "Female", 32));
		LaxmiiCast.add(new MovieCast("Sharad Kelkar", "Male", 46));
		LaxmiiCast.add(new MovieCast("Ahwini Kalsekar", "Female", 53));
		LaxmiiCast.add(new MovieCast("Ayesha Raza Mishra", "Female", 45));
		Movies2020.put("Laxmii", LaxmiiCast);

		List<MovieCast> GunjanSaxenaCast = new ArrayList<MovieCast>();
		GunjanSaxenaCast.add(new MovieCast("Janhvi Kapoor", "Female", 26));
		GunjanSaxenaCast.add(new MovieCast("Pankaj TRipathi", "Male", 45));
		GunjanSaxenaCast.add(new MovieCast("Ayesha Raza Mishrra", "Female", 46));
		GunjanSaxenaCast.add(new MovieCast("Manav Vij", "Male", 32));
		Movies2020.put("GunjanSaxena", GunjanSaxenaCast);

//2019
		Map<String, List<MovieCast>> Movies2019 = new TreeMap<String, List<MovieCast>>();

		List<MovieCast> WarCast = new ArrayList<MovieCast>();
		WarCast.add(new MovieCast("Hrithik Roshan", "Male", 49));
		WarCast.add(new MovieCast("Tiger Shroff", "Male", 33));
		WarCast.add(new MovieCast("Vanni Kapoor", "Female", 36));
		WarCast.add(new MovieCast("Ashutosh Rana", "Male", 55));
		WarCast.add(new MovieCast("Anupriya", "Female", 36));
		Movies2019.put("War", WarCast);

		List<MovieCast> KabirSinghCast = new ArrayList<MovieCast>();
		KabirSinghCast.add(new MovieCast("Sahid Kapur", "Male", 42));
		KabirSinghCast.add(new MovieCast("Kiara Advani", "Female", 32));
		KabirSinghCast.add(new MovieCast("Soham Mujumadar", "Male", 31));
		KabirSinghCast.add(new MovieCast("Arjun Bajwa", "Male", 44));
		Movies2019.put("KabirSingh", KabirSinghCast);

		List<MovieCast> GullyBoysCast = new ArrayList<MovieCast>();
		GullyBoysCast.add(new MovieCast("Ranveer Singh", "Male", 39));
		GullyBoysCast.add(new MovieCast("Alia BHutt", "Female", 30));
		GullyBoysCast.add(new MovieCast("Siddhant Chaturvedi", "Male", 30));
		GullyBoysCast.add(new MovieCast("Klaki Koechlin", "Female", 39));
		GullyBoysCast.add(new MovieCast("Vijay Raaz", "Male", 42));
		Movies2019.put("GullyBoys", GullyBoysCast);

		List<MovieCast> ChhichhoreCast = new ArrayList<MovieCast>();
		ChhichhoreCast.add(new MovieCast("Sushant Singh Rajput", "Male", 34));
		ChhichhoreCast.add(new MovieCast("Shraddha Kapur", "Female", 36));
		ChhichhoreCast.add(new MovieCast("Varun Sharma", "Male", 33));
		ChhichhoreCast.add(new MovieCast("Pratiek Babar", "Male", 37));
		Movies2019.put("Chhichhore", ChhichhoreCast);
		allMovies.put(2019, Movies2019);

		return allMovies;

	}
}
