package cn.lemonit.tencent_cloud_im_server_sdk.service;


import cn.lemonit.tencent_cloud_im_server_sdk.IMClient;
import cn.lemonit.tencent_cloud_im_server_sdk.exceptions.ServiceException;
import cn.lemonit.tencent_cloud_im_server_sdk.model.sns.*;

public class SnsManageService extends CommonService {
    private static final String SERVICE_NAME = "sns";

    private final IMClient imClient;

    public SnsManageService(IMClient imClient) {
        this.imClient = imClient;
    }

    //添加好友
    public static final String COMMAND_FRIEND_ADD = "friend_add";
    public static final String COMMAND_FRIEND_DELETE = "friend_delete";

    //添加黑名单
    public static final String BLACK_LIST_ADD = "black_list_add";

    public RespFriendAdd friendAdd(ReqFriendAdd reqFriendAdd) throws ServiceException {
        String url = imClient.createUrl(SERVICE_NAME, COMMAND_FRIEND_ADD);
        return post(url, RespFriendAdd.class, reqFriendAdd);
    }

    public RespFriendDelete friendDelete(ReqFriendDelete reqFriendDelete) throws ServiceException {
        String url = imClient.createUrl(SERVICE_NAME, COMMAND_FRIEND_DELETE);
        return post(url,RespFriendDelete.class,reqFriendDelete);
    }

    public RespBlackListAdd blackListAdd(ReqBlackListAdd reqBlackListAdd) throws ServiceException {
        String url = imClient.createUrl(SERVICE_NAME, BLACK_LIST_ADD);
        return post(url,RespBlackListAdd.class,reqBlackListAdd);
    }


}
