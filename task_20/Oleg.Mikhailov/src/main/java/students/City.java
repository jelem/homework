package students;

public class City {

  String country;
  String city;

  public String getCountry() {
    return country;
  }

  public String getCity() {
    return city;
  }

  public City(String country, String city) {
    this.country = country;
    this.city = city;
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

    if (!city.getCountry().equals(this.country) || !city.getCity().equals(this.city)) {
      return false;
    }

    return true;
  }

  @Override
  public String toString() {
    return country + " : " + city;
  }


  public int hashCode() {
    assert false : "hashCode not designed";
    return 42;
  }
}
