import java.util.*;
public class Main {

    public static String addHash(int key,User u,HashMap userHashMap){
        userHashMap.put(key, u);
        return "Added Successfully";
    }

    public static String removeHash(int key,HashMap userHashMap){
        userHashMap.remove(key);
        return "Removed Successfully";
    }

    public static void printHash(int key,HashMap userHashMap){
        if (userHashMap.containsKey(key)) {
            Object value = userHashMap.get(key);
            System.out.println(key + ":" + value);
        } else {
            System.out.println("Key not found in the HashMap.");
        }
    }

    public static void main(String[] args) {
        Address add1 = new Address("1-69/3", "Washington St.", "Washington", "USA", 534043);
        Address add2 = new Address("4-82/1", "Mario St.", "Canada", "USA", 657382);
        Address add3 = new Address("3-71/4", "Parker's St.", "New Jersey", "USA", 606001);
        Address add4 = new Address("9-11/16", "Saint Louis St.", "New York", "USA", 514367);
        User u1 = new User("James", "Smith", 456, add1);
        User u2 = new User("John", "Doe", 178345, add2);
        User u3 = new User("Maria", "Joy", 4890, add3);
        User u4 = new User("Ben", "Due", 12, add4);

        HashMap<Integer, User> userHashMap = new HashMap<>();
        addHash(1, u1,userHashMap);
        addHash(2, u2,userHashMap);
        addHash(3, u3,userHashMap);
        addHash(4, u4,userHashMap);
        System.out.println("users in HashMap before removing");
        userHashMap.forEach((key, value) -> printHash(key,userHashMap));

        removeHash(4,userHashMap);
        System.out.println("users in HashMap after removing");
        userHashMap.forEach((key, value) -> printHash(key,userHashMap));

        }
    }