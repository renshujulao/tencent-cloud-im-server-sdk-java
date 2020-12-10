package cn.lemonit.tencent_cloud_im_server_sdk.service;

import cn.lemonit.tencent_cloud_im_server_sdk.Common;
import cn.lemonit.tencent_cloud_im_server_sdk.model.sns.AddFriendItem;
import cn.lemonit.tencent_cloud_im_server_sdk.model.sns.ReqFriendAdd;
import cn.lemonit.tencent_cloud_im_server_sdk.model.sns.RespFriendAdd;
import cn.lemonit.tencent_cloud_im_server_sdk.utils.JsonUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

@DisplayName("关系链管理")
class SnsManageServiceTest {

    @Test
    @DisplayName("添加好友")
    void FriendAdd() {
        assertDoesNotThrow(() -> {
            AddFriendItem addFriendItem = new AddFriendItem();
            addFriendItem.setTo_Account("1");
            addFriendItem.setAddSource("AddSource_Type_IOS");
            List<AddFriendItem> addFriendItems = new ArrayList<>();
            addFriendItems.add(addFriendItem);
            ReqFriendAdd reqFriendAdd = ReqFriendAdd.builder()
                    .AddFriendItem(addFriendItems)
                    .From_Account("2")
                    .ForceAddFlags(1)
                    .build();
            RespFriendAdd result = Common.createClient().getSnsManageService().friendAdd(reqFriendAdd);
            System.out.println("请求结果：" + JsonUtil.gsonObj().toJson(result));
        });
    }

}