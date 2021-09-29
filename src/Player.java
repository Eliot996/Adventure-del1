public class Player {

    private String playerName;
    private int HP;
    private int maxHP = 5;
    private Room currentRoom;


    public Player(){
        this.HP = maxHP;

    }

    public String goTo(String userInput){
        if ((userInput.equals("north") || userInput.equals("n")) && getCurrentRoom().hasNorth()){
            setCurrentRoom(getCurrentRoom().getNorth());
            return getCurrentRoom().getDescription();
        }
        if(userInput.equals("south") || userInput.equals("s") && getCurrentRoom().hasSouth()){
            setCurrentRoom(getCurrentRoom().getSouth());
            return getCurrentRoom().getDescription();
        }
        if((userInput.equals("east") || userInput.equals("e")) && getCurrentRoom().hasEast()){
            setCurrentRoom(getCurrentRoom().getEast());
            return getCurrentRoom().getDescription();
        }
        if((userInput.equals("west") || userInput.equals("w")) && getCurrentRoom().hasWest()){
            setCurrentRoom(getCurrentRoom().getWest());
            return getCurrentRoom().getDescription();
        }
        return "You cannot go that direction in this room";
    }

    // TODO: add info to getInfo
    public String getInfo(){
        return null;
    }

    //placeholder TODO: add inventory to player
    public String getInventory(){
        return null;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
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
}
