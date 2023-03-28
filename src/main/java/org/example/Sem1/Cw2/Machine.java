package org.example.Sem1.Cw2;

import java.util.ArrayList;

public interface Machine {
    Product getProduct(String name) throws IllegalStateException;
}
