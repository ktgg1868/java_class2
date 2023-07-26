package 인터페이스_예제2;

public class DaeEx {
    
    public static void dbWork(DataAccessObject dao) {

        dao.select();
        dao.insert();
        dao.update();
        dao.delete();

    }

    public static void main(String[] args) {
        
        dbWork(new OracleDao());
        dbWork(new MySqlDao());
        
    }
}
