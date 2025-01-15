public class User {
    private String email;
    private String password;
    private String name;

    // 생성자를 하나라도 만들게 되면 기본생성자가 자동으로 안 만들어진다.
    public User(String name, String email){
        this(name, email, null);
    }

    // 생성자 오버로딩
    public User(String name, String email, String password){
        this.email = email;
        this.password = password;
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPassword() {
        return this.password;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString(){
        return "User{" + "email='" + email + '\'' + ", name='" + name + '\'' +  '}';
    }
}
