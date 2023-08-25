package 기본API클래스_lang패키지;

public class Member2 {
    
    public String id;

    public Member2(String id) {

        this.id = id;

    }

    @Override
    public boolean equals(Object obj) {

        if(obj instanceof Member2) {

            Member2 member = (Member2) obj;
            if(id.equals(member.id)) {

                return true;

            }
        }

        return false;
    }

    //id가 동인한 문자열인 경우, 같은 해시코드값을 리턴
    @Override
    public int hashCode() {

        return id.hashCode();

    }
}
