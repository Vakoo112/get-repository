/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.api.test.api.v1.mapper;

import test.api.test.api.v1.mapper.model.CategoryDTO;
import test.api.test.domain.Category;

/**
 *
 * @author vako
 */

//@Mapper
public interface CategoryMapper {

    //CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);


    CategoryDTO categoryToCategoryDTO(Category category);
}
