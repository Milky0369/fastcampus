package exception;

public class IdFormatTest {

    private String userId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) throws IDFormatException {

        if(userId == null) {
            throw new IDFormatException("아이디는 null일 수 없습니다.");
        } else if(userId.length() < 8 || userId.length() > 20) {
            throw new IDFormatException("아이디는 8자 이상 20자 이하로 사용 가능합니다.");
        }

        this.userId = userId;
    }

    public static void main(String[] args) {

        IdFormatTest idTest = new IdFormatTest();

        String myId = null;

        try {
            idTest.setUserId(myId);
        } catch(IDFormatException e) {
            System.out.println(e);
        }

        myId = "123456";

        try {
            idTest.setUserId(myId);
        } catch(IDFormatException e) {
            System.out.println(e);
        }

    }


}
