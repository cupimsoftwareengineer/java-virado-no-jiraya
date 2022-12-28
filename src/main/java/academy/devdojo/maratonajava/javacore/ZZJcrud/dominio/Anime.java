package academy.devdojo.maratonajava.javacore.ZZJcrud.dominio;

import academy.devdojo.maratonajava.javacore.ZZIjdbc.dominio.Producer;
import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class Anime {
  Integer id;
  String name;
  int episodes;
  Producer producer;
}
