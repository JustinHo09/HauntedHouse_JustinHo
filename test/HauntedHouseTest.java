import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HauntedHouseTest {

    static HauntedHouse house;

    @BeforeEach
    void setUp() {
        house = new HauntedHouse();
    }

    @Test
    void isGhostPresent() {
        //house = new HauntedHouse();
        assertTrue(house.isGhostPresent());
    }

    @Test
    void scareAwayGhost() {
        assertTrue(house.isGhostPresent());
        house.scareAwayGhost();
        assertFalse(house.isGhostPresent());
    }

    @Test
    void scareAwayGhostWhenNoGhost() {
        //scareAwayGhost();
        //house = new HauntedHouse();
        assertTrue(house.isGhostPresent());
        house.scareAwayGhost();
        assertFalse(house.isGhostPresent());

        house.scareAwayGhost();
        assertFalse(house.isGhostPresent());
    }

    @Test
    void refillCandyBowlPos() {
        //house = new HauntedHouse();
        assertEquals(10,house.getCandyCount());
        house.refillCandyBowl(10);
        assertEquals(20, house.getCandyCount());
    }

    @Test
    void refillCandyBowlNeg() {
        //house = new HauntedHouse();
        assertEquals(10,house.getCandyCount());
        house.refillCandyBowl(-10);
        assertEquals(10, house.getCandyCount());
    }

    @Test
    void trickOrTreatPos() {
        house.trickOrTreat(10);
        assertEquals(0,house.getCandyCount());
    }

    @Test
    void trickOrTreatTooManyPeople() {
        house.trickOrTreat(100);
        assertEquals(10,house.getCandyCount());
    }

    @Test
    void trickOrTreatNeg() {
        house.trickOrTreat(-10);
        assertEquals(10,house.getCandyCount());
    }

    @Test
    void getCandyCount() {
        assertEquals(10, house.getCandyCount());
    }

    @Test
    void spookySound() {
        assertEquals("Boo!", house.spookySound());
    }
}