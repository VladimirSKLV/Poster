package ru.netology.manager;

import ru.netology.domain.Poster;

public class Main {

    public static void main(String[] args) {

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

        PosterManager manager = new PosterManager();

        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film5);
        manager.add(film6);
        manager.add(film7);
        manager.add(film8);
        manager.add(film9);
        manager.add(film10);

        Poster[] all = manager.findLast();//Отдает в обратном порядке.

    }

}
