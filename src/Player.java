public class Player {

    private String playerName;
    private boolean position;
    private int HP;
    private int maxHP;
    private Room currentRoom;


    public Player(){
        this.HP = maxHP;

    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public boolean isPosition() {
        return position;
    }

    public void setPosition(boolean position) {
        this.position = position;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getMaxHP(){
        return maxHP;
    }

    public void setMaxHP( int maxHP){
        this.maxHP = maxHP;
    }

    public void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public String goTo(String userInput){
        if (userInput.equals("north") && getCurrentRoom().hasNorth()){
            setCurrentRoom(getCurrentRoom().getNorth());
            return getCurrentRoom().getDescription();
        }
        if(userInput.equals("south") && getCurrentRoom().hasSouth()){
            setCurrentRoom(getCurrentRoom().getSouth());
            return getCurrentRoom().getDescription();
        }
        if(userInput.equals("east") && getCurrentRoom().hasEast()){
            setCurrentRoom(getCurrentRoom().getEast());
            return getCurrentRoom().getDescription();
        }
        if(userInput.equals("west") && getCurrentRoom().hasWest()){
            setCurrentRoom(getCurrentRoom().getWest());
            return getCurrentRoom().getDescription();
        }
        return "You cannot go that direction in this room";
    }
}
