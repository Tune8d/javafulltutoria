package com.marcusbiel.javacourse.lesson13;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


//https://youtu.be/grEKMHGYyns?si=keIVTAJz-qQ5Rr5k&t=13380
public class CarService {

    private final Logger log = LoggerFactory.getLogger(CarService.class);

    public void process(String input){
        //log.info("processing car:" + input); // simple String concatenation might take a lot of resources.
        log.debug("processing car: {}", input);

    }
}
