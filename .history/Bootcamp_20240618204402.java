import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Bootcamp {

  private String nome;
  private String descricao;
  private final LocalDate dataInicial = LocalDate.now();
  private final LocalDate dataFinal = dataInicial.plusDays(45);
  private Set<Dev> devsInscritos = new HashSet<>();
  private Set<Conteudo> conteudo = new LinkedHashSet<>();

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
}

  public String getDescricao() {
    return descricao;
}

public void setDescricao(String descricao) {
  this.descricao = descricao;
}

public LocalDate getDataInicial() {
  return dataInicial;
}

public LocalDate getDataFinal() {
  return dataFinal;
}

public Set<Dev> getDevsInscritos() {
  return devsInscritos;
}

public void setDevsInscritos(Set<Dev> devsInscritos) {
  this.devsInscritos = devsInscritos;
}

public Set<Conteudo> getCOnteudos() {
  return conteudos;
}

public void setConteudos(Set<Conteudo> conteudos) {
  this.conteudos = conteudos;
}
@Deprecated


}
