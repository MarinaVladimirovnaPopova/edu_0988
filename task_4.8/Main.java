import java.util.Scanner;
/*
 *  ***Гостиница***
 *  1) Гостиница
 *  2) Номера (кол-во мест(1-3), сан.узел(есть/нет), питаение(есть/нет),
 * wifi(есть/нет), свободен/занят)
 *
 *   *Задание для лабораторной работы №4*
 *   +Освободить комнату
 *   Вывести свойства комнаты
 *   Показать комнаты с WiFi
 *   Показать комнаты с WC
 *   Показать комнаты с Eat
 *   Показать комнаты по кол-ву спальных мест
 *   +-Отобразить список команд
 * */
public class Main {
    public static void main(String[] args) {
        Room[] rooms = {
                new Room((byte) 1,false,false,true,(byte) 11),
                new Room((byte) 2,true,true,false,(byte) 12),
                new Room((byte) 1,false,true,true,(byte) 13),
                new Room((byte) 3,true,false,false,(byte) 21),
                new Room((byte) 2,false,false,false,(byte) 22),
                new Room((byte) 1,true,true,true,(byte) 23),
                new Room((byte) 3,false,true,false,(byte) 31),
                new Room((byte) 3,true,true,false,(byte) 32),
                new Room((byte) 1,false,false,true,(byte) 33),
        };
        Hotel hotel = new Hotel(rooms);
        Scanner scanner = new Scanner(System.in);
        String command;
        System.out.println("Введите нужную команду: \n- показать свободные комнаты: getFreeRooms\n" +
                "- забронировать комнату: reserveRoom\n- освободить комнату: setFreeRoom\n" +
                "- показать характеристики комнаты: showRoom\n- количество спальных мест: RoomsQuantity\n" +
                "- комнаты с наличием WC^ RoomsWC\n- комнаты с питанием: RoomsEat\n " +
                "- выход из программы: exit");
        while (true){

            command = scanner.nextLine();
            if(command.equals("getFreeRooms")){
                hotel.getFreeRooms();
            }else if(command.equals("reserveRoom")){
                System.out.print("Введите номер комнаты для бронирования: ");
                byte roomNumber = (byte) scanner.nextInt();
                hotel.reserveRoom(roomNumber);

            }else if(command.equals("setFreeRoom")){
                System.out.print("Введите номер освободившейся комнаты: ");
                byte roomNumber = (byte) scanner.nextInt();
                hotel.setFreeRoom(roomNumber);

           }else if(command.equals("showRoom")){
                System.out.print("Введите номер интересующей Вас комнаты: ");
                byte roomNumber = (byte) scanner.nextInt();
                hotel.showRoom(roomNumber);

            }else if(command.equals("RoomsQuantity")){
                System.out.print("Введите количество спальных мест (1-3): ");
                byte quantity = scanner.nextByte();
                hotel.RoomsQuantity((quantity) scanner.nextInt());

            }else if(command.equals("RoomsWC")){
                  hotel.RoomsWC();

            }else if(command.equals("RoomsEat")){
                  hotel.RoomsEat();

            }else if (command.equals("exit")){
                break;
            }
            else System.out.println("Такой команды нет, см. список команд");
        }

    }
}
