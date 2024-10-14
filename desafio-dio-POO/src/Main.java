import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descricao curso de Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Python");
        curso2.setDescricao("descricao curso de Python");
        curso2.setCargaHoraria(6);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Html");
        mentoria.setDescricao("descricao mentoria Html");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp de desenvolvimento Java");
        bootcamp.setDescricao("Descricao de Bootcamp de desenvolvimento na liguagem Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devIsaque = new Dev();
        devIsaque.setNome("Isaque");
        devIsaque.inscreverBootcamp(bootcamp);
        System.out.println("---");
        System.out.println("Conteúdos inscritos Isaque: " + devIsaque.getConteudosInscritos());
        System.out.println("XP: " + devIsaque.calcularTotalXp());
        devIsaque.progredir();
        System.out.println("---");
        System.out.println("Conteúdos inscritos Isaque: " + devIsaque.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Isaque: " + devIsaque.getConteudosConcluidos());
        System.out.println("XP: " + devIsaque.calcularTotalXp());
        devIsaque.progredir();
        System.out.println("---");
        System.out.println("Conteúdos inscritos Isaque: " + devIsaque.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Isaque: " + devIsaque.getConteudosConcluidos());
        System.out.println("XP: " + devIsaque.calcularTotalXp() + "\n");

        System.out.println("----------\n");

        Dev devDavi = new Dev();
        devDavi.setNome("Davi");
        devDavi.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Davi: " + devDavi.getConteudosInscritos());
        System.out.println("XP: " + devDavi.calcularTotalXp());
        devDavi.progredir();
        System.out.println("---");
        System.out.println("Conteúdos inscritos Davi: " + devDavi.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Davi: " + devDavi.getConteudosConcluidos());
        System.out.println("XP: " + devDavi.calcularTotalXp() + "\n");
    }
}
