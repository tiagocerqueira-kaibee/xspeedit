package fr.tiagocerqueira.services;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import fr.tiagocerqueira.domain.Box;

public class ServiceBoxTest {

    @Test
    @DisplayName("Testing the example of the readme")
    public void testExampleReadme() throws Exception {
        ServiceBox service = new ServiceBox();
        List<Box> boxes = service.toBoxes("163841689525773");
        assertEquals(8, boxes.size());
    }

}
