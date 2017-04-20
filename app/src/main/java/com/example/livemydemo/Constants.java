package com.example.livemydemo;

/**
 * Created by guoqiang on 2017/4/18.
 */

public class Constants {
    public static final int sdkAppId = 1400028799;
    public static final String groupId = "@TGS#aZONJBYES";
    public static final int IS_ALREADY_MEMBER = 10013;
    public static final String APPLY_CHATROOM = "申请加入";
    public static final int AVIMCMD_TEXT = -1;         // 普通的聊天消息
    public static final int AVIMCMD_NONE = AVIMCMD_TEXT + 1;               // 无事件
    // 以下事件为TCAdapter内部处理的通用事件
    public static final int AVIMCMD_ENTERLIVE = AVIMCMD_NONE + 1;          // 用户加入直播, Group消息  1
    public static final int AVIMCMD_EXITLIVE = AVIMCMD_ENTERLIVE + 1;
    public static final String CMD_KEY = "userAction";
    public static final String CMD_PARAM = "actionParam";
    public static final String UserSig = "eJxljl1PgzAYhe-5FYTbGW07uhYTL6rOhWwzU1z8uCGEtu4VB13pBDT*dxWXSOK5fZ6Tcz483-eDu0VynOV5tS9d6jqjAv-UD1Bw9AeNAZlmLh1b*Q*q1oBVaaadsj3ElFKC0NABqUoHGg4GRZyyAa5lkfYbv-3wu0w4i6KhAs89XE7XF7HA-CpvduaSrZ92IWa6xKtOQDxpR4sVLmI9S4R7YfR*aQVMRdjMr2ebG9ecx3VBNyeufZ3I2y7bdm6vE8Ifm-ZhHo8q8V6cDSYdbNXhUERCjgjBA-qmbA1V2QsEYYrJGP0k8D69LzZLXGE_";
}
