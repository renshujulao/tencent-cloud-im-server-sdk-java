package cn.lemonit.tencent_cloud_im_server_sdk.model.common;

import cn.lemonit.tencent_cloud_im_server_sdk.model.sns.callback.PairListItem;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BaseCallback {
    private String CallbackCommand;
    private List<PairListItem> PairList;
    private String ClientCmd;
    private String Admin_Account;
    private Integer ForceFlag;
}
