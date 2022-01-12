package testgroup.filmograhy.dao;

import testgroup.filmograhy.controller.ApiMain;
import testgroup.filmograhy.model.Film;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class FilmDAOImpl implements FilmDAO {
    private static final AtomicInteger AUTO_ID = new AtomicInteger(1);
    private static Map<Integer, Film> films = new HashMap<>();

    static {

        Film film1 = new Film();
        film1.setId(AUTO_ID.getAndIncrement());
        film1.setTitle(ApiMain.getFilmName(0));
        film1.setYear(ApiMain.getFilmYear(0));
        film1.setGenre("sci-fi");
        film1.setWatched(true);
        film1.setPosition(1);
        film1.setRating(ApiMain.getFilmRating(0));
        film1.setCountVotePeople(1000);
        films.put(film1.getId(), film1);

        Film film2 = new Film();
        film2.setId(AUTO_ID.getAndIncrement());
        film2.setTitle(ApiMain.getFilmName(1));
        film2.setYear(ApiMain.getFilmYear(1));
        film2.setGenre("sci-fivdfv");
        film2.setWatched(true);
        film2.setPosition(1);
        film2.setRating(ApiMain.getFilmRating(1));
        film2.setCountVotePeople(100045245);
        films.put(film2.getId(), film2);
    }

    @Override
    public List<Film> allFilms() {
        return new ArrayList<>(films.values());
    }

    @Override
    public void add(Film film) {
        film.setId(AUTO_ID.getAndIncrement());
        films.put(film.getId(), film);
    }

    @Override
    public void delete(Film film) {
        films.remove(film.getId());
    }

    @Override
    public void edit(Film film) {
        films.put(film.getId(), film);
    }

    @Override
    public Film getById(int id) {
        return films.get(id);
    }
}
