package controller;

import model.Imovel;

public class CalculoBeloHorizonte implements ICalculo{
    
    @Override
    public float calcularImposto(Imovel imovel) {
        return (imovel.getArea()*7)+(imovel.getNumQuartos()*4);
    }
}
