package eg;

/**
 * Created by xct15990138050 on 18/7/15.
 */
public class Students {
    public String userName;
    public int userAge;


    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "Students{" +
                "userAge=" + userAge +
                ", userName='" + userName + '\'' +
                '}';
    }
}
