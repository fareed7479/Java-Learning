package Project;

import java.util.*;

public class UserManagmentDemo {
    public static void main(String[] args) {

//        //Set<String> user1Roles = new HashSet<>(Arrays.asList("ADMIN","USER"));
//        //User user1 = new User("Alice" , true , user1Roles);

        List<User> users = new ArrayList<>();

        users.add(new User("Alice" , true ,
                new HashSet<>(Arrays.asList("ADMIN","USER"))));


        users.add(new User("Bob" , false ,
                new HashSet<>(Arrays.asList("USER"))));

        users.add(new User("Charlie" , true ,
                new HashSet<>(Arrays.asList("ADMIN","USER" ,"MANAGER"))));

        users.add(new User("David" , false ,
                new HashSet<>(Arrays.asList("MANAGER"))));

        users.add(new User("Eris" , false ,
                new HashSet<>(Arrays.asList("ADMIN","MANAGER"))));

        //Remove Inactive Users
        Iterator<User> iterator = users.iterator();
        while(iterator.hasNext()){
            if(!iterator.next().isActive()){
                iterator.remove();
            }
        }

        System.out.println("ACTIVE Users");
        for(User user : users){
            System.out.println(user.getName());
        }

        //COUNT Users Per Role
        Map<String , Integer> roleCount = new HashMap<>();
        for(User user : users){
            for(String role : user.getRoles()){
                roleCount.put(role , roleCount.getOrDefault(role , 0) + 1);
            }
        }
        //Printing the Mapped RoelCounts
        System.out.println("Users Count:");
        for(Map.Entry<String , Integer> entry : roleCount.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}
