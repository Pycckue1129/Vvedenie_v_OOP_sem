package org.example.Sem3.Hw4;

import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CatShelter cats = new CatShelter(List.of(new Cat(15, 10, "Barsik"),
                                                new Cat(4, 4, "Sharik"),
                                                new Cat(7, 6, "Persik")));


        Iterator<Cat> iterator1 = cats.iterator();
        cats.getSize();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }



        CatShelter shelter = new CatShelter(List.of(new Cat(15, 10, "Barsik"),
                                                    new Cat(7, 4, "Sharik"),
                                                    new Cat(4, 6, "Persik")));
        shelter.sort(new CatComparator("age"));
        shelter.print();
    }
}
