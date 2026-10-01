package io.github.liviafreitas.central156_api.status;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatusControllerTest {
    @Test
    void deveResponderStatusOk(){
        StatusController controller = new StatusController();
        StatusResponse resposta = controller.status();
        assertEquals("ok", resposta.status());
    }
}
