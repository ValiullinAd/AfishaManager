package ru.netology;

public class Manager {

    private Movie[] items = new Movie[0];
    private int moviesShow;
    private int initialMoviesShow = 10;

    public Manager(int moviesShow){
        this.moviesShow = moviesShow;
    }

    public Manager() {
    }

    public void save(Movie item) {
        int length = items.length + 1;
        Movie[] tmp = new Movie[length];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;

    }

    public Movie[] getAll() {
        Movie[] result = new Movie[items.length];
        // перебираем массив в прямом порядке
        // но кладём в результаты в обратном
        for (int i = 0; i < result.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }

    // наивная реализация
    public void removeById(int id) {
        int length = items.length - 1;
        Movie[] tmp = new Movie[length];
        int index = 0;
        for (Movie item : items) {
            if (item.getId() != id) {
                tmp[index] = item;
                index++;
            }
        }
        items = tmp;
    }
    public Movie[] listMovies() {

        int resultLength;

        if (moviesShow <= 0)
            moviesShow = initialMoviesShow;
        resultLength = moviesShow;

        if (moviesShow > items.length) {
            resultLength = items.length;
        }
        Movie[] result = new Movie[resultLength];

        for (int i = 0; i < resultLength; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }

}
