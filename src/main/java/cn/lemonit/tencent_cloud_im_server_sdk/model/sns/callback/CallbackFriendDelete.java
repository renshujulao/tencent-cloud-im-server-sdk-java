package cn.lemonit.tencent_cloud_im_server_sdk.model.sns.callback;

import cn.lemonit.tencent_cloud_im_server_sdk.model.common.IPariList;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CallbackFriendDelete {
    private String CallbackCommand;
    private List<IPariList> PairList;
    private String ClientCmd;
    private String Admin_Account;
    private Integer ForceFlag;
}
