package net.zoneland.gateway.comm.sgip;

import net.zoneland.gateway.util.Resource;

public class SGIPConstant {

    public static boolean   debug;
    public static String    LOGINING;
    public static String    LOGIN_ERROR;
    public static String    SEND_ERROR;
    public static String    CONNECT_TIMEOUT;
    public static String    STRUCTURE_ERROR;
    public static String    NONLICETSP_LOGNAME;
    public static String    NONLICETSP_ID;
    public static String    SP_ERROR;
    public static String    VERSION_ERROR;
    public static String    OTHER_ERROR;
    public static String    HEARTBEAT_ABNORMITY;
    public static String    SUBMIT_INPUT_ERROR;
    public static String    CONNECT_INPUT_ERROR;
    public static String    CANCEL_INPUT_ERROR;
    public static String    QUERY_INPUT_ERROR;
    public static String    DELIVER_REPINPUT_ERROR;
    public static String    REPORT_REPINPUT_ERROR;
    public static String    USERREPORT_REPINPUT_ERROR;
    public static String    ACTIVE_REPINPUT_ERROR;
    public static String    SMC_MESSAGE_ERROR;
    public static String    INT_SCOPE_ERROR;
    public static String    STRING_LENGTH_GREAT;
    public static String    STRING_NULL;
    public static String    VALUE_ERROR;
    public static String    FEE_USERTYPE_ERROR;
    public static String    REGISTERED_DELIVERY_ERROR;
    public static final int Bind_Command_Id           = 1;
    public static final int Bind_Rep_Command_Id       = 0x80000001;
    public static final int Unbind_Command_Id         = 2;
    public static final int Unbind_Rep_Command_Id     = 0x80000002;
    public static final int Submit_Command_Id         = 3;
    public static final int Submit_Rep_Command_Id     = 0x80000003;
    public static final int Deliver_Command_Id        = 4;
    public static final int Deliver_Rep_Command_Id    = 0x80000004;
    public static final int Report_Command_Id         = 5;
    public static final int Report_Rep_Command_Id     = 0x80000005;
    public static final int UserReport_Command_Id     = 17;
    public static final int UserReport_Rep_Command_Id = 0x80000011;

    public SGIPConstant() {
    }

    public static void initConstant(Resource resource) {
        if (LOGINING == null) {
            LOGINING = getDef(resource.get("smproxy/logining"), "logining");
            LOGIN_ERROR = getDef(resource.get("smproxy/login-error"), "login-error");
            SEND_ERROR = getDef(resource.get("smproxy/send-error"), "send-error");
            CONNECT_TIMEOUT = getDef(resource.get("smproxy/connect-timeout"), "connect-timeout");
            STRUCTURE_ERROR = getDef(resource.get("smproxy/structure-error"), "structure-error");
            NONLICETSP_LOGNAME = getDef(resource.get("smproxy/nonlicetsp-logname"),
                "nonlicetsp-logname");
            NONLICETSP_ID = getDef(resource.get("smproxy/nonlicetsp-id"), "nonlicetsp-id");
            SP_ERROR = getDef(resource.get("smproxy/sp-error"), "sp-error");
            VERSION_ERROR = getDef(resource.get("smproxy/version-error"), "version-error");
            OTHER_ERROR = getDef(resource.get("smproxy/other-error"), "other-error");
            HEARTBEAT_ABNORMITY = getDef(resource.get("smproxy/heartbeat-abnormity"),
                "heartbeat-abnormity");
            SUBMIT_INPUT_ERROR = getDef(resource.get("smproxy/submit-input-error"),
                "submit-input-error");
            CONNECT_INPUT_ERROR = getDef(resource.get("smproxy/connect-input-error"),
                "connect-input-error");
            CANCEL_INPUT_ERROR = getDef(resource.get("smproxy/cancel-input-error"),
                "cancel-input-error");
            QUERY_INPUT_ERROR = getDef(resource.get("smproxy/query-input-error"),
                "query-input-error");
            DELIVER_REPINPUT_ERROR = getDef(resource.get("smproxy/deliver-repinput-error"),
                "deliver-repinput-error");
            REPORT_REPINPUT_ERROR = getDef(resource.get("smproxy/report-repinput-error"),
                "report-repinput-error");
            USERREPORT_REPINPUT_ERROR = getDef(resource.get("smproxy/userreport-repinput-error"),
                "userreport-repinput-error");
            ACTIVE_REPINPUT_ERROR = getDef(resource.get("smproxy/active-repinput-error"),
                "active-repinput-error");
            SMC_MESSAGE_ERROR = getDef(resource.get("smproxy/smc-message-error"),
                "smc-message-error");
            INT_SCOPE_ERROR = getDef(resource.get("smproxy/int-scope-error"), "int-scope-error");
            STRING_LENGTH_GREAT = getDef(resource.get("smproxy/string-length-great"),
                "string-length-great");
            STRING_NULL = getDef(resource.get("smproxy/string-null"), "string-null");
            VALUE_ERROR = getDef(resource.get("smproxy/value-error"), "value-error");
            FEE_USERTYPE_ERROR = getDef(resource.get("smproxy/fee-usertype-error"),
                "fee-usertype-error");
            REGISTERED_DELIVERY_ERROR = getDef(resource.get("smproxy/registered-delivery-erro"),
                "registered-delivery-erro");
        }
    }

    private static String getDef(String val, String def) {
        if (val == null) {
            return def;
        }
        return val;

    }

}
