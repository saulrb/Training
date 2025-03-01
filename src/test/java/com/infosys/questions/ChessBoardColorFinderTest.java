package com.infosys.questions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChessBoardColorFinderTest {

    @BeforeEach
    void setUp() {

    }

    @Test
    void colorFinderWhite() {
        Assertions.assertEquals(ChessBoardColorFinder.COLOR_WHITE,ChessBoardColorFinder.colorFinder(1,1));
    }

    @Test
    void colorFinder2White() {
        Assertions.assertEquals(ChessBoardColorFinder.COLOR_WHITE,ChessBoardColorFinder.colorFinder2(5,5));
    }

    @Test
    void colorFinderBlack() {
        Assertions.assertEquals(ChessBoardColorFinder.COLOR_BLACK,ChessBoardColorFinder.colorFinder2(5,4));
    }
}