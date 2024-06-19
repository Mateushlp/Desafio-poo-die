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

System.out.println(curso1);
System.out.println(curso2);

  }
}