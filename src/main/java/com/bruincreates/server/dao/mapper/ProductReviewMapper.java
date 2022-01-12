package com.bruincreates.server.dao.mapper;

import com.bruincreates.server.dao.po.ProductReview;
import com.bruincreates.server.dao.po.ProductReviewExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ProductReviewMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_review
     *
     * @mbg.generated Tue Jan 11 20:52:43 PST 2022
     */
    int deleteByExample(ProductReviewExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_review
     *
     * @mbg.generated Tue Jan 11 20:52:43 PST 2022
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_review
     *
     * @mbg.generated Tue Jan 11 20:52:43 PST 2022
     */
    int insert(ProductReview record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_review
     *
     * @mbg.generated Tue Jan 11 20:52:43 PST 2022
     */
    int insertSelective(ProductReview record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_review
     *
     * @mbg.generated Tue Jan 11 20:52:43 PST 2022
     */
    List<ProductReview> selectByExample(ProductReviewExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_review
     *
     * @mbg.generated Tue Jan 11 20:52:43 PST 2022
     */
    ProductReview selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_review
     *
     * @mbg.generated Tue Jan 11 20:52:43 PST 2022
     */
    int updateByExampleSelective(@Param("record") ProductReview record, @Param("example") ProductReviewExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_review
     *
     * @mbg.generated Tue Jan 11 20:52:43 PST 2022
     */
    int updateByExample(@Param("record") ProductReview record, @Param("example") ProductReviewExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_review
     *
     * @mbg.generated Tue Jan 11 20:52:43 PST 2022
     */
    int updateByPrimaryKeySelective(ProductReview record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_review
     *
     * @mbg.generated Tue Jan 11 20:52:43 PST 2022
     */
    int updateByPrimaryKey(ProductReview record);
}