package foxborn;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor  // with using lombok constructor injection doesnt matter
public class Java {
  /*                   ==============  @Autowired =================
  java has teaching hours fixed, but also it has office hours.
  wire office hours object to JAva object, include office hours in Java class.
  Can autowire with 3 methods:
*/

    // ==== 1.  Field injection - is not recommended, deprecated
//    @Autowired
//    OfficeHours officeHours;


    // ===== 2. Constructor Injection
    /*
  ***  Spring 4.3 if only has one constructor - i can omit @Autowired
     */
    OfficeHours officeHours;
  //***  @Autowired
//    public Java(OfficeHours officeHours) {  //Not using coz Lombok is doing constructors
//        this.officeHours = officeHours;
//    }

  // 3. Injecting a value through setter


    public void getTeachingHours(){

        System.out.println("Weekly teaching hours : "
                + (20 + officeHours.getHours()));  // to also display how many office hours
    }
}
