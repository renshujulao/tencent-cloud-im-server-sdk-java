package cn.lemonit.tencent_cloud_im_server_sdk;

public class Common {
    public static final Long APP_ID = 1400454458L;
    public static final String APP_KEY = "3208e6e90382f6d721003746b828d695d5eeac0a891d5abfd963589d44eaf5bb";
    public static final String ADMIN_USER_ID = "administrator";
    public static final Long SIG_EXPIRE_LENGTH = 60 * 60 * 24 * 11 * 1000L;

    public static IMClient createClient() {
        return IMClient.newInstance(APP_ID, APP_KEY, ADMIN_USER_ID, SIG_EXPIRE_LENGTH);
    }
}
