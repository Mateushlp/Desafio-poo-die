import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String [] args){
Curso curso1 = new Curso();

curso1.setTitulo("curso java");
curso1.setDescricao("descricao curso java");
curso1.setCargaHoraria(8);

Curso curso2 = new Curso();
curso2.setTitulo("curso java");
curso2.setDescricao("descriçao curso java");
curso2.setCargaHoraria(8);

Conteudo conteudo = new Curso();
Conteudo Conteudo1 = new Mentoria();

Mentoria mentoria = new Mentoria();
mentoria.setTitulo("mentoria de java");
mentoria.setDescricao("descricao mentoria java");
mentoria.setData(LocalDate.now);

/*System.out.println(curso1);
System.out.println(curso2);
System.out.println(mentoria);*/

Bootcamp bootcamp = new bootcamp();
bootcamp.setNome("Bootcamp Java Developer");
bootcamp.setDescricao("descriçao Bootcamp Java Developer");
bootcamp.getConteudos().add(curso1);
bootcamp.getConteudos().add(curso2);
bootcamp.getConteudos().add(mentoria);

Dev devMateus = new Dev();
devMateus.setNome("Mateus");
System.out.println("Conteudos Inscritos" + devMateus.getConteudoInscritos());


Dev devPaulo = new Dev();
devPaulo.setNome("Paulo");
System.out.println("Conteudos Inscritos" + devPaulo.getConteudoInscritos());

  }
}