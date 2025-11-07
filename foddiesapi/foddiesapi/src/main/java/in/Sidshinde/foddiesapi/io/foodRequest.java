package in.Sidshinde.foddiesapi.io;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
 

@Data
@AllArgsConstructor
@NoArgsConstructor
public class foodRequest {

  private String name;
  private String description;
  private double price;
  private String category;

}
