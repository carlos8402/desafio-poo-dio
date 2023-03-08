import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("Descrição do curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("js");
        curso2.setDescricao("descrição do curso de js");
        curso2.setCargaHoraria(5);

        Curso curso3 = new Curso();
        curso3.setTitulo("curso python");
        curso3.setDescricao("descrição do curso de python");
        curso3.setCargaHoraria(30);
        curso3.calcularXp();




        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de java");
        mentoria1.setDescricao("Descrição da mentoria de java");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp java develop");
        bootcamp.setDescricao("Descrição do bootcamp de java develop");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devEdu = new Dev();
        devEdu.setNome("Carlos Eduardo Rodrigues de Freitas");
        devEdu.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Edu" + devEdu.getConteudosIncritos());
        devEdu.progredir();
        devEdu.progredir();
        devEdu.progredir();
        System.out.println("Conteudos inscritos Edu" + devEdu.getConteudosIncritos());
        System.out.println("Conteudos concluidos Edu" + devEdu.getConteudosConcluidos());
        System.out.println("XP : " + devEdu.calcularTotalXp());


        Dev devJoao = new Dev();
        devJoao.setNome("Joao francisco");
        devJoao.inscreverBootcamp(bootcamp);
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("Conteudos inscritos Joao" + devJoao.getConteudosIncritos());
        System.out.println("Conteudos concluidos Joao" + devJoao.getConteudosConcluidos());



    }
}