import Controller.Controller;
import Model.Film;
import Repository.FilmRepo;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Film film1 = new Film("title1", 2000, "director1");
        Film film2 = new Film("title2", 2001, "director2");
        Film film3 = new Film("title3", 2002, "director3");
        ArrayList<Film> films = new ArrayList<>();
        films.add(film1);
        films.add(film2);
        films.add(film3);
        FilmRepo repo = new FilmRepo(films);
        Controller controller = new Controller(repo);
        System.out.println(controller.getFilmsByDirector("2"));
    }
}
