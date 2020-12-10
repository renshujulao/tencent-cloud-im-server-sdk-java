package cn.lemonit.tencent_cloud_im_server_sdk.service;


import cn.lemonit.tencent_cloud_im_server_sdk.IMClient;
import cn.lemonit.tencent_cloud_im_server_sdk.exceptions.ServiceException;
import cn.lemonit.tencent_cloud_im_server_sdk.model.sns.ReqBlackListAdd;
import cn.lemonit.tencent_cloud_im_server_sdk.model.sns.ReqFriendAdd;
import cn.lemonit.tencent_cloud_im_server_sdk.model.sns.RespBlackListAdd;
import cn.lemonit.tencent_cloud_im_server_sdk.model.sns.RespFriendAdd;

public class SnsManageService extends BaseService {
    private static final String SERVICE_NAME = "sns";
    private static final String COMMAND_PREFIX = "COMMAND";

    private final IMClient imClient;

    public SnsManageService(IMClient imClient) {
        this.imClient = imClient;
    }

    //添加好友
    public static final String COMMAND_FRIEND_ADD = "friend_add";
    //添加黑名单
    public static final String BLACK_LIST_ADD = COMMAND_PREFIX+ "black_list_add";

    public RespFriendAdd friendAdd(ReqFriendAdd reqFriendAdd) throws ServiceException {
        String url = imClient.createUrl(SERVICE_NAME, COMMAND_FRIEND_ADD);
        return post(url, RespFriendAdd.class, reqFriendAdd);
    }

    public RespBlackListAdd blackListAdd(ReqBlackListAdd reqBlackListAdd) throws ServiceException {
        String url = imClient.createUrl(SERVICE_NAME, BLACK_LIST_ADD);
        return post(url,RespBlackListAdd.class,reqBlackListAdd);
    }


}
