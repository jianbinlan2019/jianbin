package hust.cad.service.impl;

import hust.cad.domain.Acount;
import hust.cad.mapper.AcountMapper;
import hust.cad.service.AcountService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("acountService")
public class AcountServiceImpl implements AcountService {


    @Autowired
    private AcountMapper mapper;

    @Override
    public void save(Acount acount) {
        mapper.save(acount);
    }

    @Override
    public List<Acount> findAll() {
        return null;
    }
}
