package br.ulbra.classe;

/**
 *
 * @author 
 */
public class Usuario {
    
    public static void main(String[] args){
     Vendedor vender = new Vendedor();
     vender.setNome("bruh");
     vender.setMeta(1000);
     vender.setTotalVend(600);
     vender.calcularComissao(vender.getTotalVend());
     System.out.println(vender.toString());    
    }
   
    
}
