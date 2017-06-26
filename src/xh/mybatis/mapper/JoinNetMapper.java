package xh.mybatis.mapper;

import java.util.List;

import xh.mybatis.bean.JoinNetBean;


public interface JoinNetMapper {
	/**
	 * 查询所有入网申请记录
	 * @return
	 * @throws Exception
	 */
	public List<JoinNetBean> selectAll()throws Exception;
	/**
	 * 入网申请
	 * @param bean
	 * @return
	 * @throws Exception
	 */
	public int insertNet(JoinNetBean bean)throws Exception;

}
