import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("curso java dio");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso java OO");
        curso2.setDescricao("curso java dio");
        curso2.setCargaHoraria(12);

//        //polimorfismo
//        Curso conteudo1 = new Curso();
//        curso1.setTitulo("curso java");
//        curso1.setDescricao("curso java dio");
//        curso1.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp java dev");
        bootcamp.setDescricao("descrição");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("João");
        dev1.increverBootcamp(bootcamp);
        System.out.println("Conteudos incritos" + dev1.getConteudosInscritos());
        System.out.println("Conteudos concluidos" + dev1.getConteudosConcluidos());
        System.out.println("Xp" + dev1.calcularTotalXp());

        System.out.println("--------------------------");

        Dev dev2 = new Dev();
        dev2.setNome("Maria");
        dev2.increverBootcamp(bootcamp);
        System.out.println("Conteudos incritos" + dev2.getConteudosInscritos());
        dev2.progredir();
        System.out.println("Conteudos concluidos" + dev2.getConteudosConcluidos());
        System.out.println("Conteudos incritos" + dev2.getConteudosInscritos());
        System.out.println("Xp" + dev2.calcularTotalXp());

    }
}
