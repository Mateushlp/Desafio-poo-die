import java.time.LocalDate;

public class Curso extends Conteudo{
  private String titulo;
   private String descricao;
   
   private LocalDate data;

   @Override
   public double calcularXp(){
    return XP_PADRAO * cargaHoraria;
   }

   public Curso(){
    
   }

   
   
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

      public String getTitulo() {
        return titulo;
      }

      public void setTitulo(String titulo) {
        this.titulo = titulo;
      }

      public String getDescricao() {
        return descricao;
      }

      public void setDescricao(String descricao) {
        this.descricao = descricao;
      }

}
