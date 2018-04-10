package com.imooc.sell.dataobject;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.DynamicUpdate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@DynamicUpdate
@Setter
@Getter
public class ProductCategory {

    /** 类目id. */
    @Id
    @GeneratedValue
    private Integer categoryId;

    /** 类目名字. */
    private String categoryName;

    /** 类目编号. */
    private Integer categoryType;

    public ProductCategory() {

    }

    public ProductCategory(String categoryName, Integer categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }

//    @Override
//    public String toString() {
//        return "ProductCategory{" +
//                "categoryId=" + categoryId +
//                ", categoryName='" + categoryName + '\'' +
//                ", categoryType=" + categoryType +
//                '}';
//    }
}
