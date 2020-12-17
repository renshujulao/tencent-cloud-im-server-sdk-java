

/**
 * Copyright 2020 bejson.com
 */
package cn.lemonit.tencent_cloud_im_server_sdk.model.sns;

import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * Auto-generated: 2020-12-09 18:52:4
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
@Data
@Builder
public class ReqFriendAdd {
    private String From_Account;
    private List<AddFriendItem> AddFriendItem;
    private String AddType;
    private Integer ForceAddFlags;
}