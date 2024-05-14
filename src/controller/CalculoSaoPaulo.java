package controller;

import model.Imovel;

public class CalculoSaoPaulo implements ICalculo{
    
    @Override
    public float calcularImposto(Imovel imovel) {
        return (imovel.getArea()*10)+(imovel.getNumComodos()*2);
        
    }
}
