import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import static org.junit.jupiter.api.Assertions.*;


class MainTest {

    HashMap userHashMap = new HashMap<>();

    @Test
    void addHash() {
        Address address = new Address("1-69/3", "Washington St.", "Washington", "USA", 534043);
        User user = new User("John", "Doe", 123, address);

        String result = Main.addHash(1, user, userHashMap);

        assertEquals("Added Successfully", result);
        assertTrue(userHashMap.containsKey(1));
        assertEquals(user, userHashMap.get(1));

    }

    @Test
    void removeHash() {
        Address address = new Address("1-69/3", "Washington St.", "Washington", "USA", 534043);
        User user = new User("John", "Doe", 123, address);

        userHashMap.put(1, user);
        String result = Main.removeHash(1, userHashMap);

        assertEquals("Removed Successfully", result);
        assertFalse(userHashMap.containsKey(1));
    }

    @Test
    void printHash() {
        Address address = new Address("1-69/3", "Washington St.", "Washington", "USA", 534043);
        User user = new User("John", "Doe", 123, address);

        userHashMap.put(1, user);

        // Redirect System.out to capture printed output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        Main.printHash(1, userHashMap);

        // Reset System.out
        System.setOut(System.out);

        String expectedOutput = "1:" + user.toString() + System.lineSeparator();
        assertEquals(expectedOutput, outputStream.toString());
    }
}