public class CaixaEletronico {
    public static void main(String[] args) {
        
         //condicional simples 

       double saldo = 25.0;
       double valorSolicitado = 27.0;

       if(valorSolicitado < saldo)
        saldo = saldo - valorSolicitado;
       
        else
        System.out.println("saldo insuficiente");

        System.out.println( "Seu saldo atual é:" + saldo ) ;

        

    }
}
