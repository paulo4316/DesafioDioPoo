import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Bootcamp;
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

        /* System.out.println (curso1);
        System.out.println (curso2);
        System.out.println (mentoria1);
        System.out.println (mentoria2);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Concluidos Camila:" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());

        System.out.println("---------------");

        Dev devJoao = new Dev();
        devCamila.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());







    }
}