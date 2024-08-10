package com.curso.di.factura.factura;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.curso.di.factura.factura.models.Item;
import com.curso.di.factura.factura.models.Product;

@Configuration
@PropertySource("classpath:data.properties")
public class AppConfig {

    @Bean
    List <Item> itemsInvoice(){
        Product product1 = new Product("Panel Solar", 200);
        Product product2 = new Product("Batería de Litio", 200);
        Product product3 = new Product("Inversor", 300);
        Product product4 = new Product("Controlador de Carga", 150); 
        Product product5 = new Product("Soporte para Panel Solar", 50); 
        Product product6 = new Product("Cableado Solar", 100); 
        Product product7 = new Product("Conectores MC4", 20);
        Product product8 = new Product("Fusibles y Disyuntores", 30); 
        Product product9 = new Product("Monitor de Batería", 100); 
        Product product10 = new Product("Cargador Solar Portátil", 80); 

        return Arrays.asList(
                new Item(product1, 1),
                new Item(product2, 7),
                new Item(product3, 1),
                new Item(product4, 1),
                new Item(product5, 1),
                new Item(product6, 1)
        
            );
    }

}
