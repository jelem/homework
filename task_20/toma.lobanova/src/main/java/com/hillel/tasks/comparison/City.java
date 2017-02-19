package com.hillel.tasks.comparison;

public class City implements Comparable<City> {
  private String name;
  private String region;
  private String country;

  private City(Builder builder) {
    name = builder.name;
    region = builder.region;
    country = builder.country;
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
    City otherObject = (City) object;
    if (!name.equals(otherObject.name)) {
      return false;
    }
    if (!region.equals(otherObject.region)) {
      return false;
    }
    return country.equals(otherObject.country);
  }

  @Override
  public String toString() {
    return name + ", " + region + " region, " + country;
  }

  public int compareTo(City object) {
    return name.compareTo(object.name);
  }

  public static class Builder {
    private static final String UNSET = "unset";
    private String name = UNSET;
    private String region = UNSET;
    private String country = UNSET;

    public Builder setName(String name) {
      if (name != null) {
        this.name = name;
      }
      return this;
    }

    public Builder setCountry(String country) {
      if (country != null) {
        this.country = country;
      }
      return this;
    }

    public Builder setRegion(String region) {
      if (region != null) {
        this.region = region;
      }
      return this;
    }

    public City build() {
      return new City(this);
    }
  }

  public int hashCode() {
    assert false : "hashCode not designed";
    return 42; // any arbitrary constant will do
  }
}
