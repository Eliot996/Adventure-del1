public class Map {
    //Creation of the rooms
    public Room[] map;

    public Map(){
        //Creating the array
        map = new Room[9];

        //Creating the room objects
        map[0] = new Room("The basement", "This room is dark and smells awful...I would highly recommend you to leave.");
        map[1] = new Room("Room 007", "The name of this room sounds cool, maybe there is something of use in here?");
        map[2] = new Room("Maybe", "Is this even a room? Doesn't look like one to me, but you are welcome to explore.");
        map[3] = new Room("The dungeon", "oh boy... this room looks similar to the basement, but feels way worse to be " +
                "in here. If you didn't like the first room, then you'll definitely hate this room.");
        map[4] = new Room("The magical room", "Congratulations! You have found the magical room, well done player \uD83D\uDC4F");
        map[5] = new Room("The laboratory", "There are a bunch of dangerous chemicals scattered around this room. " +
                "Be careful, you could harm yourself.");
        map[6] = new Room("The safe room", "Can you believe that? Finally a room that is cozy and safe." +
                " There are even some food and drinks to give you some well-deserved energy! ❤");
        map[7] = new Room(Color.BRIGHT_RED + "The red room", "This room is full of torture devices and items that " +
                "could be of use \uD83D\uDE0F");
        map[8] = new Room(Color.RESET_COLOR + "The 'magical-ish room'", "Looks like you've found the 'magical room', " +
                "but something seems totally off...\uD83D\uDE1F");

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
