package com.jonah;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jonah on 3/19/16.
 */
public class CarTest {

    @Test
    public void setModel() throws Exception {
        Car car = new Car();
        assertNull(car.getModel());
        car.setModel("foo");
        assertEquals("foo", car.getModel());
    }

    @Test
    public void getDoors() throws Exception {

    }

    @Test
    public void setDoors() throws Exception {

    }

    @Test
    public void getSeats() throws Exception {

    }

    @Test
    public void setSeats() throws Exception {

    }
}