package com.example.doan.mapper;
import com.example.doan.entity.Product;
import org.springframework.stereotype.Component;

@Component
public interface ProductMapper {
    public static Product toDto(Product product) {
        if (product == null) {
            return null;
        }

        Product dto = new Product();
        dto.setId(product.getId());
        dto.setTitle(product.getTitle());
        dto.setImage(product.getImage());
        dto.setPrice(product.getPrice());
        dto.setStatus(product.getStatus());
        dto.setDescription(product.getDescription());
        dto.setIdCate(product.getIdCate());
        dto.setContent(product.getContent());
        dto.setName(product.getName());
        return dto;
    }

    public static Product toEntity(Product dto) {
        if (dto == null) {
            return null;
        }

        Product product = new Product();
        product.setId(dto.getId());
        product.setTitle(dto.getTitle());
        product.setImage(dto.getImage());
        product.setPrice(dto.getPrice());
        product.setStatus(dto.getStatus());
        product.setDescription(dto.getDescription());
        product.setIdCate(dto.getIdCate());
        product.setContent(dto.getContent());
        product.setName(dto.getName());
        return product;
    }
}
