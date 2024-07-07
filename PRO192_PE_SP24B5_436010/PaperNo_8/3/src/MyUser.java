
import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class MyUser implements IUser {

    @Override
    public int f1(List<User> t) {
        int maxStatus = Integer.MIN_VALUE;
        for (User user : t){
            if(user.getName().length() > 1 && Character.isDigit(user.getName().charAt(1))){
                maxStatus = Math.max(maxStatus, user.getStatus());
            }
        }
        return maxStatus;
    }

    @Override
    public void f2(List<User> t) {
        if(t.size() > 6) {
            Collections.reverse(t.subList(3, 6));
        }
    }

    @Override
    public void f3(List<User> t) {
        if (!t.isEmpty()){
            User maxStatusUser = Collections.max(t, (u1, u2) -> Integer.compare(u1.getStatus() , u2.getStatus()));
            t.get(0).setName(maxStatusUser.getName());
            t.get(0).setStatus(maxStatusUser.getStatus());

        }
    }
    
}
