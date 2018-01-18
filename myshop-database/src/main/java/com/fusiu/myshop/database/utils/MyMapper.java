package com.fusiu.myshop.database.utils;


import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * 自己的 Mapper
 * 特别注意：该接口不能被扫描到，否则会出错
 * <p>Title: MyMapper</p>
 * <p>Description: </p>
 *
 * @author Fusiu
 * @version 1.0.0
 * @param <T>
 * @date 2018/1/18 19:17
 */
public interface MyMapper<T> extends Mapper<T>,MySqlMapper<T> {
}
