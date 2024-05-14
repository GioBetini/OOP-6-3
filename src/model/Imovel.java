package model;

public class Imovel {
    private int numComodos;
    private int numQuartos;
    private float area;
    private float areaGaragem;
    private int idade;
    
    public Imovel(){
        super();
    }
    public int getNumComodos() {
        return numComodos;
    }
    public void setNumComodos(int numComodos) {
        this.numComodos = numComodos;
    }
    public int getNumQuartos() {
        return numQuartos;
    }
    public void setNumQuartos(int numQuartos) {
        this.numQuartos = numQuartos;
    }
    public float getArea() {
        return area;
    }
    public void setArea(float area) {
        this.area = area;
    }
    public float getAreaGaragem() {
        return areaGaragem;
    }
    public void setAreaGaragem(float areaGaragem) {
        this.areaGaragem = areaGaragem;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    @Override
    public String toString(){
        return "Imóvel:\nÁrea: "+area+"m2\n"+"Área da garagem: "+areaGaragem+"m2\n"+numComodos+" com "+numQuartos+"\n"+idade+" anos";
    }
    
}
