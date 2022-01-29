package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ManagerTest {

    Manager manager = new Manager();
    Movie one = new Movie(1, 1, "one", 1);
    Movie two = new Movie(2, 2, "Dva", 2);
    Movie three = new Movie(3, 3, "Tri", 3);
    Movie four = new Movie(4, 4, "4aTblPe", 4);
    Movie five = new Movie(5, 15, "Piat'", 1);
    Movie six = new Movie(6, 25, "Six", 2);
    Movie seven = new Movie(7, 33, "Seven", 3);
    Movie eight = new Movie(8, 24, "Octa", 4);
    Movie nine = new Movie(9, 13, "Deviat'", 1);
    Movie ten = new Movie(10, 25, "X", 2);
    Movie tenOne = new Movie(11, 63, "Odinadsat'", 3);
    Movie tenTwo = new Movie(12, 47, "Dvenadsat'", 4);
    Movie tenTenOne = new Movie(21, 21,"Dvadcat' odbIH",32);

    @Test
        public void shouldRemoveIfExists() {
            Manager manager = new Manager(3);
            int idToRemove = 1;
            manager.save(one);
            manager.save(two);
            manager.save(three);

            manager.removeById(idToRemove);

            Movie[] actual = manager.getAll();
            Movie[] expected = new Movie[]{three, two};

//    assertEquals(expected, actual);
            assertArrayEquals(expected, actual);
        }
    @Test
    public void shouldShowAll() {
        Manager manager = new Manager();
        manager.save(one);
        manager.save(two);
        manager.save(three);
        manager.save(four);
        manager.save(five);
        manager.save(six);
        manager.save(seven);
        manager.save(eight);
        manager.save(nine);
        manager.save(ten);

        Movie[] actual = manager.listMovies();
        Movie[] expected = new Movie[]{ten, nine, eight, seven, six, five, four, three, two, one};

        assertArrayEquals(expected, actual);
    }
    @Test
    void shouldReturnLastIfMoviesReturnSix() {
        Manager manager = new Manager(6);
        Movie[] expected = new Movie[]{three, two, one};
        manager.save(one);
        manager.save(two);
        manager.save(three);
        Movie[] actual = manager.listMovies();

        assertArrayEquals(expected, actual);
    }
    @Test
    void shouldDownZero() {
        Manager manager = new Manager(-4);
        Movie[] expected = new Movie[]{three, two, one};
        manager.save(one);
        manager.save(two);
        manager.save(three);
        Movie[] actual = manager.listMovies();

        assertArrayEquals(expected, actual);
    }


}
