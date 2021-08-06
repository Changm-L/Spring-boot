package com.example.demo.controller;

import com.example.demo.mapper.ListMapper;
import com.example.demo.vo.ListVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/list")
public class ListController {

    @Autowired
    ListMapper listMapper;

    @GetMapping
    public List<ListVo> dataList(){
        System.out.println(listMapper.dataList());
        System.out.println("리스트 출력 성공");
        return listMapper.dataList();
    }

    @GetMapping("/{seq}")
    public ListVo fetchListBySeq(@PathVariable int seq){
        System.out.println(listMapper.fetchListBySeq(seq));
        ListVo fetchList = listMapper.fetchListBySeq(seq);
        return fetchList;
    }

    @DeleteMapping("/{seq}")
    public void deleteList(@PathVariable int seq){
        listMapper.deleteList(seq);
        System.out.println("리스트 삭제 성공");
    }

}
