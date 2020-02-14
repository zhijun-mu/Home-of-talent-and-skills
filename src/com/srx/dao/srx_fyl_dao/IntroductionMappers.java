package com.srx.dao.srx_fyl_dao;

import com.srx.model.srx_fyl_model.Introduction;
import com.srx.model.srx_fyl_model.IntroductionExample;
import com.srx.model.srx_fyl_model.Yh;
import com.srx.model.srx_fyl_model.Zj;
import com.srx.model.srx_fyl_model.video;
import com.srx.model.srx_fyl_model.zjdy;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IntroductionMappers {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table introduction
     *
     * @mbg.generated Wed Dec 04 15:08:46 CST 2019
     */
    long countByExample(IntroductionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table introduction
     *
     * @mbg.generated Wed Dec 04 15:08:46 CST 2019
     */
    int deleteByExample(IntroductionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table introduction
     *
     * @mbg.generated Wed Dec 04 15:08:46 CST 2019
     */
    int deleteByPrimaryKey(Integer sid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table introduction
     *
     * @mbg.generated Wed Dec 04 15:08:46 CST 2019
     */
  

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table introduction
     *
     * @mbg.generated Wed Dec 04 15:08:46 CST 2019
     */
    int insertSelective(Introduction record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table introduction
     *
     * @mbg.generated Wed Dec 04 15:08:46 CST 2019
     */
    List<Introduction> selectByExample(IntroductionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table introduction
     *
     * @mbg.generated Wed Dec 04 15:08:46 CST 2019
     */
    Introduction selectByPrimaryKey(Integer sid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table introduction
     *
     * @mbg.generated Wed Dec 04 15:08:46 CST 2019
     */
    int updateByExampleSelective(@Param("record") Introduction record, @Param("example") IntroductionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table introduction
     *
     * @mbg.generated Wed Dec 04 15:08:46 CST 2019
     */
    int updateByExample(@Param("record") Introduction record, @Param("example") IntroductionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table introduction
     *
     * @mbg.generated Wed Dec 04 15:08:46 CST 2019
     */
    int updateByPrimaryKeySelective(Introduction record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table introduction
     *
     * @mbg.generated Wed Dec 04 15:08:46 CST 2019
     */
    int updateByPrimaryKey(Introduction record);

    List<Introduction> selI();
    List<Introduction> selIzhuanjia(Integer iid);
    List<zjdy> selzjdy(Integer iid);

    List<zjdy> selzj(Integer i);
    List<zjdy> selzjtop(Integer i);
	int insertzjdy(zjdy z);
	List<Yh> selectAll();
	List<Yh> selectWhere(Integer iid);//new
	List<Yh> selectyh(Integer yhiid);//new
	int insert(Zj record);//new
	int insertV(video v);
}