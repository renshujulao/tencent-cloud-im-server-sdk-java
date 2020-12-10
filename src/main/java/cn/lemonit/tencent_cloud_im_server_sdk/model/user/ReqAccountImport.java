package cn.lemonit.tencent_cloud_im_server_sdk.model.user;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ReqAccountImport {
    private String Identifier;

    private String Nick;

    private String FaceUrl;
}
