package com.heima.search.controller.v1;

import com.alibaba.fastjson.JSONObject;
import com.heima.model.common.dtos.ResponseResult;
import com.heima.model.search.dtos.HistorySearchDto;
import com.heima.search.service.ApUserSearchService;
import jdk.nashorn.internal.parser.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/history")
public class ApUserSearchController {

    @Autowired
    private ApUserSearchService apUserSearchService;

    @PostMapping("/load")
    public ResponseResult findUserSearch(){
        return apUserSearchService.findUserSearch();
    }

    @PostMapping("/del")
    public ResponseResult delUserSearch(@RequestBody String id){
        HistorySearchDto dto = JSONObject.parseObject(id, HistorySearchDto.class);
        return apUserSearchService.delUserSearch(dto);

    }
/*    @PostMapping("/del")
    public ResponseResult delUserSearch(@RequestBody HistorySearchDto dto ){

        return apUserSearchService.delUserSearch(dto);
    }*/
}
