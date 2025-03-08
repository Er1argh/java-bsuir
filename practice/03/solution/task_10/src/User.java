import javax.management.Query;

public class User {
    private String login;
    private String password;

    public User() {
        login = "null";
        password = "null";
    }

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public void createQuery() {
        Query query = new Query();
        query.printToLog();
    }

    // Нет модификатора доступа, чтобы был доступен только внутри этого же пакета
    class Query {
        public void printToLog() {
            System.out.println("Пользователь с логином '" + login + "' и паролем '" + password + "' отправил запрос");
        }
    }
}
