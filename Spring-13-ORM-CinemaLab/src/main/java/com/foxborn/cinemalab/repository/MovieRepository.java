package com.foxborn.cinemalab.repository;

import com.Foxborn.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {

    // ------------------- DERIVED QUERIES ------------------- //

    //Write a derived query to read a movie with a name

    //Write a derived query to list all movies between a range of prices

    //Write a derived query to list all movies where duration exists in the specific list of duration

    //Write a derived query to list all movies with higher than a specific release date

    //Write a derived query to list all movies with a specific state and type

    // ------------------- JPQL QUERIES ------------------- //

    //Write a JPQL query to list all movies between a range of prices

    //Write a JPQL query that returns all movie names

    // ------------------- Native QUERIES ------------------- //

    //Write a native query that returns a movie by name

    //Write a native query that return the list of movies in a specific range of prices

    //Write a native query to return all movies where duration exists in the range of duration

    //Write a native query to list the top 5 most expensive movies

}
