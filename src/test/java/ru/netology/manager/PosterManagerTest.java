package ru.netology.manager;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import ru.netology.domain.Poster;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.verify;

class ListFilmsManagerTest {
    Poster film1 = new Poster(1, "Bladshot", "http://", "actionMovie");
    Poster film2 = new Poster(2, "Ahead", "http://", "cartoon");
    Poster film3 = new Poster(3, "HotelBelgrad", "http://", "comedy");
    Poster film4 = new Poster(4, "Gentlemen", "http://", "actionMovie");
    Poster film5 = new Poster(5, "InvisibleMan", "http://", "horrors");
    Poster film6 = new Poster(6, "Trolls", "http://", "cartoon");
    Poster film7 = new Poster(7, "NumberOne", "http://", "comedy");
    Poster film8 = new Poster(8, "NumberTwo", "http://", "actionMovie");
    Poster film9 = new Poster(9, "NumberThree", "http://", "actionMovie");
    Poster film10 = new Poster(10, "NumberFour", "http://", "actionMovie");
    Poster film11 = new Poster(11, "NumberFive", "http://", "actionMovie");

    @Test
    public void test1FindLast() {
        PosterManager manager = new PosterManager();
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);
        manager.add(film7);
        manager.add(film8);
        manager.add(film9);
        manager.add(film10);


        Poster[] actual = manager.findLast();
        Poster[] expected = {film10, film9, film8, film7, film6, film5, film4, film3, film2, film1};

        assertArrayEquals(actual, expected);
    }

    @Test
    public void test2FindLast() {
        PosterManager manager = new PosterManager();
        manager.add(film1);


        Poster[] actual = manager.findLast();
        Poster[] expected = {film1};

        assertArrayEquals(actual, expected);
    }

    @Test
    public void test3FindLast() {
        PosterManager manager = new PosterManager();
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);


        Poster[] actual = manager.findLast();
        Poster[] expected = {film5, film4, film3, film2, film1};

        assertArrayEquals(actual, expected);
    }

    @Test
    public void test4FindLast() {
        PosterManager manager = new PosterManager();
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);
        manager.add(film7);
        manager.add(film8);
        manager.add(film9);
        manager.add(film10);
        manager.add(film11);


        Poster[] actual = manager.findLast();
        Poster[] expected = {film11, film10, film9, film8, film7, film6, film5, film4, film3, film2};

        assertArrayEquals(actual, expected);
    }

    @Test
    public void test5FindLast() {
        PosterManager manager = new PosterManager();


        Poster[] actual = manager.findLast();
        Poster[] expected = {};

        assertArrayEquals(actual, expected);
    }

    @Test
    public void testFindAll() {
        PosterManager manager = new PosterManager();
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);
        manager.add(film7);
        manager.add(film8);
        manager.add(film9);
        manager.add(film10);


        Poster[] actual = manager.findAll();
        Poster[] expected = {film1, film2, film3, film4, film5, film6, film7, film8, film9, film10};

        assertArrayEquals(actual, expected);
    }}