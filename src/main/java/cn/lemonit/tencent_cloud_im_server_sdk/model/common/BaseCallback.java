package cn.lemonit.tencent_cloud_im_server_sdk.model.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BaseCallback implements Serializable {
    private String CallbackCommand;
}
