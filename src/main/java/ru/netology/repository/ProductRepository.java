package ru.netology.repository;

import ru.netology.domain.PurchaseMovie;

public class ProductRepository {
    private PurchaseMovie[] movies = new PurchaseMovie[0];

    public PurchaseMovie[] findAll() {
        return movies;
    }

    public void save(PurchaseMovie movie) {
        PurchaseMovie[] tmp = new PurchaseMovie[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;

    }

    public PurchaseMovie[] findById(int id) {
        PurchaseMovie[] tmp = new PurchaseMovie[1];
        int copyToIndex = 0;
        for (PurchaseMovie movie : movies) {
            if (movie.getId() == id) {
                tmp[copyToIndex] = movie;
            }
            movies = tmp;
        }
        return movies;
    }

    public void removeById(int id) {
        PurchaseMovie[] tmp = new PurchaseMovie[movies.length - 1];
        int copyToIndex = 0;
        for (PurchaseMovie movie : movies) {
            if (movie.getId() != id) {
                tmp[copyToIndex] = movie;
                copyToIndex++;
            }
        }
        movies = tmp;
    }

    public void removeAll() {
        PurchaseMovie[] tmp = new PurchaseMovie[0];
        movies = tmp;
    }
}
