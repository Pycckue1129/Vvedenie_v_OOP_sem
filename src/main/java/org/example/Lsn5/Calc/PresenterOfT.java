package org.example.Lsn5.Calc;

public class PresenterOfT<T extends CalcModel> {
    View view;
    Model model;

    public PresenterOfT(T m, View v) {
        model = m;
        view = v;
    }

    public void buttonClick(){
        int a = view.getValue("a: ");
        int b = view.getValue("b: ");
        int z = view.getValue("z: ");
        model.setX(a);
        model.setY(b);
        model.setY(z);
        int result = model.result();
        view.print(result, "Sum: ");
    }
}
