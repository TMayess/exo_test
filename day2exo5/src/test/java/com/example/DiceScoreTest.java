package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class DiceScoreTest {
    @Test
    void testDeuxDesIdentiques() {
        Ide deMock = mock(Ide.class);
        when(deMock.getRoll()).thenReturn(4);

        DiceScore diceScore = new DiceScore(deMock);
        int result = diceScore.getScore();

        assertEquals(18, result);
    }

    @Test
    void testDoubleSix() {
        Ide deMock = mock(Ide.class);
        when(deMock.getRoll()).thenReturn(6);

        DiceScore diceScore = new DiceScore(deMock);
        int result = diceScore.getScore();

        assertEquals(30, result);
    }

    @Test
    void testDesQuelconques() {
        Ide deMock = mock(Ide.class);
        when(deMock.getRoll()).thenReturn(3, 5);

        DiceScore diceScore = new DiceScore(deMock);
        int result = diceScore.getScore();

        assertEquals(5, result);
    }
}
