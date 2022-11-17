package com.TpAyo.TpAyo.services;

import com.TpAyo.TpAyo.repositories.ProduitRepository;
import com.TpAyo.TpAyo.repositories.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.TpAyo.TpAyo.entities.Produit;
import com.TpAyo.TpAyo.entities.Stock;

import java.util.List;

@Service

public class StockServiceImp implements ICrudService<Stock , Long> , IStockService {
    @Autowired
    StockRepository stockRepository ;
    @Autowired
    ProduitRepository produitRepository ;
    @Override
    public List<Stock> getAll() {
        return stockRepository.findAll();
    }

    @Override
    public Stock add(Stock stock) {
        return stockRepository.save(stock);
    }

    @Override
    public Stock update(Stock stock  , Long idProduit) {
        if(stockRepository.findById(idProduit).isPresent()) {

            Stock stock1 = stockRepository.findById(idProduit).get();
            stock1.setQteStock(stock1.getQteStock());
            stock1.setQteMin(stock1.getQteMin());
            stock1.setLibelleStock(stock1.getLibelleStock());



            

            return stockRepository.save(stock1);
        }
        return  null;
    }

    @Override
    public void delete(Long idProduit) {
        stockRepository.deleteById(idProduit);

    }

    @Override
    public void assignProduitToStock(Long idProduit, Long idStock) {
        Stock stock = stockRepository.findById(idStock).get();
        //System.out.println(stock.getQteStock());
        Produit produit = produitRepository.findById(idProduit).get();
        //System.out.println(produit.getCodeProduit());
        produit.setStock(stock);
        stock.getProduits().add(produit);
        System.out.println(stock.getProduits());
        produitRepository.save(produit);
        stockRepository.save(stock);




    }
}
