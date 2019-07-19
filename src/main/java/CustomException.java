public class CustomException extends RuntimeException {

    private  int code;

    private  String messag;

    private  Object payload;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessag() {
        return messag;
    }

    public void setMessag(String messag) {
        this.messag = messag;
    }

    public Object getPayload() {
        return payload;
    }

    public void setPayload(Object payload) {
        this.payload = payload;
    }

    public CustomException() {
    }
    public CustomException( String messag) {
        super(messag);
    }

    public CustomException(int code, String messag, Object payload) {
        this.code = code;
        this.messag = messag;
        this.payload = payload;
    }
}
