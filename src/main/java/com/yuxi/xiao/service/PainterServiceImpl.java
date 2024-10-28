package com.yuxi.xiao.service;

import com.yuxi.xiao.Response;
import com.yuxi.xiao.converter.PainterConverter;
import com.yuxi.xiao.dao.Painter;
import com.yuxi.xiao.dao.PainterRepo;
import com.yuxi.xiao.dto.PainterDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class PainterServiceImpl implements PainterService {

    @Autowired
    private PainterRepo painterRepo;

    @Override
    public PainterDto getPainterById(long id) {
        Painter painter = painterRepo.findById(id).orElseThrow(() -> new RuntimeException("Painter not found"));
        return PainterConverter.convertPainter(painter);
    }

    @Override
    public Long addNewPainter(PainterDto painterDto) {
        Painter painter = painterRepo.save(PainterConverter.convertPainter(painterDto));
        return painter.getId();
    }
    @Override
    public void deletePainterById(long id)
    {
        painterRepo.findById(id).orElseThrow(() -> new IllegalArgumentException("id" + id + "does not exit"));
        painterRepo.deleteById(id);
    }

    @Override
    @Transactional
    public PainterDto updatePainterById(long id, String name, Integer birthYear, Integer deathYear, String nationality, String famousWork, String style)
    {
        Painter painterInDB = painterRepo.findById(id).orElseThrow(() -> new IllegalArgumentException("id" + id + "does not exit"));
        if(StringUtils.hasLength(name) && !painterInDB.getName().equals(name))
        {
            painterInDB.setName(name);
        }
        if(birthYear!=null && !painterInDB.getBirthYear().equals(birthYear))
        {
            painterInDB.setBirthYear(birthYear);
        }
        if(deathYear!=null && !painterInDB.getDeathYear().equals(deathYear))
        {
            painterInDB.setDeathYear(deathYear);
        }
        if(StringUtils.hasLength(nationality) && !painterInDB.getNationality().equals(nationality))
        {
            painterInDB.setNationality(nationality);
        }
        if(StringUtils.hasLength(famousWork) && !painterInDB.getFamousWork().equals(famousWork))
        {
            painterInDB.setFamousWork(famousWork);
        }
        if(StringUtils.hasLength(style) && !painterInDB.getStyle().equals(style))
        {
            painterInDB.setStyle(style);
        }
        Painter dpainter = painterRepo.save(painterInDB);
        return PainterConverter.convertPainter(dpainter);
    }

}
