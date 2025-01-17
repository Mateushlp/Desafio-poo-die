import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;

public class Dev {
  private String nome;
  private Set<Conteudo> conteudoInscritos = new LinkedHashSet<>();
  private Set<Conteudo> conteudoConcluidos = new LinkedHashSet<>();

  public void inscreverBootcamp(Bootcamp bootcamp) {
    this.conteudoInscritos.addAll(bootcamp.getConteudos());
    bootcamp.getDevsInscritos().add(this);
  }

  public void progredir() {
    Optional<Conteudo> conteudo = this.conteudoInscritos.stream().findFirst();
    if (conteudo.isPresent()) {
      this.conteudoConcluidos.add(conteudo.get());
      this.conteudoInscritos.remove(conteudo.get());
    } else {
      System.err.println("Voce nao esta matriculado em nenhum conteudo!");
    }
    }

    public double calcuarTotalXp() {
      this.conteudoConcluidos.stream().mapToDouble(conteudo: :calcuarTotalXp.sum();

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
