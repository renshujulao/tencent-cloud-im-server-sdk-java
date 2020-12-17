package cn.lemonit.tencent_cloud_im_server_sdk.service;

import cn.lemonit.tencent_cloud_im_server_sdk.IMClient;
import cn.lemonit.tencent_cloud_im_server_sdk.exceptions.ServiceException;
import cn.lemonit.tencent_cloud_im_server_sdk.model.common.ApiResponse;
import cn.lemonit.tencent_cloud_im_server_sdk.model.user.ReqAccountImport;

public class UserManageService extends CommonService{
    // 账户管理服务
    private static final String SERVICE_NAME = "im_open_login_svc";
    //导入单个帐号
    public static final String COMMAND_ACCOUNT_IMPORT ="account_import";


    private final IMClient imClient;

    public UserManageService(IMClient imClient) {
        this.imClient = imClient;
    }


    public ApiResponse accountImport(ReqAccountImport reqAccountImport) throws ServiceException {
        String url = imClient.createUrl(SERVICE_NAME, COMMAND_ACCOUNT_IMPORT);
        ApiResponse apiResponse = post(url, ApiResponse.class, reqAccountImport);
        return apiResponse;
    }

}
