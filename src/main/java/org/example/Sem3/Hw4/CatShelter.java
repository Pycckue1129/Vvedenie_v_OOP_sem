package org.example.Sem3.Hw4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CatShelter implements Iterable<Cat> {
    private List<Cat> cats;

    public CatShelter(List<Cat> cats) {
        this.cats = cats;
    }


    public void getSize() {
        System.out.println("Size = " + cats.size());
    }

    @Override
    public Iterator<Cat> iterator() {
        return new CatIterator(cats);
    }

    public CatShelter() {
    }

    public List<Cat> getCats() {
        return cats;
    }

    public void setCats(List<Cat> cats) {
        this.cats = cats;
    }


    public void sort(CatComparator comparator){
        List<Cat> sortedCats = new ArrayList<>(cats);
        Collections.sort(sortedCats, comparator);
        this.cats = sortedCats;
    }
    public void print() {
        System.out.println("Sorted");
        for(Cat cat : cats){
            System.out.println(cat);
        }
    }
}
