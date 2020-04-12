package Controller;

import Model.Film;
import Repository.FilmRepo;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Controller {
    private FilmRepo repo;

    public Controller(FilmRepo repo) {
        this.repo = repo;
    }

    public ArrayList<Film> getFilmsByDirector(String directorName){
        ArrayList<Film> filmList = repo.findAll();
        ArrayList<Film> toReturn =  new ArrayList<>();
        for(Film film:filmList){
            if(film.getDirectorName().contains(directorName))
                toReturn.add(film);
        }
        return toReturn;
    }
}