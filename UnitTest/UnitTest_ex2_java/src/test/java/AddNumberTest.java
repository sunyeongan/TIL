import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddNumberTest {

    @Test
    public void multiply() {
        AddNumber addNumber =new AddNumber();
        assertEquals(addNumber.add(8,9) , 17);
    }

    @Test
    public void testMultiply() {
        AddNumber addNumber = new AddNumber();
        assertEquals(addNumber.add(2,3,4), 20);
    }
}