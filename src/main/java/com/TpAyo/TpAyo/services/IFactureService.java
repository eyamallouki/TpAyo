package com.TpAyo.TpAyo.services;

import com.TpAyo.TpAyo.entities.Facture;

import java.util.List;

public interface IFactureService {
    List<Facture> getFacturesByClient(Long idClient);
}
