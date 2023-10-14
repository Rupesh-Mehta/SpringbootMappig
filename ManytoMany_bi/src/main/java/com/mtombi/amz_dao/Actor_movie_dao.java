package com.mtombi.amz_dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.mtombi.amz_dto.Actor;
import com.mtombi.amz_dto.Manylanguages;
import com.mtombi.amz_dto.Manyrole;
import com.mtombi.amz_dto.Movie;

public class Actor_movie_dao {

	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
	private EntityManager manager = factory.createEntityManager();
	private EntityTransaction transaction = manager.getTransaction();

	public void saveActor(Actor actor) {
		transaction.begin();
		List<Manyrole> manyroles=actor.getManyroles();
		for (Manyrole manyrole : manyroles) {
			manyrole.setActor(actor);
		}
		manager.persist(actor);
		transaction.commit();
	}

//	public void saveMovie(Movie movie) {
//		transaction.begin();
//		List<Manylanguages> manylanguages=movie.getManylanguages();
//		for (Manylanguages manylanguages2 : manylanguages) {
//			manylanguages2.setMovie(movie);
//		}
//		manager.persist(movie);
//		transaction.commit();
//
//	}
	
	public void saveManyrole(Manyrole manyrole) {
		transaction.begin();
		
		
		manager.persist(manyrole);
		transaction.commit();
	}
	public void manyLanguages(Manylanguages manylanguages) {
		transaction.begin();
		manager.persist(manylanguages);
		transaction.commit();
	}

}
