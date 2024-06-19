import java.time.LocalDate;

public class Curso extends Conteudo{
  private String titulo;
   private String descricao;
   private LocalDate data;
   

   
   
   public LocalDate getData() {
     return data;
   }

   public void setData(LocalDate data) {
     this.data = data;
   }
      @Override
   public String toString() {
    return "Curso{" +  
    "titulo='" + titulo + '\ ''+
    ", descricao='" + descricao +'\''+
    ", cargaHoraria=" + cargaHoraria+
    '}';
   }

}
