package testgroup.filmograhy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import testgroup.filmograhy.model.Film;

@Controller
public class FilmController {
    private static final ModelAndView modelAndView = new ModelAndView();
    private static Film film;

    static {
        film = new Film();
        film.setTitle("Inception");
        film.setYear(2010);
        film.setGenre("sci-fi");
        film.setWatched(true);
        film.setPosition(1);
        film.setRating(5);
        film.setCountVotePeople(1000);
    }

    @GetMapping("/")
    public ModelAndView allFilms() {
        modelAndView.setViewName("films");
        modelAndView.addObject("film", film);
        return modelAndView;
    }

    @RequestMapping(value = "/edit", method = RequestMethod.GET)
    public ModelAndView editPage() {
        modelAndView.setViewName("editPage");
        return modelAndView;
    }
}
