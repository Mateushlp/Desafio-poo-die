public class Conteudo {

  protected static final double XP_PADRAO = 10d;

  private String titulo;
  private String descricao;

  public abstract double calcularXp();

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }
  

  
}