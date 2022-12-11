import java.util.Scanner;
public class DataPorExtenso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o dia: ");
        int dia = sc.nextInt();
        System.out.print("Digite o mês: ");
        int mes = sc.nextInt();
        System.out.print("Digite o ano: ");
        int ano = sc.nextInt();

        System.out.println("Sua data formatada: "+data(dia, mes, ano));

        sc.close();

    }
    public static String data(int dia, int mes, int ano) {
        String[] meses = {"Janeiro","Fevereiro","Março","Abril",
                "Maio", "Junho","Julho","Agosto","Setembro",
                "Outubro","Novembro","Dezembro"};
        String mesExtenso = meses[mes-1];
        String dataFormatada;
        if(dia <= 31 & dia > 0 & mes <= 12 & mes > 0 & (Integer.toString(ano)).length() == 4) {
            dataFormatada = dia + " de " + mesExtenso + " de " + ano;
            if(mes == 2 & dia > 28 & ano%4 != 0) {
                System.out.println("Fevereiro só possui 28 dias!");
                dataFormatada = null;
            }else if (mes == 2 & dia > 29 & ano%4 == 0) {
                System.out.println("Fevereiro só possui 29 dias!");
                dataFormatada = null;
            }
        }
        else {
            dataFormatada = null;
        }
        return dataFormatada;
    }
}
