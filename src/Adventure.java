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

        boolean gameActive = true;
        System.out.println(Color.VIBRANT_PURPLE + "Welcome to the adventure game!" +
                "\nThere are many different rooms to travel between, some rooms are better than others," +
                " but your main goal should be to find the 'magical room'. " +
                "\nIf you at any point need assistance, just type 'help' and a useful guide will magically appear" +
                "\n I wish you the best of luck! See you on the other side \uD83D\uDE09");
        System.out.println();
        System.out.println(Color.RESET_COLOR + "You are currently in " + player.getCurrentRoom().getDescription());
        System.out.println("Which direction would you like to go?");

        while(gameActive){
            String userInput = input.nextLine();
            if(userInput.substring(0, 2).contains("go")){
                userInput = userInput.substring(3);
                System.out.println(player.goTo(userInput));
            }

            if(userInput.substring(0, 4).contains("exit")){
                System.out.println(Color.BRIGHT_RED + "Leaving already? :(");
                System.out.println("Hopefully we'll see each other again :) ");
                gameActive = false;
            }

            if(userInput.substring(0, 4).contains("look")){
                System.out.println(look());
            }

            if(userInput.substring(0, 4).contains("help")){
                System.out.println(helpPlayer());
            }
        }
    }

    public String look(){
        return player.getCurrentRoom().getDescription();
    }

    public String helpPlayer(){ // Could be done better, but for right now, this works OK.
        return Color.BRIGHT_GREEN + """
                Here is some help for you. Hopefully this will make your journey easier:
                1) To move in and out of different rooms, combine 'go' with a direction,
                   such as north, south, east or west, or simply use the starting letter of the direction.
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
