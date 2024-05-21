import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo ("Curso Java");
        curso1.setDescricao ("Curso de Programação");
        curso1.setCargaHoraria (40);

        Curso curso2 = new Curso();
        curso2.setTitulo ("Curso HTML");
        curso2.setDescricao ("Curso de Programação");
        curso2.setCargaHoraria (20);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo ("Mentoria Java");
        mentoria1.setDescricao ("Orientação sobre carreira");
        mentoria1.setData (LocalDate.now());

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo ("Mentoria HTML");
        mentoria2.setDescricao ("Orientação sobre carreira");
        mentoria2.setData (LocalDate.now());

        System.out.println (curso1);
        System.out.println (curso2);
        System.out.println (mentoria1);
        System.out.println (mentoria2);


    }
}