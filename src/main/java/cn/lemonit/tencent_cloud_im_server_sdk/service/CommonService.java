package cn.lemonit.tencent_cloud_im_server_sdk.service;

import cn.hutool.core.lang.Singleton;
import cn.lemonit.tencent_cloud_im_server_sdk.exceptions.ServiceException;
import cn.lemonit.tencent_cloud_im_server_sdk.model.common.ApiResponse;
import cn.lemonit.tencent_cloud_im_server_sdk.utils.RestTemplateUtil;
import com.google.gson.Gson;

public class CommonService {

    protected <T extends ApiResponse> T post(String url, Class<T> responseBodyType, Object request) throws ServiceException {
        Gson gson = Singleton.get(Gson.class);
        String s = RestTemplateUtil.getInstance().postForObject(url, gson.toJson(request), String.class);
        return  gson.fromJson(s, responseBodyType);
    }

}
