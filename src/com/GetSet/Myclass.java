package com.GetSet;

class Myclass {
    private int alpha;
    public int beta;
    int gamma;

    /* Методы доступа к перменной alpha.
    Члены класса могут обращаться к закрытым членам того же класса.
     */
    void setAlpha(int a){
        alpha = a;
    }

    int getAlpha(){
        return alpha;
    }


}
