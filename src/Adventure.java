import java.util.Scanner;

public class Adventure {

    private Room[] map;
    private Room currentRoom;
    Scanner input = new Scanner(System.in);

    public Adventure(){
        buildMap();
    }

    public void buildMap(){
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

        map[0].setEast(map[1]);
        map[0].setSouth(map[3]);

        map[1].setEast(map[2]);
        map[2].setSouth(map[5]);

        map[5].setSouth(map[8]);
        map[6].setNorth(map[3]);

        map[7].setWest(map[6]);
        map[7].setNorth(map[4]);
        map[8].setWest(map[7]);
    }

    public void play(){
        currentRoom = map[0];

        boolean gameActive = true;
        while(gameActive){
            String userInput = input.nextLine();
            if(userInput.contains("go ")){ //TODO: change, bug potential.
                userInput = userInput.substring(3);
                System.out.println(goTo(userInput));
            }

            if(userInput.contains("exit")){
                gameActive = false;
            }

            if(userInput.contains("look")){
                System.out.println(look());

            }
        }
    }

    public String look(){
        return currentRoom.getDescription();
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

    public String helpPlayer(){
        return "";
    }

    public static void main(String[] args) {

        Adventure game = new Adventure();
        game.play();

    }
}
