import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

// 1. Class should be final so no other class can inherite.
public final class ImmutableClass {

  static final class Address {
    private final String street;
    private final String pincode;
    private final String state;

    public Address (String street, String pincode, String state) {
      this.street = street;
      this.pincode = pincode;
      this.state = state;
    }

    public String getStreet() {
      return street;
    }

    public String getPincode() {
      return pincode;
    }

    public String getState() {
      return state;
    }

  }
  //2.  All fields should be private and final
  private final String name;
  private final Integer age;
  private final LocalDate dob;
  private final List<String> subjects;
  private final Address address;

  //3. All private fields should be initialized via constructor
  //4. Do not provide any setter
  //5. Only getter allow and for mutable fields apply deep copy;
  public ImmutableClass(String name, Integer age, LocalDate dob, List<String> subjects, Address address) {
    this.name= name;
    this.age = age;
    this.dob = dob;
    this.subjects = List.copyOf(subjects);
    this.address = address;
  }

  public String getName() {
    return this.name;
  }

  public Integer getAge() {
    return this.age;
  }

  public LocalDate getDob() {
    return dob;
  }

  public List<String> getSubjects() {
    return subjects;
  }

}
