package hust.cad.service;

import hust.cad.domain.Acount;

import java.util.List;

public interface AcountService {

    public void save(Acount acount);

    public List<Acount> findAll();
}
