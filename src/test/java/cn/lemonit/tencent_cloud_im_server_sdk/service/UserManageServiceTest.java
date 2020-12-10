package cn.lemonit.tencent_cloud_im_server_sdk.service;


import cn.lemonit.tencent_cloud_im_server_sdk.Common;
import cn.lemonit.tencent_cloud_im_server_sdk.model.common.ApiResponse;
import cn.lemonit.tencent_cloud_im_server_sdk.model.user.ReqAccountImport;
import cn.lemonit.tencent_cloud_im_server_sdk.utils.JsonUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

@DisplayName("账号管理")
public class UserManageServiceTest {

    @Test
    @DisplayName("导入好友")
    void accountImport() {
        assertDoesNotThrow(() -> {
            ReqAccountImport reqAccountImport = ReqAccountImport.builder()
                    .Identifier("2")
                    .Nick("天下布武")
                    .FaceUrl("")
                    .build();
            ApiResponse apiResponse = Common.createClient().getUserManageService().accountImport(reqAccountImport);
            System.out.println("请求结果：" + JsonUtil.gsonObj().toJson(apiResponse));
        });
    }
}
