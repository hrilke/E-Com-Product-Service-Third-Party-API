package EComProductService.FakeStoreAPI.ThirdPartyAPICall.Model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
public class Cart extends BaseEntity{
    private User used;
    private Date date;
    private List<Product> productList;
}
/*
     {
                id:5,
                userId:1,
                date:...,
                products:[...]
            }
 */