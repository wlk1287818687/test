package xh.mybatis.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import xh.mybatis.bean.JoinNetBean;
import xh.mybatis.mapper.JoinNetMapper;
import xh.mybatis.tools.MoreDbTools;
import xh.mybatis.tools.MoreDbTools.DataSourceEnvironment;

public class JoinNetService {
	/**
	 * 查询基站环境监控实时状态
	 * @return
	 */
	public static List<JoinNetBean> selectAll(){
		SqlSession sqlSession =MoreDbTools.getSession(DataSourceEnvironment.slave);
		JoinNetMapper mapper = sqlSession.getMapper(JoinNetMapper.class);
		List<JoinNetBean> list=new ArrayList<JoinNetBean>();
		try {
			list = mapper.selectAll();
			sqlSession.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	/**
	 * 入网申请
	 * @param bean
	 * @return
	 */
	public static int insertNet(JoinNetBean bean){
		SqlSession sqlSession =MoreDbTools.getSession(DataSourceEnvironment.master);
		JoinNetMapper mapper = sqlSession.getMapper(JoinNetMapper.class);
		int result=0;
		try {
			result=mapper.insertNet(bean);
			sqlSession.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

}
