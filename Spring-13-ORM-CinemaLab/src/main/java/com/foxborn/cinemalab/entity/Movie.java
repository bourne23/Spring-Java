package com.foxborn.cinemalab.entity;

import com.foxborn.cinemalab.enums.MovieState;
import com.foxborn.cinemalab.enums.MovieType;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
@NoArgsConstructor
@Data
public class Movie extends BaseEntity{   // movie

    private String name;
    @Column(columnDefinition = "DATE")
    private LocalDate releaseDate;  // release_date
    private Integer duration;
    @Column (columnDefinition = "TEXT")
    private String summary;
    @Enumerated(EnumType.STRING)
    private MovieType type;
    @Enumerated(EnumType.STRING)
    private MovieState state;
    private BigDecimal price;

    //NOT need constructor because will use data.sql

 // this is relationship column
    @ManyToMany
    @JoinTable(name = "movie_genre_rel",    // change table name
            joinColumns = @JoinColumn(name="movie_id"),   // change column name in movie
            inverseJoinColumns = @JoinColumn(name = "genre_id"))   // change column name in genre
    private List<Genre> genreList;
}
