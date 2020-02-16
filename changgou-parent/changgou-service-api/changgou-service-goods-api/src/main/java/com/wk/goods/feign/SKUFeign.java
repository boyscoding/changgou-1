package com.wk.goods.feign;

import com.wk.goods.pojo.Sku;
import entity.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@FeignClient(name="goods")      //调用goods微服务中SkuController.findAll方法
@RequestMapping("/sku")
public interface SKUFeign {

    /***
     * 查询Sku全部数据，如果数据量大建议分批查询
     * @return
     */
    @GetMapping
    Result<List<Sku>> findAll();
}
