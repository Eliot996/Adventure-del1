import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    void testCheck(){
        boolean test;

        Room room1 = new Room("", "");
        Room room2 = new Room("", "");
        room1.setEast(room2);

        test = room1.check("east");

        test = test && room2.check("west");

        test = test && !room1.check("west");

        test = test && !room1.check("south");

        test = test && !room1.check("north");

        test = test && !room1.check("hej");

        assertTrue(test);
    }

}