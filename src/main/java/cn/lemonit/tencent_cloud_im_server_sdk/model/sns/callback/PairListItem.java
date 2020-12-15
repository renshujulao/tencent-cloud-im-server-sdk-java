package cn.lemonit.tencent_cloud_im_server_sdk.model.sns.callback;


import cn.lemonit.tencent_cloud_im_server_sdk.model.common.IPariList;
import lombok.Data;

@Data
public class PairListItem implements IPariList {
    private String From_Account;
    private String To_Account;
}
