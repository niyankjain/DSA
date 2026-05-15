public class Profile {

  private final String name;
  private final String address;
  private final String gender;
  private final Integer id;

  public Profile(ProfileBuilder builder) {
    this.gender = builder.gender;
    this.name = builder.name;
    this.address = builder.address;
    this.id = builder.id;
  }

  public String getName() {
    return name;
  }

  public String getAddress() {
    return address;
  }

  public String getGender() {
    return gender;
  }

  public Integer getId() {
    return id;
  }

  public static class ProfileBuilder {

    private String name;
    private String address;
    private String gender;
    private Integer id;

    public ProfileBuilder name(String name) {
      this.name = name;
      return this;
    }

    public ProfileBuilder address(String address) {
      this.address = address;
      return this;
    }

    public ProfileBuilder gender(String gender) {
      this.gender = gender;
      return this;
    }

    public ProfileBuilder rollno(Integer id) {
      this.id = id;
      return this;
    }

    public Profile build() {
      return new Profile(this);
    }
  }
}
