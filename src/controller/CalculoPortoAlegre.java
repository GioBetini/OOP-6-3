package controller;

import model.Imovel;

public class CalculoPortoAlegre implements ICalculo {

    @Override
    public float calcularImposto(Imovel imovel) {
        if (imovel.getAreaGaragem() <= 0) {
            return imovel.getArea() * 8;
        } else {
            return imovel.getArea() * 7.5f + (imovel.getAreaGaragem() * 2.5f);
        }
    }
}
