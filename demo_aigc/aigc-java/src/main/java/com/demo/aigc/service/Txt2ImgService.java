package com.demo.aigc.service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSON;
import com.demo.aigc.model.SDTxt2ImgPayload;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

import java.nio.charset.StandardCharsets;

@Service
public class Txt2ImgService {
    @Value("${baidu.appid}")
    private String baiduAppid;
    @Value("${baidu.key}")
    private String baiduKey;
    @Value("${aigc.key}")
    private String aigcKey;

    @Resource
    RestTemplate restTemplate;

    public String txt2Img(String promptZh) {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/103.0.0.0 Safari/537.36");
        httpHeaders.add("content-type", "application/json;charset=UTF-8");

        //translate to en
        String salt = String.valueOf(System.currentTimeMillis());
        String stringBase = baiduAppid + promptZh + salt + baiduKey;
        String stringMd5 = DigestUtils.md5DigestAsHex(stringBase.getBytes(StandardCharsets.UTF_8));
        String baiduUrl = "http://api.fanyi.baidu.com/api/trans/vip/translate?"
                    + "q=" + promptZh
                    + "&from=zh&to=en"
                    + "&appid=" + baiduAppid
                    + "&salt=" + salt
                    + "&sign=" + stringMd5
                ;

        String resBaidu = restTemplate.getForObject(
                baiduUrl,
                String.class
        );

//        String resBaidu = "{\"from\":\"zh\",\"to\":\"en\",\"trans_result\":[{\"src\":\"\\u4e00\\u4e2a\\u9ad8\\u4e2a\\u5b50\\u7684\\u5973\\u5f3a\\u4eba\",\"dst\":\"A tall strong woman\"}]}";
        assert resBaidu != null;
        String promptEn = JSONObject.parseObject(JSONObject.parseObject(resBaidu).getJSONArray("trans_result").get(0).toString()).getString("dst");
//        System.out.println(promptEn);

        SDTxt2ImgPayload txt2ImgPayload = new SDTxt2ImgPayload();
        txt2ImgPayload.setKey(aigcKey);
        txt2ImgPayload.setPrompt(promptEn);
        HttpEntity<String> txtEntity = new HttpEntity<>(JSON.toJSONString(txt2ImgPayload), httpHeaders);

        //request for img
        String resAigc = restTemplate.postForObject(
                "https://stablediffusionapi.com/api/v3/text2img",
                txtEntity,
                String.class
        );

//        String resAigc = "{\"status\":\"success\",\"generationTime\":2.0932974815368652,\"id\":765049,\"output\":[\"https:\\/\\/d1okzptojspljx.cloudfront.net\\/generations\\/829eedbf-79f6-4e63-8e9b-79fddc28175f-0.png\"],\"meta\":{\"H\":512,\"W\":512,\"enable_attention_slicing\":\"true\",\"file_prefix\":\"829eedbf-79f6-4e63-8e9b-79fddc28175f\",\"guidance_scale\":7.5,\"model\":\"runwayml\\/stable-diffusion-v1-5\",\"n_samples\":1,\"negative_prompt\":\"\",\"outdir\":\"out\",\"prompt\":\"ultra realistic close up portrait ((beautiful pale cyberpunk female with heavy black eyeliner)), blue eyes, shaved side haircut, hyper detail, cinematic lighting, magic neon, dark red city, Canon EOS R3, nikon, f\\/1.4, ISO 200, 1\\/160s, 8K, RAW, unedited, symmetrical balance, in-frame, 8K\",\"revision\":\"fp16\",\"safety_checker\":\"none\",\"safetychecker\":\"NO\",\"seed\":2008047305,\"steps\":20,\"vae\":\"stabilityai\\/sd-vae-ft-mse\"}}\n";
        assert resAigc != null;
//        System.out.println(JSONObject.parseObject(resAigc).getJSONArray("output"));
        JSONArray photoArr = JSONObject.parseObject(resAigc).getJSONArray("output");
        return photoArr.toString();
    }
}

