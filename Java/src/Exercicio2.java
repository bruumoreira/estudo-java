import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {
	static Scanner teclado = new Scanner(System.in);
	@SuppressWarnings("unused")
	private static int Date;
 
    @SuppressWarnings("unused")
	public static void main(String args[]) {
    	
    	Date dataAtual = new Date();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String dataFormatada = dateFormat.format(dataAtual);
        
        //System.out.println("Informe a data: ");
		//Date = Integer.parseInt(teclado.nextLine());

		Date data =  new Date();
        Locale local = new Locale("pt","BR");
        DateFormat formato = new SimpleDateFormat("dd 'de' MMMM 'de' yyyy",local);
 
        System.out.println(formato.format(data));
		
		teclado.close();      
       
    }
    public static String NomeDoMes(int i, int tipo) {
        String mes[] = {"janeiro", "fevereiro", "março", "abril",
          "maio", "junho", "julho", "agosto", "setembro", "outubro",
          "novembro", "dezembro"};
        if (tipo == 0)
           return(mes[i-1]); 
        else return(mes[i-1].substring(0, 3)); 
      }
}
