import java.util.Scanner;

public class Adventure {

    private Room[] map;
    private Room currentRoom;
    Scanner input = new Scanner(System.in);

    public Adventure(){
        buildMap();
    }

    public void buildMap(){
        //
        map = new Room[9];
        map[0] = new Room("Room1", "empty");
        map[1] = new Room("Room2", "empty");
        map[2] = new Room("Room3", "empty");
        map[3] = new Room("Room4", "empty");
        map[4] = new Room("Room5", "empty");
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

    public void play(){
        currentRoom = map[0];

        boolean gameActive = true;
        System.out.println("Welcome to the adventure game!");
        System.out.println("Which direction would you like to go?");
        while(gameActive){
            String userInput = input.nextLine();
            if(userInput.contains("go ")){ //TODO: change, bug potential.
                userInput = userInput.substring(3);
                System.out.println(goTo(userInput));
            }

            if(userInput.contains("exit")){
                System.out.println("Leaving already? :(");
                System.out.println("Hopefully we'll see each other again :)");
                gameActive = false;
            }

            if(userInput.contains("look")){
                System.out.println(look());

            }
            if(userInput.contains(("help"))){
                System.out.println(helpPlayer());
            }
        }
    }

    public String look(){
        return currentRoom.getDescription();
    }

    public String helpPlayer(){ // Could be done better, but for right now, this works OK.
        return """
                Here is some help for you. Hopefully this will make your journey easier:
                1) type 'go north', to go north.
                2) type 'go south', to go south.
                3) type 'go east', to go east.
                4) type 'go west', to go west.
                5) type 'look', to get a description of the room you are in.
                6) type 'exit', to end the game.
                I wish you the best of luck!
               """;
    }

    public String goTo(String userInput){
        if (userInput.equals("north") && currentRoom.check(userInput)){
            currentRoom = currentRoom.getNorth();
            return currentRoom.getName();
        }
        if(userInput.equals("south") && currentRoom.check(userInput)){
            currentRoom = currentRoom.getSouth();
            return currentRoom.getName();
        }
        if(userInput.equals("east") && currentRoom.check(userInput)){
            currentRoom = currentRoom.getEast();
            return currentRoom.getName();
        }
        if(userInput.equals("west") && currentRoom.check(userInput)){
            currentRoom = currentRoom.getWest();
            return currentRoom.getName();
        }
        return "You cannot go that direction in this room";
    }


    public static void main(String[] args) {

        Adventure game = new Adventure();
        game.play();

    }
}
