package cl.bluex.devolucion.exceptions;

public class SimpleException extends Exception{

	private static final long serialVersionUID = 0L;
    private final int code;
    
    public SimpleException(int code) {
    	super();
        this.code = code;
    }
    
    public SimpleException(String message, Throwable cause, int code) {
        super(message, cause);
        this.code = code;
    }
    public SimpleException(String message, int code) {
        super(message);
        this.code = code;
    }
    public SimpleException(Throwable cause, int code) {
        super(cause);
        this.code = code;
    }
    public int getCode() {
        return this.code;
    }
    
}
