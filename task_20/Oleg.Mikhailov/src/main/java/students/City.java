package students;

public class City {

  String country;
  String cityName;

  public String getCountry() {
    return country;
  }

  public String getCityName() {
    return cityName;
  }

  public City(String country, String cityName) {
    this.country = country;
    this.cityName = cityName;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    if (obj == this) {
      return true;
    }
    if (obj.getClass() != this.getClass()) {
      return false;
    }

    City city = (City) obj;

    if (!city.getCountry().equals(this.country) || !city.getCityName().equals(this.cityName)) {
      return false;
    }

    return true;
  }

  @Override
  public String toString() {
    return country + " : " + cityName;
  }


  public int hashCode() {
    assert false : "hashCode not designed";
    return 42;
  }
}
