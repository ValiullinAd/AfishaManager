package ru.netology;


public class Movie {
        private int id;
        private int movieId;
        private String movieName;
        private int someElse;


        public int getId() {
                return id;
        }

        public void setId(int id) {
                this.id = id;
        }

        public int getMovieId() {
                return movieId;
        }

        public void setMovieId(int movieId) {
                this.movieId = movieId;
        }

        public String getMovieName() {
                return movieName;
        }

        public void setMovieName(String movieName) {
                this.movieName = movieName;
        }

        public int getSomeElse() {
                return someElse;
        }

        public void setSomeElse(int someElse) {
                this.someElse = someElse;
        }

        public Movie(int id, int movieId, String movieName, int someElse) {
                this.id = id;
                this.movieId = movieId;
                this.movieName = movieName;
                this.someElse = someElse;
        }
        public  Movie(){

        }
}
