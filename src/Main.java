import javax.sound.sampled.ReverbType;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // 1. Converter números para string binária... Exemplo: 6 => "110"
        // 2. Inverter os dados da String... Exemplo: "110" => "011"
        // 3. Converter de volta para um número inteiro... Exemplo: "011" => 3

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        List<String> strBinaria = nums.stream().map(Integer::toBinaryString).toList();
        System.out.println(strBinaria + " <= String binárias");

        List<String> invertido = strBinaria.stream().map(x -> new StringBuilder(x).reverse().toString()).toList();
        System.out.println(invertido + " <= String binárias invertidas");

        List<String> reverso = invertido.stream().map(x -> new StringBuilder(x).reverse().toString()).toList();
        System.out.println(reverso + " <= String revertida");

    }
}