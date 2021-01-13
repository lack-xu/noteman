package github.lackxu.noteman.dao;

import github.lackxu.noteman.entity.Note;

/**
 * @Entity github.lackxu.noteman.entity.Note
 */
public interface NoteDao {
    /**
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * @mbg.generated
     */
    int insert(Note record);

    /**
     * @mbg.generated
     */
    int insertSelective(Note record);

    /**
     * @mbg.generated
     */
    Note selectByPrimaryKey(Long id);

    /**
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Note record);

    /**
     * @mbg.generated
     */
    int updateByPrimaryKey(Note record);
}