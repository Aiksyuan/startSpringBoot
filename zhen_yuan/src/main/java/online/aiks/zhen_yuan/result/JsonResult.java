package online.aiks.zhen_yuan.result;

public class JsonResult {
    private String code;
    private String msg;
    private Object data;
    private static JsonResult jsonResult;

    public JsonResult() {
    }

    public JsonResult(String code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
    public static JsonResult getJsonResult(){
        if (jsonResult!=null) {
            jsonResult = new JsonResult();
            return jsonResult;
        }
        return jsonResult;
    }

    public JsonResult addData(Object data) {
        if (jsonResult==null) {
            jsonResult = new JsonResult();
        }
        jsonResult.setData(data);
        return jsonResult;
    }
    public JsonResult addMsg(String msg) {
        if (jsonResult==null) {
            jsonResult = new JsonResult();
        }
        jsonResult.setMsg(msg);
        return jsonResult;
    }
    public JsonResult addCode(String code) {
        if (jsonResult==null) {
            jsonResult = new JsonResult();
        }
        jsonResult.setMsg(code);
        return jsonResult;
    }

}
