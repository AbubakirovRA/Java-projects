package OOP.Workshops.WP5;

public class Program {
    public static void main(String[] args) {
        ChatRoom chat = new ChatRoom("Чат");
        User user1 = new User("Рустем");
        User user2 = new User("Сергей");
        User user3 = new User("Владимир");
        chat.appendToChat(user1);
        chat.appendToChat(user2);
        chat.appendToChat(user3);

        chat.sendMessage(user1, "Всем привет!");
        System.out.println(chat.getMessages().size());
        System.out.println(user2.getStatus());
    }
}