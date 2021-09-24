import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    void testCheck(){
        boolean test = true;

        Room room1 = new Room("", "");
        Room room2 = new Room("", "");
        room1.setEast(room2);
        test = test && room1.check("east");
        room1.setSouth(room2);
        test = test && room1.check("south");
        room1.setNorth(room2);
        test = test && room1.check("north");
        room1.setWest(room2);
        test = test && room1.check("west");
        test = test && !room1.check("hej");

        assertTrue(test);
    }

}