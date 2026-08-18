package two;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

    /*Set is a DataStructure which Doesn't Allow
    duplicate Objects and Elements.
    -Set is an Interfcae
     */

    public static void main(String[] args) {
        Set<String> roles = new HashSet<>();
        roles.add("ADMIN");
        roles.add("Manager");
        roles.add("User");
        roles.add("Manager");
        //if duplicate is there , it doesn't add into the set
        //but there is no error for that and doesn't refelect on set.
        for(String role : roles){
            System.out.println(role);
        }
    }
}
