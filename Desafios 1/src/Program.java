import java.util.Scanner; 
    
public class Program {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int entrada = leitor.nextInt();
        System.out.println("Número de meses: " + entrada);
        int mesada = 50;
        int saida = mesada * entrada;
        System.out.println("A quantidade de dinheiro guardado em " + entrada + " meses é " + saida);
        
        // TODO: Crie a condição necessária para que o sobrinho saiba quanto dinheiro irá juntar nos meses da entrada

    }
}