package Model;

public class Film {
    private String title;
    private int releaseYear;
    private String directorName;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }

    @Override
    public String toString() {
        return "Film{" +
                "title='" + title + '\'' +
                ", releaseYear=" + releaseYear +
                ", directorName='" + directorName + '\'' +
                '}';
    }

    public Film(String title, int releaseYear, String directorName) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.directorName = directorName;
    }
}
