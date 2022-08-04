package OOP.Workshops.WP5;

import java.util.ArrayList;
import java.util.List;

public abstract class Chat extends Messenger{
    List<Chat> chatRooms = new ArrayList<>(); //чаты

    abstract void appendToChat(User user);
}
