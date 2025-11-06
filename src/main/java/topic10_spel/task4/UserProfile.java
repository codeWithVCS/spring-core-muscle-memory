package topic10_spel.task4;

import org.springframework.stereotype.Component;

@Component
public class UserProfile {
    private String name = "Chandra";
    private int age = 25;

    public String getUserSummary(){
        return "User[name=" + name + ", age=" + age + "]";
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
