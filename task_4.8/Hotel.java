public class Hotel {
    Room[] rooms;

    public Hotel(Room[] rooms) {
        this.rooms = rooms;
    }

    public void getFreeRooms() {
        String freeRoomsList = "";
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].isFree()) freeRoomsList += rooms[i].getRoomNumber() + ", ";
        }
        System.out.println("Номера свободных комнат " + freeRoomsList);
    }

    public void reserveRoom(byte roomNumber) {
        String info = "Такой комнаты не существует";
        for (int i = 0; i < rooms.length; i++) {
            Room room = rooms[i];
            if (room.getRoomNumber() == roomNumber && room.isFree()) {
                room.setFree(false);
                info = ("Комната номер " + roomNumber + " успешно забронированна");
                break;
            } else if (room.getRoomNumber() == roomNumber && !room.isFree()) {
                info = "Комната " + roomNumber + " занята";
                break;
            }
        }
        System.out.println(info);
    }

    public void setFreeRoom(byte roomNumber) {
        String info = "Такой комнаты не существует";
        for (int i = 0; i < rooms.length; i++) {
            Room room = rooms[i];
            if (room.getRoomNumber() == roomNumber && !room.isFree()) {
                room.setFree(true);
                info = ("Комната номер " + roomNumber + " теперь свободна");
                break;
            } else if (room.getRoomNumber() == roomNumber && room.isFree()) {
                info = "Комната " + roomNumber + " не была забронирована";
                break;
            }
        }
        System.out.println(info);
    }

    public void RoomsWC() {

        String RoomsWCList = "";
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].isWc()) RoomsWCList += rooms[i].getRoomNumber() + ", ";
        }
        System.out.println("Номера комнат с наличием WC " + RoomsWCList);
    }

    public void RoomsEat() {

        String RoomsEatList = "";
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].isEat()) RoomsEatList += rooms[i].getRoomNumber() + ", ";
        }
        System.out.println("Номера комнат с питанием " + RoomsEatList);
    }

    public void RoomsQuantity(byte quantity) {
        if (quantity > 3 || quantity < 1) {
            System.out.println("нет номеров с таким количеством спальных мест. Выберете из: 1,2 или 3");
            return;
            String RoomsQuantityList = "";
            for (int i = 0; i < rooms.length; i++) {
                if (rooms[i].getQuantity()) RoomsQuantityList += rooms[i].getRoomNumber() + ", ";
            }
            System.out.println("Номера комнат с наличием WC " + RoomsQuantityList);
        }
    }

    public void showRoom(byte roomNumber) {
        String info = "Такой комнаты не существует";
        Room room = null;
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].getRoomNumber() == roomNumber) {
                room = rooms[i];
                break;
            }
        }
        if (room != null) {
            info = "Комната: " + roomNumber + " количество спальных мест: " + room.getQuantity() + " WIFI: " + room.isWifi() + ", WC: " + room.isWc() + " EAT: " + room.isEat();
        }
        System.out.println(info);
    }
}
