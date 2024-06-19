import java.util.LinkedHashSet;
import java.util.Objects;

public class Dev {
  private String nome;
  private Set<Conteudo> conteudoInscritos = new LinkedHashSet<>();
  private Set<Conteudo> conteudoConcluidos = new LinkedHashSet<>();

  public void inscreverBootcamp(Bootcamp bootcamp) {
    this.conteudoInscritos.addAll(bootcamp.getConteudos());
  }

  public void progredir() {
    this.Con
  }

  public void calcuarTotalXp() {
  }
  
  public void setNome(String nome) {
    this.nome = nome;
  }

  public Set<Conteudo> getConteudoInscritos() {
    return conteudoInscritos;
  }

  public Set<Conteudo> getConteudoConcluidos() {
    return conteudoConcluidos;
  }

  public void setConteudoConcluidos(Set<conteudo> conteudoConcluidos) {
    this.conteudoConcluidos = conteudoConcluidos;
  }
@Override
public boolean equals(Object o){
  if (this == o)
    return true;
    if (o == null || getClass()!= o.getClass()) return false;
    Dev dev = (Dev) o;
    return Objects.equals(nome, dev.nome) && Objects.equals(conteudoInscritos, dev.conteudoInscritos)
        && Objects.equals(o, dev);
}
  @Override
  public int hashCode() {
    return Objects.hash(nome, conteudoInscritos, conteudoConcluidos);
 }   

}