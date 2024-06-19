import java.time.LocalDate;
import java.util.HashSet;

public class Bootcamp {

  private String nome;
  private String descricao;
  private final LocalDate dataInicial = LocalDate.now();
  private final LocalDate dataFinal = dataInicial.plusDays(45);
  private Set<Dev> devsInscritos = new HashSet<>();
  private Set<
}
