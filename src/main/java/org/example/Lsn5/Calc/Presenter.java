package org.example.Lsn5.Calc;

public class Presenter {
    View view;
    Model model;

    public Presenter(Model m, View v) {
        model = m;
        view = v;
    }

    public void buttonClick(){
        int a = view.getValue("a: ");
        int b = view.getValue("b: ");
        int c = view.getValue("c: ");
        model.setX(a);
        model.setY(b);
        model.setZ(c);
        int result = model.result();
        view.print(result, "Sum: ");
    }
}
