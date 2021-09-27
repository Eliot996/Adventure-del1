public class Map {
    //Creation of the rooms
    public Room[] map;

    public Map(){
        //Creating the array
        map = new Room[9];

        //Creating the room objects
        map[0] = new Room("The basement", "It is pretty dark and scary in here...");
        map[1] = new Room("Room 007", "Maybe there is something of use in here?");
        map[2] = new Room("Maybe", "Is this even a room?");
        map[3] = new Room("The dungeon", "This is not a fun room to be in...");
        map[4] = new Room("The magical room", "Looks like there is something valuable could be in here");
        map[5] = new Room("The laboratory", "Be careful, you could harm yourself");
        map[6] = new Room("The bad room", "It does not feel very nice to be in here");
        map[7] = new Room("The red room", "Alot of whips everywhere");
        map[8] = new Room("The 'magical-ish room'", "Is this what you really think it is?");

        //Connected the rooms.
        //Connected room1 with room2 and room4
        map[0].setEast(map[1]);
        map[0].setSouth(map[3]);

        //Connected room2 with room3
        //Connected room3 with room6
        map[1].setEast(map[2]);
        map[2].setSouth(map[5]);

        //Connected room6 with room9
        //Connected room7 with room4
        map[5].setSouth(map[8]);
        map[6].setNorth(map[3]);

        //Connected room8 with room7
        //Connected room8 with room5
        //Connected room9 with room8
        map[7].setWest(map[6]);
        map[7].setNorth(map[4]);
        map[8].setWest(map[7]);
    }

    public Room[] getMap() {
        return map;
    }
}
