package com.hillel.homework;


public class City implements Comparable<City> {
  private String cityName;
  private String country;

  private City(Builder builder) {
    this.cityName = builder.cityName;
    this.country = builder.country;
  }

  public static class Builder {
    private static final String NO_INFO = "no info";
    private String cityName = NO_INFO;
    private String country = NO_INFO;

    public Builder setCityName(String cityName) {
      if (cityName != null) {
        this.cityName = cityName;
      }
      return this;
    }

    public Builder setCountry(String country) {
      if (country != null) {
        this.country = country;
      }
      return this;
    }

    public City build() {
      return new City(this);
    }
  }

  @Override
  public boolean equals(Object object) {
    if (object == this) {
      return true;
    }
    if (object == null) {
      return false;
    }
    if (this.getClass() != object.getClass()) {
      return false;
    }
    City city = (City) object;
    if (!cityName.equals(city.cityName)) {
      return false;
    }
    return country.equals(city.country);
  }

  @Override
  public String toString() {
    return cityName + ", " + country;
  }

  public int compareTo(City object) {
    return cityName.compareTo(object.cityName);
  }

  public int hashCode() {
    assert false : "hashCode not designed";
    return 42;
  }
}
