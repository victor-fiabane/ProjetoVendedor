package br.ulbra.classe;

/**
 *
 * @author 
 */
public class Vendedor {
    private String nome;
    private double meta;
    private double totalVend;
    
    
    public Vendedor(){
        
    }
    
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getMeta() {
        return meta;
    }
    public void setMeta(double meta) {
        this.meta = meta;
    }
    public double getTotalVend() {
        return totalVend;
    }
    public void setTotalVend(double totalVend) {
        this.totalVend = totalVend;
    }
    /*Da pra fazer tudo como se fosse sem programação a obj, a difenreça é que tem que fazer dentro de um metodo.
    Fique atento a metodos mostrados tipo calcular ou coisas do tipo. Geralmente metodos a obj até o momento envolvem if.
    Consultar o material de AulaIfElse caso de panico.*/
    public double calcularComissao(double valorVend){
        double comissao=0, metaA = this.meta, percentual=0;
        percentual = valorVend/metaA;
        if(percentual < 0.5){
            comissao = valorVend * 0.01;
        }else if(percentual >= 0.5 && percentual <= 0.75){
            comissao = valorVend * 0.025;
        }else if(percentual > 0.75 && percentual <= 1){
            comissao = valorVend * 0.035;
        }else{
            comissao = valorVend * 0.05;
        }
        return comissao;
    }    
    //Metodo toString, btn direito e to Strirng, imprime os dados na tela.
    @Override
    public String toString() {
        return "Vendedor" + "nome=" + nome + ", meta=" + meta + ", totalVend=" 
                + totalVend + "Comissão=" + calcularComissao(totalVend);
    }
    
    
}
