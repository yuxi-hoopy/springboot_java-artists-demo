package com.yuxi.xiao.control;

import com.yuxi.xiao.Response;
import com.yuxi.xiao.dao.Painter;
import com.yuxi.xiao.dao.PainterRepo;
import com.yuxi.xiao.dto.PainterDto;
import com.yuxi.xiao.service.PainterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PainterController {

    @Autowired
    private PainterService painterService;

    @GetMapping("/painters/{id}")
    public Response<PainterDto> getPainterById(@PathVariable long id) {
        return Response.newSuccess(painterService.getPainterById(id));
    }
    // 新增接口 json传参
    @PostMapping("/painters")
    public Response<Long> addNewPainter(@RequestBody PainterDto painterDto)
    {
        return Response.newSuccess(painterService.addNewPainter(painterDto));
    }
    // 新增接口 删除画家信息
    @DeleteMapping("/painters/{id}")
    public void deletePainterById(@PathVariable long id)
    {
        painterService.deletePainterById(id);
    }

    @PutMapping("/painters/{id}")
    public Response<PainterDto> updatePainterById(@PathVariable long id,
                                                  @RequestParam(required = false) String name,
                                                  @RequestParam(required = false) Integer birthYear,
                                                  @RequestParam(required = false) Integer deathYear,
                                                  @RequestParam(required = false) String nationality,
                                                  @RequestParam(required = false) String famousWork,
                                                  @RequestParam(required = false) String style)
    {
        return Response.newSuccess(painterService.updatePainterById(id, name, birthYear,deathYear,
                nationality, famousWork, style));
    }

}



