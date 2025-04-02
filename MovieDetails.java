abstract class Movie {
    String title;
    String director;
    int releaseYear;

    public Movie(String title, String director, int releaseYear) {
        this.title = title;
        this.director = director;
        this.releaseYear = releaseYear;
    }
    abstract void play();
    abstract void displayInfo();
    abstract String getGenre();
}

class ActionMovie extends Movie {
    public ActionMovie(String title, String director, int releaseYear) {
        super(title, director, releaseYear);
    }

    void play() {
        System.out.println("Playing action-packed movie: " + title);
    }

    void displayInfo() {
        System.out.println("Action Movie: " + title + " | Directed by: " + director + " | Released in: " + releaseYear);
    }

    String getGenre() {
        return "Action";
    }
}

class ComedyMovie extends Movie {
    public ComedyMovie(String title, String director, int releaseYear) {
        super(title, director, releaseYear);
    }

    void play() {
        System.out.println("Playing comedy movie: " + title);
    }

    void displayInfo() {
        System.out.println("Comedy Movie: " + title + " | Directed by: " + director + " | Released in: " + releaseYear);
    }

    String getGenre() {
        return "Comedy";
    }
}
public class MovieDetails {

	public static void main(String[] args) {
		Movie m1=new ComedyMovie("REMO","IDK",2010);
		m1.play();
		m1.displayInfo();
		System.out.println("Genre: "+m1.getGenre());
		
		Movie m2=new ActionMovie("Mankatha","VP",2010);
		m2.play();
		m2.displayInfo();
		System.out.println("Genre: "+m2.getGenre());
		

	}

}