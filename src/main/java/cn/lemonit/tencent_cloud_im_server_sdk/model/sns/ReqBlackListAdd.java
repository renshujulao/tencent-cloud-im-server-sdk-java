package cn.lemonit.tencent_cloud_im_server_sdk.model.sns;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class ReqBlackListAdd {
    private String From_Account;

    private List<String> To_Account;
}
