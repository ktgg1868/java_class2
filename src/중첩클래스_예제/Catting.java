package 중첩클래스_예제;

//컴파일에러가 발생하는 원인?

public class Catting {
    


    void startChat(String chatId) {

        /*String nickName = null; 잘못된 구문
        nickName = chatId;*/
        
        String nickName = chatId;
        //final String nickName = chatId; 이구문으로 대체 가능

        class Chat {

            public void start() {
                
                while (true) {

                    String inputData = "안녕하세요";
                    String message = "[" + nickName + "]" + inputData;
                    //nickname의 타입문제(final)
                    sendMessage(message);

                }
            }

            void sendMessage(String message) {

            }
        }

        Chat chat = new Chat();
        chat.start();

    }
}
