package com.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibTest {
    @Test
    @DisplayName("Le résultat n’est pas vide")
    void range1_resultatNonVide() {
        Fib fib = new Fib(1);
        assertEquals(1, fib.getFibSeries().size());
    }

    @Test
    @DisplayName("Le résultat correspond à une liste qui contient {0}")
    void range1_resultatEstZero() {
        Fib fib = new Fib(1);
        assertEquals(List.of(0), fib.getFibSeries());
    }


    @Test
    @DisplayName("Le résultat contient le chiffre 3")
    void range6_contientLechiffre3() {
        Fib fib = new Fib(6);
        assertEquals(true, fib.getFibSeries().contains(3));
    }


    @Test
    @DisplayName("Le résultat contient 6 éléments")
    void range6_contient6Elements() {
        Fib fib = new Fib(6);
        assertEquals(6, fib.getFibSeries().size());
    }


    @Test
    @DisplayName("Le résultat n’a pas le chiffre 4 en son sein")
    void range6_neContientPas4() {
        Fib fib = new Fib(6);
        assertEquals(false, fib.getFibSeries().contains(4));
    }

    @Test
    @DisplayName("Le résultat correspond à une liste qui contient {0, 1, 1, 2, 3, 5}")
    void range6_resultatCorrect() {
        Fib fib = new Fib(6);
        assertEquals(List.of(0, 1, 1, 2, 3, 5), fib.getFibSeries());
    }


    @Test
    @DisplayName("la série est triée en ordre ascendant")
    void range6_resultatTrieAscendant() {
        Fib fib = new Fib(6);
        List<Integer> series = fib.getFibSeries();

        for (int i = 0; i < series.size() - 1; i++) {
            assertEquals(true, series.get(i) <= series.get(i + 1));
        }
    }

}
