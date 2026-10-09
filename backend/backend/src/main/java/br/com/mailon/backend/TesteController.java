
package br.com.mailon.backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TesteController {

    @GetMapping("/api/ola")
    public String ola() {
        return "Meu primeiro endpoint Java!";
    }
}