package ru.netology.manager;

import ru.netology.domain.Poster;

public class PosterManager {
    private Poster[] playbill = new Poster[0];
    private int limit;

    public PosterManager() {
        limit = 10;
    }

    public PosterManager(int limit) {
        this.limit = limit;
    }


    public void add(Poster item) {
        int length = playbill.length + 1;
        Poster[] tmp = new Poster[length];
        System.arraycopy(playbill, 0, tmp, 0, playbill.length);

        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        playbill = tmp;

    }

    public Poster[] findLast() {
        Poster[] playbill = findAll();
        Poster[] result;
        if (limit < playbill.length) {
            result = new Poster[limit];
        } else {
            result = new Poster[playbill.length];
        }
        for (int i = 0; i < result.length; i++) {
            int index = playbill.length - i - 1;
            result[i] = playbill[index];
        }
        return result;
    }

    public Poster[] findAll() {
        return playbill;
    }

}
