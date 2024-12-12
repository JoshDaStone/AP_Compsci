package pkg;

public class Movie{
    String movieName;
    double rating;
    int numberOfRatings;
    int revenue;
    double addRating;
    
    public Movie(){
        movieName = "Avengers";
        rating = 8.0;
        numberOfRatings = 33;
        revenue = 623357910;
    }
    
    public Movie(String movieName, double rating, int numberOfRatings, int revenue){
        this.movieName = movieName;
        this.rating = rating; 
        this.numberOfRatings = numberOfRatings;
        this.revenue = revenue;
        }
        
    
    public void movieToString(){
       System.out.println("Movie Name: " + movieName);
       System.out.println("Rating: " + rating);
       System.out.println("Number of ratings: " + numberOfRatings); 
       System.out.println("Revenue: " + revenue); 
       System.out.println(""); 
    }
    
    
    public String getMovieName(){
        return movieName;
    }
    
    public int getRevenue(){
        return revenue;
    }
    
    public void addRating(double newRating){
    
    double ratingTotal;
    double ratingAverage;
    ratingTotal = (rating*numberOfRatings)+newRating;
    numberOfRatings = numberOfRatings+1;
    ratingAverage = ratingTotal / numberOfRatings;
    rating = ratingAverage;
    }
    
    public double getRating(){
        return rating;
    }
    
    public boolean compareRatings(Movie a){
        if(this.rating>rating){
            return false;
        }
        else {
            return true;
             }
        }
        
    public int revenueToString(){
        return revenue; 
        }
    }
