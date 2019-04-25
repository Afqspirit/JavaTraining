package com.This;
/*По сути this лучше не использовать в данном случае.
Ибо без него намного лучше читается код*/
public class Pwr {
    double b, val;
    int e;

    Pwr(double base, int exp){
        this.b = base;
        this.e = exp;

        this.val = 1;
        if (exp==0) return;
        for( ; exp>0; exp--) this.val = this.val * base;
    }

    double get_pwr() {
        return this.val;
    }
}
