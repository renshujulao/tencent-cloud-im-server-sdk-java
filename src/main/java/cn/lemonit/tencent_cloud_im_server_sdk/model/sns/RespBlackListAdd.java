package cn.lemonit.tencent_cloud_im_server_sdk.model.sns;

import cn.lemonit.tencent_cloud_im_server_sdk.model.common.ApiResponse;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class RespBlackListAdd extends ApiResponse {
    private List<BlackListAddResultItem> ResultItem;
    private List<String>  Fail_Account;
    private String ErrorDisplay;
}
