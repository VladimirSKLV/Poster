package ru.netology.manager;

import lombok.Data;
import ru.netology.domain.Poster;

@Data

public class PosterManager {
    private Poster[] movies = new Poster[0];
    private int defaultMovieLength = 10;

    public PosterManager() {

    }
    public PosterManager(int customMovieLength) {
        if (customMovieLength > 0) {
            defaultMovieLength = customMovieLength;
        }
    }

    public void addMovie(Poster movie) {
        int length = movies.length + 1;
        Poster[] tmp = new Poster[length];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        int lastMovie = tmp.length - 1;
        tmp[lastMovie] = movie;
        movies = tmp;

    }
    public Poster[] getLastAdd() {
        int moviesLength = movies.length;
        if (moviesLength < defaultMovieLength) {
            defaultMovieLength = moviesLength;
        }
        Poster[] customFilm = new Poster[defaultMovieLength];
        for (int i = 0; i < customFilm.length; i++) {
            int result = moviesLength - i - 1;
            customFilm[i] = movies[result];

        }
        return customFilm;
    }
}