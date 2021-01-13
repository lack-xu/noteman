package dao;

import entity.About;

/**
 * @Entity entity.About
 */
public interface AboutDao {
    /**
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * @mbg.generated
     */
    int insert(About record);

    /**
     * @mbg.generated
     */
    int insertSelective(About record);

    /**
     * @mbg.generated
     */
    About selectByPrimaryKey(Integer id);

    /**
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(About record);

    /**
     * @mbg.generated
     */
    int updateByPrimaryKey(About record);
}