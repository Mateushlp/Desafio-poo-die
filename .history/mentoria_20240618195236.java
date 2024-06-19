import java.time.LocalDate;

public class Mentoria extends Conteudo{

  private LocalDate data;
   
  @ove

   public Mentoria() {
   }

   
   public LocalDate getData() {
     return data;
   }

   public void setData(LocalDate data) {
     this.data = data;
   }
   
   @Override
   public String toString() {
    return "Mentoria{" +  
    "titulo='" + titulo + \ ''+
    ", descricao='" + descricao +'\''+
    ", data=" + data+
    '}';
   }
}