package com.greenfoxacademy.springstart.controllers;

import java.util.Random;

public class ProduceHello {

    String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
            "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
            "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
            "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};

    String color;
    String size;


    public ProduceHello() {

        Random random = new Random();
        int nextInt = random.nextInt(0xffffff + 1);
        int chance = (int)(Math.random() * 200 + 15);

        this.color = String.format("#%06x", nextInt);
        this.size = Integer.toString(chance).concat("px");
    }

    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }

    public String getHellos(int id) {
        return hellos[id];
    }
}
