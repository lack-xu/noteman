package dao;

import entity.Book;

/**
 * @Entity entity.Book
 */
public interface BookDao {
    /**
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * @mbg.generated
     */
    int insert(Book record);

    /**
     * @mbg.generated
     */
    int insertSelective(Book record);

    /**
     * @mbg.generated
     */
    Book selectByPrimaryKey(Integer id);

    /**
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Book record);

    /**
     * @mbg.generated
     */
    int updateByPrimaryKey(Book record);
}