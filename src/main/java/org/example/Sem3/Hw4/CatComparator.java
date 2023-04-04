package org.example.Sem3.Hw4;

import java.util.Comparator;

public class CatComparator implements Comparator<Cats> {

        private final String type;

        public CatComparator(String type) {
            this.type = type;
        }

        @Override
        public int compare(Cats o1, Cats o2) {
            switch (type) {
                case "weight" -> {
                    return o1.getWeight().compareTo(o2.getWeight());
                }
                case "age" -> {
                    return o1.getAge().compareTo(o2.getAge());
                }
            }
            return 0;
        }
}
