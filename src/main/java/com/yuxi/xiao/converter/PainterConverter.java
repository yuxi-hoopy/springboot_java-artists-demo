package com.yuxi.xiao.converter;

import com.yuxi.xiao.dao.Painter;
import com.yuxi.xiao.dto.PainterDto;

public class PainterConverter {
    // 把数据库Painter对象转化成DTO对象
    public static PainterDto convertPainter(Painter painter)
    {
        PainterDto painterDto = new PainterDto();
        painterDto.setId(painter.getId());
        painterDto.setName(painter.getName());
        painterDto.setBirthYear(painter.getBirthYear());
        painterDto.setDeathYear(painter.getDeathYear());
        painterDto.setNationality(painter.getNationality());
        painterDto.setFamousWork(painter.getFamousWork());
        painterDto.setStyle(painter.getStyle());
        return painterDto;
    }
    public static Painter convertPainter(PainterDto painterDto)
    {
        Painter painter = new Painter();
        painter.setId(painterDto.getId());
        painter.setName(painterDto.getName());
        painter.setBirthYear(painterDto.getBirthYear());
        painter.setDeathYear(painterDto.getDeathYear());
        painter.setNationality(painterDto.getNationality());
        painter.setFamousWork(painterDto.getFamousWork());
        painter.setStyle(painterDto.getStyle());
        return painter;
    }
}
