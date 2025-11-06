package topic7_java_config.task2;

public class DatabaseRepository {
    public DatabaseRepository(DataSource dataSource) {
        System.out.println("DatabaseRepository: received DataSource dependency");
    }
    public void query(){
        System.out.println("DatabaseRepository: running query...");
    }
}
