package cn.lemonit.tencent_cloud_im_server_sdk.model.sns.callback;

import cn.lemonit.tencent_cloud_im_server_sdk.model.common.BaseCallback;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BlackListAddCallback extends BaseCallback {
    private List<PairListItem> PairList;
}
