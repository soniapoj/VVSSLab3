package Repository;

import Model.Film;

import java.util.ArrayList;

public class FilmRepo {
    private ArrayList<Film> movies;
    public FilmRepo(){
        this.movies = new ArrayList<>();
    }
    public FilmRepo(ArrayList<Film> movies){
        this.movies = movies;
    }

    /** Returns the Film with the given title
     * @param title the title of the Film to be returned title must not be null
     * @return the Film with the specified title or null - if there is no Film with the given title
     */
    public Film findOne(String title){
        for (Film Film : movies)
            if (Film.getTitle().equals(title))
                return Film;
        return null;
    }

    /** Returns an Iterable containing all of the repository's movies
     * @return Iterable containing all of the repository's movies
     */
    public ArrayList<Film> findAll() {
        return this.movies;
    }

    /** Saves the given Film to the repository, provided it is not already in repository and not null
     * @param newFilm Film must be not null
     * @return null, if the given Film is saved, otherwise returns the Film (title already exists)
     */
    public Film save(Film newFilm){
        for (Film Film : this.movies)
            if (Film.getTitle().equals(newFilm.getTitle()))
                return Film;
        this.movies.add(newFilm);
        return null;
    }

    /** Removes the Film with the specified title, provided that it exists in the repository
     * removes the Film with the specified title
     *
     * @param title title must be not null
     * @return the removed Film or null if there is no Film with the given title
     */
    public Film delete(String title){
        for (int i=0; i<this.movies.size(); i++) {
            Film Film = this.movies.get(i);
            if (Film.getTitle().equals(title)) {
                this.movies.remove(i);
                return Film;
            }
        }
        return null;
    }

    /** Updates the given Film in the repository, provided it is already in repository
     * @param newFilm Film must not be null
     * @return null if the Film is updated, otherwise returns the Film - (e.g title does not exist).
     */
    public Film update(Film newFilm) {
        for (int i = 0; i < this.movies.size(); i++) {
            Film Film = this.movies.get(i);
            if (Film.getTitle().equals(newFilm.getTitle())) {
                this.movies.remove(i);
                this.movies.add(newFilm);
                return null;
            }
        }
        return null;
    }
}
