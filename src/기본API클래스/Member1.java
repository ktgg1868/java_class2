package 기본API클래스;

public class Member1 {
    
    public String id;

    public Member1(String id) {

        this.id = id;

    }

    @Override
    public boolean equals(Object obj) {

        if(obj instanceof Member1) { //매개값이 Member타입인지 확인

            //Member타입으로 강제변환 & id필드값이 동일한지 검사 이후 동일하먄 true값으로 return
            Member1 member = (Member1) obj;
            if(id.equals(member.id)) {

                return true;

            }
        }

        //매개값이 Member타입이 아니거나, id필드값이 다른경우 false값으로 return
        return false;

    }
}
