package com.marcusbiel.javacourse.lesson13;

import org.junit.jupiter.api.Test;

public class CarServiceTest {

    @Test
    public void shouldDemonstrateLogging(){
        CarService carService = new CarService();
        carService.process("BMW");
    }
}
