import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String nome = "Deivid";
        String tipoDeConta = "Corrente";
        Double saldoDaConta = 3700.00;
        Double saldoRestantaConta = 0;
        

        System.out.println("****************************");
        System.out.println("\nNome do Cliente: " +nome);
        System.out.println("Tipo de conta: " + tipoDeConta);
        System.out.println("Saldo Atual: " + saldoDaConta);
        System.out.println("\n****************************");
        
        String menu = """
            **Digite sua opcao **
            1 - Consultar Saldo
            2 - Transferir valor
            3 - Receber valor
            4 - Sair

            """;

            String retornoMenu = """
                **Deseja Retornar para o menu ?
                1 - Sim
                2 - Nao
             """;

        Scanner leitura = new Scanner(System.in);
        

        int opcao = 0;
        while (opcao != 4 ){
            System.out.println(menu);
            opcao = leitura.nextInt();

            //mostrar saldo e remover o menu e exibir opcoes de retorno.
            if (opcao == 1){
                System.out.println("Seu saldo é: " +saldoDaConta);
                
            } else if (opcao == 2){
                System.out.println("Qual o valor que deseja transferir: ");
                double valor = leitura.nextDouble();
                if (valor >= saldoDaConta){
                    System.out.println("Voce nao possui saldo suficiente: " +saldoDaConta);
                } else {
                    System.out.println("Valor enviado: " +valor);
                    saldoRestantaConta = saldoDaConta - valor;
                    System.out.println("Seu Saldo Atual é de: " +saldoRestantaConta);
                }
            }
        }
    }

}
