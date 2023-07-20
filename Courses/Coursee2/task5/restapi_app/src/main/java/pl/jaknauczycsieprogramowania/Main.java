package pl.jaknauczycsieprogramowania;

import com.fasterxml.jackson.core.JsonProcessingException;

public class Main {

    public static void main(String[] args) throws JsonProcessingException {
        DatabaseClient databaseClient = new DatabaseClient();

        databaseClient.clearDatabase();

        System.out.println("Wywołujemy metodę getUsers()");
        System.out.println(databaseClient.getUsers());

        System.out.println();
        System.out.println("-----------------");
        System.out.println("Tworzymy użytkowników kamilbrzezinski i kamilb");
        System.out.println("Wywołujemy metodę addUser() dla obu tych użytkowników");
        System.out.println("Wywołujemy metodę getUsers()");
        User user1 = new User("kamilbrzezinski", 31, "Kamil Brzeziński");
        User user2 = new User("kamilb", 31, "Kamil B.");
        databaseClient.addUser(user1);
        databaseClient.addUser(user2);
        System.out.println(databaseClient.getUsers());

        System.out.println();
        System.out.println("-----------------");
        System.out.println("Wywołujemy metodę getUser(kamilbrzezinski)");
        System.out.println(databaseClient.getUser("kamilbrzezinski"));

        System.out.println();
        System.out.println("-----------------");
        System.out.println("Wywołujemy metody deleteUser(kamilbrzezinski)");
        System.out.println("Wywołujemy metodę getUsers()");
        databaseClient.deleteUser("kamilbrzezinski");
        System.out.println(databaseClient.getUsers());


        System.out.println();
        System.out.println("-----------------");
        System.out.println("Wywołujemy metodę getPosts()");
        System.out.println(databaseClient.getPosts());

        System.out.println();
        System.out.println("-----------------");
        System.out.println("Tworzymy dwa posty");
        System.out.println("Wywołujemy metodę addPost() dla obu tych postów");
        System.out.println("Wywołujemy metodę getPosts()");
        Post post1 = new Post("dominik", "Super film, daję łapkę w górę");
        Post post2 = new Post("mariusz", "Mega kanał, daję suba");
        databaseClient.addPost(post1);
        databaseClient.addPost(post2);
        System.out.println(databaseClient.getPosts());

        System.out.println();
        System.out.println("-----------------");
        System.out.println("Wywołujemy metodę deletePost(1)");
        System.out.println("Wywołujemy metodę getPosts()");
        databaseClient.deletePost(1);
        System.out.println(databaseClient.getPosts());

    }
}
