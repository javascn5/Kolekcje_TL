package com.sda.git;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

//        List<String> lista = new ArrayList<>();
//
//        lista.add("Jan");
//        lista.add("Maciej");
//        lista.add("Tadeusz");
//
//        System.out.println("Rozmiar" + lista.size());
//
//        lista.add("Mateusz");
//        lista.add("Karol");
//        System.out.println("Rozmiar" + lista.size());
//
//        //przeliterowanie po liscie, na podstawie petli for each:
//        for (String imie: lista){
//            System.out.println("imie: " + imie);
//        }
//        for(int i=0; i<lista.size(); i++){
//            System.out.println(lista.get(i));
//        }
//
//        lista.remove("Jan");
//        lista.remove(0);
//try {
//    String imie = lista.get(55);
//    System.out.println("Element o indeksie 2: " + imie);
//}catch  (IndexOutOfBoundsException e){
//    System.out.println("za daleko!");
//    e.printStackTrace();
//}
//
//
//        lista.clear(); // usuwanie wszystkich elementow listy
//
//        System.out.println(lista);

      User user1 = new User("piotr", "nowak", 39);
      User user2 = new User("ktos", "cos", 33);

        List<User> lista = new ArrayList<>();
        lista.add(user1);
        lista.add(user2);

        for(int i=0; i<lista.size(); i++){
            System.out.println(lista.get(i).getName()+ " " + lista.get(i).getLastname() + " " + lista.get(i).getAge());
        }
    }
}
