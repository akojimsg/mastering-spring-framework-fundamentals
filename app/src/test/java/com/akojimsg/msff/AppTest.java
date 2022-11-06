package com.akojimsg.msff;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class AppTest {
    @Test
    public void testApp() {
        Exception exception = Assertions.assertThrows(Exception.class, () -> {
            App.main(null);
        });

        Assertions.assertTrue(exception.getMessage().contains("org.xml.sax.SAXParseException"));
    }
}
