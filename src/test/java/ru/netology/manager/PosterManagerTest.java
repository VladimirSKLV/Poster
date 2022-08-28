package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Poster;

import static org.junit.jupiter.api.Assertions.*;

class MovieManagerTest {

    PosterManager manager = new PosterManager();

    private Poster first = new Poster(1, "Bladshot", "http://", "actionMovie");
    private Poster second = new Poster(2, "Ahead", "http://", "cartoon");
    private Poster third = new Poster(3, "HotelBelgrad", "http://", "comedy");
    private Poster fourth = new Poster(4, "Gentlemen", "http://", "actionMovie");
    private Poster fifth = new Poster(5, "InvisibleMan", "http://", "horrors");
    private Poster sixth = new Poster(6, "Trolls", "http://", "cartoon");
    private Poster seventh = new Poster(7, "NumberOne", "http://", "comedy");
    private Poster eighth = new Poster(8, "NumberTwo", "http://", "actionMovie");
    private Poster ninth = new Poster(9, "NumberThree", "http://", "actionMovie");
    private Poster tenth = new Poster(10, "NumberFour", "http://", "actionMovie");

    Poster[] expected = {tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};


    @Test
    void mustShowTenMovie() {
        PosterManager manager = new PosterManager(10);
        manager.addMovie(first);
        manager.addMovie(second);
        manager.addMovie(third);
        manager.addMovie(fourth);
        manager.addMovie(fifth);
        manager.addMovie(sixth);
        manager.addMovie(seventh);
        manager.addMovie(eighth);
        manager.addMovie(ninth);
        manager.addMovie(tenth);
        Poster[] actual = manager.getLastAdd();
        assertArrayEquals(expected, actual);
    }

    @Test
    void mustShowNothing() {
        PosterManager manager = new PosterManager(0);
        Poster[] actual = manager.getLastAdd();
        Poster[] expected = new Poster[0];
        assertArrayEquals(expected, actual);
    }

    @Test
    void mustShowValid() {
        PosterManager manager = new PosterManager(5);
        manager.addMovie(first);
        manager.addMovie(second);
        manager.addMovie(third);
        manager.addMovie(fourth);
        manager.addMovie(fifth);
        manager.addMovie(sixth);
        manager.addMovie(seventh);
        manager.addMovie(eighth);
        manager.addMovie(ninth);
        manager.addMovie(tenth);
        Poster movieToAdd = new Poster(11, "NumberFive", "http://", "horrors");
        manager.addMovie(movieToAdd);
        Poster[] actual = manager.getLastAdd();
        Poster[] expected = {new Poster(11, "NumberFive", "http://", "horrors"), tenth, ninth, eighth, seventh};
        assertArrayEquals(expected, actual);

    }

    @Test
    void mustShowOverMax() {
        PosterManager manager = new PosterManager(11);
        manager.addMovie(first);
        manager.addMovie(second);
        manager.addMovie(third);
        manager.addMovie(fourth);
        manager.addMovie(fifth);
        manager.addMovie(sixth);
        manager.addMovie(seventh);
        manager.addMovie(eighth);
        manager.addMovie(ninth);
        manager.addMovie(tenth);
        Poster[] actual = manager.getLastAdd();
        assertArrayEquals(expected, actual);

    }
}