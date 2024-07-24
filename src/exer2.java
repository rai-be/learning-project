import java.util.Objects;

public class exer2 {
        public static void main(String[] args) {{

            String[] nomes = {"asking alexandria", "Pink Floyd", "aha", "beatles"};
            String[][] notas = {
                    {"V", "F", "V", "F", "V"},
                    {"V", "F", "F", "F", "V"},
                    {"F", "F", "F", "V", "F"},
                    {"F", "V", "V", "F", "V"}
            };

            for(int indice = 0; indice < nomes.length; indice++){
                int contagem = 0;
                String nome = nomes[indice];
                String[] notasEspecificas = notas[indice];
                System.out.println("As notas do "+nome+" são"+"\n"+notasEspecificas[0]+" "+notasEspecificas[1]+" "
                        +notasEspecificas[2]+" "+notasEspecificas[3]+" "+notasEspecificas[4]
                );

                for (String notasEspecifica : notasEspecificas) {
                    if (Objects.equals(notasEspecifica, "V")) {
                        contagem++;
                    }
                }
                System.out.println("Contagem das notas positivas: "+contagem);

                if(contagem*100/5 >= 50){
                    System.out.println("Aluno aprovado"+"\n___________________________");
                }else {
                    System.out.println("Aluno reprovado"+"\n___________________________");
                }
            }

        }
    }
}
