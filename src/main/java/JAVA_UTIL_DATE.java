import java.util.Date;// Importando a clase Date
import java.util.Calendar;//Importando a classe calendar
public class JAVA_UTIL_DATE {

    public static void main(String args[]) {
        //Utilizando a classe Date
        Date dataAtual=  new Date();// Instanciando o objeto dataAtual
        System.out.println("Utilizando a classe Date\n");
        System.out.println("Data atual: "+ dataAtual);//Mostrando a data
        System.out.println("\n\n\nUtilizando a classe Calendar\n");


        //Utilizando a classe Calendar
        Calendar agora = Calendar.getInstance();
        System.out.println("A data correta é "+ agora.getTime());
        agora.add(Calendar.DATE,-45);
        System.out.println("45 dias atras: "+agora.getTime());
        agora.add(Calendar.DATE,35);
        System.out.println("35 dias depois: "+agora.getTime());
        agora.add(Calendar.DATE,10);
        System.out.println("10 dias após: "+ agora.getTime());




        //Exemplo de aplicação
        // Um cliente tem 10 dias para pagar um boleto,
        // Caso a data caia em um sabado ou domingo, ele poderá pagar na segunda seguinte
        // Calcule quantos dias a partir de agora o cliente tem para pagar a fatura
        int diasParaPagar = 7;
        System.out.println("\n\n\n Solução:\n");
        agora= Calendar.getInstance();
        System.out.println("Hoje é: "+agora.getTime());
        int diaPag=agora.DAY_OF_WEEK+diasParaPagar;

        while(diaPag>7){
            diaPag+=-7;
        }
        if(diaPag>1&&diaPag<7){
            System.out.println("Tem 10 dias para pagar");
            agora.add(Calendar.DATE,diasParaPagar);
        }else if(diaPag==1){
            System.out.println("Caiu no domingo, tera 11 dias para pagar");
            agora.add(Calendar.DATE,diasParaPagar+1);
        }else if(diaPag==7){
            System.out.println("Caiu no sábado, tera 12 dias para pagar");
            agora.add(Calendar.DATE,diasParaPagar+2);
        }
        System.out.println("Data de pagamento: "+ agora.getTime());
        System.out.println(diaPag);
    }

}
