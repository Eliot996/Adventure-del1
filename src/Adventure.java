public class Adventure {
    public static void main(String[] args) {
        Room room1 = new Room("room1", "empty");
        Room room2 = new Room("room2", "empty");
        Room currentRoom = room1;
        room1.setEast(room2);
        System.out.println(currentRoom.getName());
        currentRoom = room2;
        System.out.println(currentRoom.getName());
    }
}
