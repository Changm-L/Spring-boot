package com.example.demo.mapper;

import com.example.demo.vo.ListVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ListMapper {
    List<ListVo> dataList();
    ListVo fetchListBySeq(int seq);
    void deleteList(int seq);
    void insertList(ListVo list);
    void updateList(ListVo list);

}
