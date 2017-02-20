package list.student;

import java.sql.Date;

public class City {

  private String name;
  private int population;


  public City(String name, int population) {
    this.name = name;
    this.population = population;

  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }

    City city = (City) obj;

    if (population != city.population) {
      return false;
    }
    return name.equals(city.name);
  }

  @Override
  public int hashCode() {
    int result = name.hashCode();
    result = 31 * result + population;
    return result;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return "City{"
        +
        "name='"
        +
        name
        +
        '}';
  }
}
