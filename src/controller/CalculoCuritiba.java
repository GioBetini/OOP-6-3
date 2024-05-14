package controller;

import model.Imovel;

public class CalculoCuritiba implements ICalculo {

    @Override
    public float calcularImposto(Imovel imovel) {
        float imposto = imovel.getArea() * 5;
        if (imovel.getIdade() > 50) {
            return imposto + (3 * imovel.getIdade());
        } else if (imovel.getIdade() > 20) {
            return imposto + (2.5f * imovel.getIdade());
        } else {
            return imposto + (2 * imovel.getIdade());
        }

    }
}