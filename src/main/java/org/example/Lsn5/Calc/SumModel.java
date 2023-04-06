package org.example.Lsn5.Calc;

public class SumModel extends CalcModel {

    public SumModel() {
        
    }
    // do_it
    @Override
    public int result() {
        return x + y + z;
    }

    @Override
    public void setX(int value) {
        super.x = value;
    }

    @Override
    public void setY(int value) {
        super.y = value;
    }

    @Override
    public void setZ(int value) {
        super.z = value;
    }
}
