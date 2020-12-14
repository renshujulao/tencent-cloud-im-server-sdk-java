package cn.lemonit.tencent_cloud_im_server_sdk.model.sns.callback;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PairListItem {
    private String From_Account;

    private String To_Account;
}
