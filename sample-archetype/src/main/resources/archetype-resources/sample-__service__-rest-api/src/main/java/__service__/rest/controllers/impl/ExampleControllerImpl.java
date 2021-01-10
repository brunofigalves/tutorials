package pt.sample.${service}.rest.controllers.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.*;
import pt.sample.${service}.rest.controllers.ExampleController;

@RestController
@RequestMapping(path = "/")
public class ExampleControllerImpl implements ExampleController {

    Logger log = LogManager.getLogger(getClass());

    @GetMapping("/example")
    @Override
    public String getAll() {
        log.info("Get hello world!");

        return "Hello world!";
    }
}
