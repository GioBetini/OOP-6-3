import controller.CalculoBeloHorizonte;
import controller.CalculoCuritiba;
import controller.CalculoPortoAlegre;
import controller.CalculoSaoPaulo;
import controller.ICalculo;
import model.Imovel;

public class App {
    public static void main(String[] args) throws Exception {
        Imovel imovel = new Imovel();
        imovel.setArea(40);
        imovel.setAreaGaragem(10);
        imovel.setNumComodos(5);
        imovel.setNumQuartos(2);
        imovel.setIdade(15);

        ICalculo calculo = new CalculoSaoPaulo();
        System.out.println("Imposto do imóvel em SP:\nR$"+calculo.calcularImposto(imovel));
        
        calculo = new CalculoBeloHorizonte();
        System.out.println("Imposto do imóvel em BH:\nR$"+calculo.calcularImposto(imovel));
    
        calculo = new CalculoPortoAlegre();
        System.out.println("Imposto do imóvel em Porto Alegre com garagem:\nR$"+calculo.calcularImposto(imovel));
        imovel.setAreaGaragem(0);
        System.out.println("Imposto do imóvel em Porto Alegre sem garagem:\nR$"+calculo.calcularImposto(imovel));
    
        calculo = new CalculoCuritiba();
        System.out.println("Imposto do imóvel de "+ imovel.getIdade()+ " anos em Curitiba:\nR$"+calculo.calcularImposto(imovel));
        imovel.setIdade(21);
        System.out.println("Imposto do imóvel de "+ imovel.getIdade()+ " anos em Curitiba:\nR$"+calculo.calcularImposto(imovel));
        imovel.setIdade(51);
        System.out.println("Imposto do imóvel de "+ imovel.getIdade()+ " anos em Curitiba:\nR$"+calculo.calcularImposto(imovel));
    
    
    }
}
