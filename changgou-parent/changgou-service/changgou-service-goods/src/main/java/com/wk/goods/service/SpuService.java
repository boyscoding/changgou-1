package com.wk.goods.service;

import com.github.pagehelper.PageInfo;
import com.wk.goods.pojo.Goods;
import com.wk.goods.pojo.Spu;

import java.util.List;

/****
 * @Author:admin
 * @Description:Spu业务层接口
 * @Date 2019/6/14 0:16
 *****/
public interface SpuService {

    /**
     * 批量上架商品
     * @param ids：要上架的所有商品ID：spuID
     */
    void batchPut(Long[] ids);

    /***
     * 商品上架
     * @param spuId
     */
    void put(Long spuId);

    /**
     * 商品下架
     * @param spuId
     */
    void pull(Long spuId);

    /**
     * 商品审核
     * @param spuId
     */
    void audit(Long spuId);

    /**
     * 根据spuID获取goods对象的信息
     * @param id
     * @return
     */
    Goods findGoodsById(Long id);

    /**
     * 添加商品信息
     * @param goods
     */
    void addGoods(Goods goods);

    /***
     * Spu多条件分页查询
     * @param spu
     * @param page
     * @param size
     * @return
     */
    PageInfo<Spu> findPage(Spu spu, int page, int size);

    /***
     * Spu分页查询
     * @param page
     * @param size
     * @return
     */
    PageInfo<Spu> findPage(int page, int size);

    /***
     * Spu多条件搜索方法
     * @param spu
     * @return
     */
    List<Spu> findList(Spu spu);

    /***
     * 删除Spu
     * @param id
     */
    void delete(Long id);

    /***
     * 修改Spu数据
     * @param spu
     */
    void update(Spu spu);

    /***
     * 新增Spu
     * @param spu
     */
    void add(Spu spu);

    /**
     * 根据ID查询Spu
     * @param id
     * @return
     */
     Spu findById(Long id);

    /***
     * 查询所有Spu
     * @return
     */
    List<Spu> findAll();
}
