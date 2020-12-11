package cn.lemonit.tencent_cloud_im_server_sdk.service;


import cn.hutool.json.JSONUtil;
import cn.lemonit.tencent_cloud_im_server_sdk.Common;
import cn.lemonit.tencent_cloud_im_server_sdk.model.common.ApiResponse;
import cn.lemonit.tencent_cloud_im_server_sdk.model.user.ReqAccountImport;
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
                    .Identifier("31")
                    .Nick("人书俱老")
                    .FaceUrl("/oss/image/40.png")
                    .build();
            ApiResponse apiResponse = Common.createClient().getUserManageService().accountImport(reqAccountImport);
            System.out.println("请求结果：" + JSONUtil.toJsonStr(apiResponse));
        });
    }
}
