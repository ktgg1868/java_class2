package 인터페이스_예제2;

public class MySqlDao implements DataAccessObject {
    
    @Override
    public void select() {

        System.out.println("MySql DB에서 검색");

    }

    public void insert() {

        System.out.println("MySql DB에 삽입");

    }

    public void update() {

        System.out.println("MySql DB를 수정");

    }

    public void delete() {

        System.out.println("MySql DB에서 삭제");

    }

}
