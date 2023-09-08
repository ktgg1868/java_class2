package 컬렉션_프레임워크;

import java.util.*;

public class VectorEx {
    public static void main(String[] args) {
        
        /* Vector => ArrayList와 유사한 자료구조를 가지고 있음
         * Vector은 동기화된 메소드를 가지고 있어서 멀티스레드가 동시에 Vector의 메소드를 실행할 수 없음 */
        List<Board> list = new Vector<Board>();

        //Board객체를 저장
        list.add(new Board("제목1", "내용1", "글쓴이1"));
        list.add(new Board("제목2", "내용2", "글쓴이2"));
        list.add(new Board("제목3", "내용3", "글쓴이3"));
        list.add(new Board("제목4", "내용4", "글쓴이4"));
        list.add(new Board("제목5", "내용5", "글쓴이5"));

        list.remove(2);
        list.remove(3);

        for(int i=0; i<list.size(); i++) {

            Board board = list.get(i);
            System.out.println(board.subject + "\t" + board.content + "\t" + board.writer);

        }
    }
}
