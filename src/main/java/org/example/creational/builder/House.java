package org.example.creational.builder;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter @Setter
public class House {
    private int rooms;
    private int kitchen;
    private int guestRoom;
    private int bathroom;
    private int bar;
    private int garage;


    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private House house = new House();

        public Builder rooms(int rooms) {
            house.rooms = rooms;
            return this;
        }

        public Builder kitchen(int kitchen) {
            house.kitchen = kitchen;
            return this;
        }

        public Builder bathroom(int bathroom) {
            house.bathroom = bathroom;
            return this;
        }

        public Builder garage(int garage) {
            house.garage = garage;
            return this;
        }

        public Builder bar(int bar) {
            house.bar = bar;
            return this;
        }

        public Builder guestRoom(int guestRoom) {
            house.guestRoom = guestRoom;
            return this;
        }

        public House build() {
            return house;
        }

    }

}
