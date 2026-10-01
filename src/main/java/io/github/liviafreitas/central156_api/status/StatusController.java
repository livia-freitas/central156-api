package io.github.liviafreitas.central156_api.status;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {

    @GetMapping("/api/status")
    public StatusResponse status() {
        return new StatusResponse("central156-api", "ok");

    }
}