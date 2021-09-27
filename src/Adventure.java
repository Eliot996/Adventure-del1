import java.util.Scanner;

public class Adventure {

    private Map mapOfGame;
    private Player player;
    Scanner input = new Scanner(System.in);

    public Adventure(){
        mapOfGame = new Map();
        player = new Player();
        player.setCurrentRoom(mapOfGame.getMap()[0]);
    }

    public void play(){
        System.out.println(player.getCurrentRoom().getName());

        boolean gameActive = true;
        System.out.println("Welcome to the adventure game!");
        System.out.println("You are curretly in " + player.getCurrentRoom().getDescription());
        System.out.println("Which direction would you like to go?");

        while(gameActive){
            String userInput = input.nextLine();
            if(userInput.contains("go ")){ //TODO: change, bug potential. use substring.contains?
                userInput = userInput.substring(3);
                System.out.println(goTo(userInput));
            }

            if(userInput.contains("exit")){
                System.out.println("Leaving already? :(");
                System.out.println("Hopefully we'll see each other again :) ");
                gameActive = false;
            }

            if(userInput.contains("look")){
                System.out.println(look());
            }

            if(userInput.contains("help")){
                System.out.println(helpPlayer());
            }
        }
    }

    public String look(){
        return player.getCurrentRoom().getDescription();
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

    public static void main(String[] args) {

        Adventure game = new Adventure();
        game.play();

    }
}
