package com.mtombi.amz_controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.mtombi.amz_dao.Actor_movie_dao;
import com.mtombi.amz_dto.Actor;
import com.mtombi.amz_dto.Manylanguages;
import com.mtombi.amz_dto.Manyrole;
import com.mtombi.amz_dto.Movie;

public class Actor_move_controller {

	public static void main(String[] args) {
		Actor actor = new Actor();
		actor.setAname("The Rock");
		actor.setAmno(3994942);
		actor.setAge(45);
//		actor.setArole(new ArrayList<String>(Arrays.asList("villian","hero")));

		Actor actor2 = new Actor();
		actor2.setAname("Amir khan");
		actor2.setAmno(7827482);
		actor2.setAge(46);
//		actor2.setArole(new ArrayList<String>(Arrays.asList("commedian","hero")));

		Actor actor3 = new Actor();
		actor3.setAname("HrithikRoshan");
		actor3.setAmno(28388289);
		actor3.setAge(40);
//		actor3.setArole(new ArrayList<String>(Arrays.asList("commedian","hero","villian")));

		Movie movie = new Movie();
		movie.setNmovie("Black adams");
		movie.setMrdate("01-08-2022");
//		movie.setMlanguages(new ArrayList<String>(Arrays.asList("english","Hindi")));

		Movie movie2 = new Movie();
		movie2.setNmovie("3-idiots");
		movie2.setMrdate("01-08-2020");
//		movie2.setMlanguages(new ArrayList<String>(Arrays.asList("Hindi")));

		Movie movie3 = new Movie();
		movie3.setNmovie("war");
		movie3.setMrdate("01-08-2020");
//		movie3.setMlanguages(new ArrayList<String>(Arrays.asList("Hindi")));

		Manyrole manyrole = new Manyrole();
		manyrole.setRole("villian");

		Manyrole manyrole2 = new Manyrole();
		manyrole2.setRole("hero");

		Manyrole manyrole3 = new Manyrole();
		manyrole3.setRole("commedian");

//		actor.setManyroles(list);

		Manylanguages manylanguages = new Manylanguages();
		manylanguages.setMlanguages("English");

		Manylanguages manylanguages2 = new Manylanguages();
		manylanguages2.setMlanguages("Hindi");

		Manylanguages manylanguages3 = new Manylanguages();
		manylanguages3.setMlanguages("Marathi");

//		movie.setManylanguages(list2);

		List<Actor> actors = new ArrayList<Actor>();
		actors.add(actor);
		actors.add(actor2);
		actors.add(actor3);

		List<Movie> movies = new ArrayList<Movie>();
		movies.add(movie);
		movies.add(movie2);
		movies.add(movie3);

		List<Manyrole> list = new ArrayList<Manyrole>();
		list.add(manyrole);
		list.add(manyrole2);
		list.add(manyrole3);

		List<Manylanguages> list2 = new ArrayList<Manylanguages>();

		list2.add(manylanguages);
		list2.add(manylanguages2);
		list2.add(manylanguages3);
		
		actor.setMovies(movies);
		actor.setManyroles(list);
		movie.setActors(actors);
		movie.setManylanguages(list2);
		
		
		
		actor2.setMovies(movies);
		actor2.setManyroles(list);
		movie2.setActors(actors);
		movie2.setManylanguages(list2);
	
		actor3.setMovies(movies);
		actor3.setManyroles(list);
		movie3.setActors(actors);
		movie3.setManylanguages(list2);
		
//		manyrole.setActor(actor);
//		manylanguages.setMovie(movie);
//		
//		manyrole2.setActor(actor2);
//		manylanguages2.setMovie(movie2);
//		
//		
//		manyrole3.setActor(actor3);
//		manylanguages3.setMovie(movie3);
//		

		Actor_movie_dao dao = new Actor_movie_dao();
		dao.saveActor(actor);
		dao.saveActor(actor2);
		dao.saveActor(actor3);
//		dao.saveMovie(movie);
//		dao.saveMovie(movie2);
//		dao.saveMovie(movie3);

	}

}
