public class Map {
    //Creation of the rooms
    public Room[] map;

    public Map(){
        //Creating the array
        map = new Room[9];

        //Creating the room objects
        map[0] = new Room("Room1", "empty");
        map[1] = new Room("Room2", "empty");
        map[2] = new Room("Room3", "empty");
        map[3] = new Room("Room4", "empty");
        map[4] = new Room("Room5", "treasure room");
        map[5] = new Room("Room6", "empty");
        map[6] = new Room("Room7", "empty");
        map[7] = new Room("Room8", "empty");
        map[8] = new Room("Room9", "empty");

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
