import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class PRIMER_AVANCETest {

    @Test
    void buscarPaciente() {

        String input = "567890123";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);


        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));


        PRIMER_AVANCE.buscarPaciente();

        assertTrue(outContent.toString().contains("Pedro Rodríguez"));


        System.setIn(System.in);
        System.setOut(System.out);
    }

}