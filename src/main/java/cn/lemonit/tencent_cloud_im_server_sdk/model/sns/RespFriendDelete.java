/**
 * Copyright 2020 bejson.com
 */
package cn.lemonit.tencent_cloud_im_server_sdk.model.sns;
import cn.lemonit.tencent_cloud_im_server_sdk.model.common.ApiResponse;
import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * Auto-generated: 2020-12-09 20:20:14
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
@Data
@Builder
public class RespFriendDelete extends ApiResponse {
    private List<FriendAddResultItem> ResultItem;
}