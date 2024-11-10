import config.Database;
import entities.TodoList;
import repositories.TodoListRepository;
import repositories.TodoListRepositoryImpl;
import services.TodoListService;
import views.TodoListView;

public class Main {
    public static void main(String[] args) {
        Database database = new Database("my_db","root", "","localhost","3306");
        database.setup();

        TodoListRepository todoListRepository = new TodoListRepositoryDbImpl(database);
        TodoListService todoListService =;
        TodoListView todoListView =;

    }
}