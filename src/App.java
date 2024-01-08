import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        double calculo = 0;

        for(int i = 0; i < a; i++){
            double nota = Double.parseDouble(br.readLine());
            double nota2 = Double.parseDouble(br.readLine());
            double nota3 = Double.parseDouble(br.readLine());

            calculo = (nota * 2 + nota2 * 3 + nota3 * 5) /10;
            System.out.printf("%.1f\n", calculo);
        }
        
    }
}
