package xyz.kracker1911.xls2doc.exception;

import xyz.kracker1911.xls2doc.constants.ErrorCode;

public class HttpException extends RuntimeException{

    private Object code;
    private String msg;

    public Object getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }


    public HttpException(ErrorCode errorCode){
        this.code = errorCode.getCode();
        this.msg = errorCode.getMessage();
    }

    public HttpException(Object code,String message){
        this.code = code;
        this.msg = message;
    }

    public String toString(){
        return "code="+code+",message="+msg;
    }

}
