package com.yuxi.xiao.service;

import com.yuxi.xiao.dao.Painter;
import com.yuxi.xiao.dto.PainterDto;

public interface PainterService {

    PainterDto getPainterById(long id);

    Long addNewPainter(PainterDto painterDto);

    void deletePainterById(long id);

    PainterDto updatePainterById(long id, String name, Integer birthYear, Integer deathYear, String nationality, String famousWork, String style);
}
