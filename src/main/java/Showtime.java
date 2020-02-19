//We actually have the ability to make multiple classes
//inside one file.  This is helpful in driving home polymorphism
//as we can see everything in one and do not need to constantly switch
//between files

//only one class is allowed to be "public" in the file
//The class that is "public" is the one that the file is
//named after. Any other class in here must only
//be labeled as "class _____"

class Movie {
    private String title;

    public Movie (String mTitle) {
        title = mTitle;
    }

    public String plot () {
        return "The plot is in another castle";
    }

    public String getTitle () {
        return title;
    }
}

//build Jaws class

//build MenInBlack class

//build ShawshankRedemption class

//build StarWars class

//build Forgettable class

public class Showtime {
    public static void main(String[] args) {
        // The method call of movie.plot()
        // is showing how polymorphism works.

        // What Java is doing is looking
        // at the variable object called "singleMovie"
        // (the variable we created) and getting
        // the object type that is returned from the
        // randomMovie() method.

        // Then it goes to that Object class and
        // looks in it to see if it has a .plot()
        // method.  If it does then itss plot method
        // code is executed.  If it does not it will
        // go to the parent class and look for the method
        // in that class.

        // For the Forgettable movie it looks at
        // that class and sees there is no plot
        // method, but it notices that it extends
        // Movie so it goes up to movie and finds
        // a plot method in Movie so it uses that
        // method

        //WE WILL WRITE THE CODE THAT DOES THIS
        //HERE AS A FOR LOOP

    }

    // Return type is the object
    // Movie, its purpose is to
    // return a random movie, one
    // of the 5 movies.
    public static Movie randomMovie () {
        int randomNum = (int) (Math.random() * 5) + 1;

        System.out.println("Random number generated was" +
                ": " + randomNum);

        switch (randomNum) {
            case 1:
                return new Jaws();
            case 2:
                return new MenInBlack();
            case 3:
                return new ShawshankRedemption();
            case 4:
                return new StarWars();
            case 5:
                return new Forgettable();
            default:
                return null;
        }
    }
}
