package sw.study.user;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 * <p>标题：</p>
 * <p>功能：</p>
 * <p>
 * 其他说明：
 * </p>
 * <p>作者：冀小雷</p>
 * <p>审核：</p>
 * <p>重构：</p>
 * <p>创建日期：2018年3月16日上午10:15:42</p>
 * 查看帮助：<a href="" target="_blank"></a>
 */
public interface UserMapper
{
	@Select("SELECT * FROM test_users WHERE id = #{userId}")
	User getUser(@Param("userId") int userId);

	@Insert("INSERT INTO test_users (id,var00,var01,var02,var03,var04,var05,var06,var07,var08,var09)"
			+ " values (#{id},#{var00},#{var01},#{var02},#{var03},#{var04},#{var05},#{var06},#{var07},#{var08},#{var09})")
	void addUser(User user);

	@Delete("DELETE FROM test_users WHERE id = #{userId}")
	void deleteUser(@Param("userId") int userId);

	@Update("UPDATE test_users SET id=#{id},var00=#{var00},var01=#{var01},var02=#{var02},var03=#{var03},var04=#{var04},var05=#{var05}"
			+ ",var06=#{var06},var07=#{var07},var08=#{var08},var09=#{var09} where id=#{id}")
	void updateUser(User user);
}
