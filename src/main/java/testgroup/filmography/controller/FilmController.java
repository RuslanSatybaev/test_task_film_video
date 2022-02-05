package testgroup.filmography.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import testgroup.filmography.model.Film;
import testgroup.filmography.service.FilmService;
import testgroup.filmography.service.KinoPoiskService;

import java.util.List;

@Controller
public class FilmController {

    @Autowired
    private FilmService filmService;
    private static final ModelAndView modelAndView = new ModelAndView();

    @Autowired
    private KinoPoiskService kinoPoiskService;
    int position = 1;

    @GetMapping("/")
    public ModelAndView allFilms() {

        try {
            for (Film filmDescr : kinoPoiskService.desc.films) {
                filmDescr.setPosition(position);
                position++;
                filmService.add(filmDescr);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        List<Film> films = filmService.allFilms();
        modelAndView.setViewName("films");
        modelAndView.addObject("filmsList", films);
        return modelAndView;
    }

    @RequestMapping(value = "/edit", method = RequestMethod.GET)
    public ModelAndView editPage() {
        modelAndView.setViewName("editPage");
        return modelAndView;
    }
}
