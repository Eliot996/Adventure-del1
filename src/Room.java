public class Room {

    private Room north;
    private Room south;
    private Room east;
    private Room west;
    private String name;
    private String description;

    public Room(String name, String description){
        this.name = name;
        this.description = description;
    }

    public Room getNorth() {
        return north;
    }

    public Room getSouth() {
        return south;
    }

    public Room getWest() {
        return west;
    }

    public Room getEast() {
        return east;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setNorth(Room north) {
        if(this.north == null){
            this.north = north;
            north.setSouth(this);
        }
    }

    public void setSouth(Room south) {
        if(this.south == null){
            this.south = south;
            south.setNorth(this);
        }
    }

    public void setWest(Room west) {
        if(this.west == null){
            this.west = west;
            west.setEast(this);
        }
    }

    public void setEast(Room east) {
        if(this.east == null){
            this.east = east;
            east.setWest(this);
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean hasNorth(){
        return north != null;
    }

    public boolean hasSouth(){
        return south != null;
    }

    public boolean hasEast(){
        return east != null;
    }

    public boolean hasWest(){
        return west != null;
    }
}
