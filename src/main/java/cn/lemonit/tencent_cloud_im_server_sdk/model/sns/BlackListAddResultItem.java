package cn.lemonit.tencent_cloud_im_server_sdk.model.sns;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class BlackListAddResultItem implements Serializable {
    private String To_Account;

    private String ResultCode;

    private String ResultInfo;
}
